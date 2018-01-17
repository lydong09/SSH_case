package com.dong.serviceImpl;

import com.dong.dao.CustomerDao;
import com.dong.domain.Customer;
import com.dong.service.CustomerService;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class CustomerServiceImpl implements CustomerService {
    private CustomerDao customerDao;

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public void save(Customer customer) {
        System.out.println("交给sping的service层保存客户");
        System.out.println(customer);

        customerDao.save(customer);
    }
}
