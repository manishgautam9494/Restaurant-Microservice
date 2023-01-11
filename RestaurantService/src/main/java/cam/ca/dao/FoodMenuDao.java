package cam.ca.dao;

import java.util.List;

import cam.ca.domain.FoodMenu;

public interface FoodMenuDao extends GenericDao<FoodMenu>{

	public List<FoodMenu >findAllMenuByResturantID(Long resturantId);
	

}
