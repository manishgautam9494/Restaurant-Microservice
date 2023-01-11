package cam.ca.service;



import cam.ca.domain.Order;

public interface OrderServiceAmqp {
	
	public void publish(Order order);

}
