package com.thescribble.HateoasExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService implements IOrderService{

    IOrderRepository iOrderRepository;

    @Autowired
    public OrderService(IOrderRepository iOrderRepository) {
        this.iOrderRepository = iOrderRepository;
    }

    @Override
    public Order getOrder(String id) {
       return iOrderRepository.findById(Long.valueOf(id)).get();
    }

    @Override
    public Order createOrder(Order order) {
        return iOrderRepository.save(order);
    }

    @Override
    public Order updateOrder(Order order, String id) {
        return iOrderRepository.save(order);
    }

    @Override
    public void deleteOrder(String orderID) {
        iOrderRepository.delete(getOrder(orderID));

    }
}
