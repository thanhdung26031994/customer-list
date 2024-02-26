package org.example.customerlist.controller;

import org.example.customerlist.model.Customer;
import org.example.customerlist.service.CustomerService;
import org.example.customerlist.service.ICustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CustomerController {
    private static final ICustomerService customerService = new CustomerService();
    @GetMapping("/customers")
    public String showList(Model model) {
        List<Customer> customerList = customerService.getAll();
        model.addAttribute("customer", customerList);
        return "list";
    }

    @GetMapping("/dskh")
    public ModelAndView showList(){
        ModelAndView modelAndView = new ModelAndView("list");
        List<Customer> customerList = customerService.getAll();
        modelAndView.addObject("customer", customerList);
        return modelAndView;
    }
    @GetMapping("/customers/{id}")
    public ModelAndView showInformation(@PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView("info");
        Customer customer = customerService.findOne(id);
        modelAndView.addObject("customer", customer);
        return modelAndView;
    }
}
