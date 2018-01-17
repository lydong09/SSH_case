package com.dong.web.action;

import com.dong.domain.Customer;
import com.dong.service.CustomerService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CustomerAction extends ActionSupport implements ModelDriven<Customer>{

    private Customer customer = new Customer();
    private CustomerService customerService;


    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public Customer getModel() {

        return customer;
    }

    public String add(){

        System.out.println("这是case1的位置");
        System.out.println("保存客户");


        customerService.save(customer);

        return NONE;
    }



}
