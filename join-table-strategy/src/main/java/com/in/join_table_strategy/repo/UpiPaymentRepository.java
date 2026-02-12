package com.in.join_table_strategy.repo;

import com.in.join_table_strategy.entity.UPIPayment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UpiPaymentRepository extends JpaRepository<UPIPayment,Long> {
}
