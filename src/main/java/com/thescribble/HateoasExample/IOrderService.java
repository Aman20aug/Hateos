package com.thescribble.HateoasExample;

public interface IOrderService {

    public Order getOrder(String id);
    public Order createOrder(Order order);
    public Order updateOrder(Order order,String id);
    public void deleteOrder(String orderID);
}
