package org.example.customerlist.service;

import org.example.customerlist.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService implements ICustomerService{
    private static List<Customer> customerList = new ArrayList<>();
    static {
        customerList.add(new Customer(1, "Huỳnh Dụng", "huynhdung@gmail.com", "Quảng Ngãi"));
        customerList.add(new Customer(2, "Đăng Pháp", "dangphap@gmail.com", "Quảng Bình"));
    }
    @Override
    public List<Customer> getAll() {
        return customerList;
    }

    @Override
    public Customer findOne(Integer id) {
        return customerList.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
