package cam.ca.dao;



import java.util.List;

import cam.ca.domain.FoodMenu;
import cam.ca.domain.Restaurant;

public interface RestaurantDao extends GenericDao<Restaurant> {
	
	public List<FoodMenu>showFoodMenu(Long restaurantId);
}
