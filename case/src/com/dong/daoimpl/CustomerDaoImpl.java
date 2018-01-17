package com.dong.daoimpl;

import com.dong.dao.CustomerDao;
import com.dong.domain.Customer;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;


public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {


    @Override
    public void save(Customer customer) {
        System.out.println(customer);
        System.out.println("这是dao层");
        this.getHibernateTemplate().save(customer);
    }
}
