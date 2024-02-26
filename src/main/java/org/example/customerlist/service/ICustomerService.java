package org.example.customerlist.service;

import org.example.customerlist.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> getAll();

    Customer findOne(Integer id);
}
