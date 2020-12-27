package org.example.jsp;

import org.example.jsp.Entity.Order;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface OrderService {

    public List<Order> orders();

    public void addOrder(Order order);

    public void deleteOrder(Long id);

    public Order getOrderById(Long id);

}
