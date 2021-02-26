package com.jtraining.day3.controller;

import com.jtraining.day3.business.Customer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MyFirstController
{
    private List<Customer> oCustomers = new ArrayList<>();
    public MyFirstController()
    {
        oCustomers.add(new Customer("1", "Meiser", "Klaus", 35, false));
        oCustomers.add(new Customer("2", "Schneider", "Sandra", 27, true));
        oCustomers.add(new Customer("3", "Schmidt", "Markud", 45, false));
    }

    @RequestMapping("/customers")
    public List<Customer>  index()
    {
        return oCustomers;
    }
}
