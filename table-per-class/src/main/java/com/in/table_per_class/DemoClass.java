package com.in.table_per_class;

import com.in.table_per_class.entity.Bike;
import com.in.table_per_class.entity.Order;
import com.in.table_per_class.repo.BikeRepository;
import com.in.table_per_class.repo.CarRepository;
import com.in.table_per_class.repo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoClass implements CommandLineRunner {

    @Autowired
    private BikeRepository bikeRepository;

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {

        Order order=new Order("Iphone-17",4);
        orderRepository.save(order);

    }
}
