package com.in.table_per_class.repo;

import com.in.table_per_class.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,Long> {
}
