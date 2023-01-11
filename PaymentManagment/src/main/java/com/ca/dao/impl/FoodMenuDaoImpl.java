package com.ca.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.ca.dao.FoodMenuDao;
import com.ca.domain.CreditCard;

@Repository
public class FoodMenuDaoImpl extends GenericDaoImpl<CreditCard> implements FoodMenuDao {
	public FoodMenuDaoImpl() {
		super.setDaoType(CreditCard.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CreditCard> findAllMenuByResturantID(Long resturantId) {

		Query query = entityManager
				.createQuery("select food from FoodMenu  food  " + "where food.resturantId =:resturantId");
		return (List<CreditCard>) query.setParameter("resturantId", resturantId).getResultList();

	}

}
