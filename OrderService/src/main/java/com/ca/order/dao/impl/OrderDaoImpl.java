package com.ca.order.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.ca.order.dao.OrderDao;
import com.ca.order.domain.Order;

@Repository
public class OrderDaoImpl extends GenericDaoImpl<Order> implements OrderDao {
	@PersistenceContext
	protected EntityManager entityManager;

	public OrderDaoImpl() {
		super.setDaoType(Order.class);
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Order> findOneByUserId(Long userId) {
		System.out.println(userId);
		Query query = entityManager.createQuery("select r from  Order  r  " + "where r.userName =:userId");
		return (List<Order>) query.setParameter("userId", userId).getResultList();
	}

	public List<Order> findAllSubSelect() {
		// hydrate since LAZY load
		List<Order> orders = (List<Order>) this.findAll();
		orders.get(0).getFoodItem().get(0);

		return orders;

	}

}
