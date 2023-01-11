package cam.ca.service;

import java.util.List;

import cam.ca.domain.FoodMenu;
import cam.ca.domain.Restaurant;

public interface RestaurantService {
	public void save(Restaurant restaurant);
	public Restaurant update(Restaurant restaurant);
	public List<Restaurant> findAll();
	public Restaurant findOne(Long id);
	public List<FoodMenu>showFoodMenu(Long restaurantId);
}
