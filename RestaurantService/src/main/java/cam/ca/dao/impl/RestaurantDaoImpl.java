package cam.ca.dao.impl;



import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import cam.ca.dao.RestaurantDao;
import cam.ca.domain.FoodMenu;
import cam.ca.domain.Restaurant;

@Repository
public class RestaurantDaoImpl extends GenericDaoImpl<Restaurant> implements RestaurantDao {

	public RestaurantDaoImpl() {

		super.setDaoType(Restaurant.class);
	}
	@SuppressWarnings("unchecked")
	public List<FoodMenu>showFoodMenu(Long restaurantId){
		
		Query query = entityManager
				//.createQuery("select r.foodMenu from Restaurant  r  " + "where food.RESTAURANT_ID =:resturantId");
				.createQuery("select Id,foodName,foodDescription,foodCatalog,foodPrice from FoodMenu WHERE RESTAURANT_ID =:resturantId");
		return (List<FoodMenu>) query.setParameter("resturantId", restaurantId).getResultList();

	}
	
}
