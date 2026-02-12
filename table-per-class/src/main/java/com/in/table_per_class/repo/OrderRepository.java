package com.in.table_per_class.repo;

import com.in.table_per_class.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,String> {
}
