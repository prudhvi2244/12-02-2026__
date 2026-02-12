package com.in.controller;

import com.in.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/lpu")
public class HomeController {

    @GetMapping
    public String getHomePage(Model model){
        Employee employee=new Employee(1,"Prudhvi","Hyderabad");
        model.addAttribute("emp",employee);
        return "home";
    }


    @GetMapping("/employees")
    public String getAllEmployees(Model model){

        Employee e1=new Employee(1,"Prudhvi","Hyderabad");
        Employee e2=new Employee(2,"Praveen","Hyderabad");
        Employee e3=new Employee(3,"Raj","Vizag");
        Employee e4=new Employee(4,"Raj","Vizag");

        List<Employee> employeesList=new ArrayList<>();
        employeesList.add(e1);
        employeesList.add(e2);
        employeesList.add(e3);
        employeesList.add(e4);

        model.addAttribute("employees",employeesList);
        return "employees";

    }

}
