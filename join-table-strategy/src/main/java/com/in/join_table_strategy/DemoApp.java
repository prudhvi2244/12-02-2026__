package com.in.join_table_strategy;

import com.in.join_table_strategy.entity.CreditCardPayment;
import com.in.join_table_strategy.entity.UPIPayment;
import com.in.join_table_strategy.repo.CreditCardPaymentRepository;
import com.in.join_table_strategy.repo.UpiPaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoApp implements CommandLineRunner {

    @Autowired // Field Injection
    private CreditCardPaymentRepository creditCardPaymentRepository;

    @Autowired // Field Injection
    private UpiPaymentRepository upiPaymentRepository;

    @Override
    public void run(String... args) throws Exception {

       // CreditCardPayment creditCardPayment=new CreditCardPayment(70000.477,12459814628945l,"2035/11",456);
       // creditCardPaymentRepository.save(creditCardPayment);

        UPIPayment upiPayment=new UPIPayment("9754312345@ybl","Prudhvi",80909.2333);
        upiPaymentRepository.save(upiPayment);

    }
}
