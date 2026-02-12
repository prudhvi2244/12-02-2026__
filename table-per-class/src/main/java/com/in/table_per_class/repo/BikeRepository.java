package com.in.table_per_class.repo;

import com.in.table_per_class.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeRepository extends JpaRepository<Vehicle,Long> {
}
