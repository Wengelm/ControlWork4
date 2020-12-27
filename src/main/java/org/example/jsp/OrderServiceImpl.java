package org.example.jsp;

import org.example.jsp.Entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class OrderServiceImpl implements OrderService{
@Autowired
OrderRepository orderRepository;

    @Override
    public List<Order> orders() {
        List<Order> list = new ArrayList();
        orderRepository.findAll().forEach(list::add);
        return list;

    }

    @Override
    public void addOrder(Order order) {
       orderRepository.save(order);
    }


    @Override
    public void deleteOrder(Long id) {
        orderRepository.delete(id);
    }

    @Override
    public Order getOrderById(Long id) {
        return orderRepository.findOne(id);
    }
}
