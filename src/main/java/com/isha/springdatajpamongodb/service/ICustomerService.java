package com.isha.springdatajpamongodb.service;

import com.isha.springdatajpamongodb.model.Customer;

import java.util.List;
import com.isha.springdatajpamongodb.dto.CustomerDTO;

public interface ICustomerService
{
    public String registerCustomer(CustomerDTO dto);

    public List<Customer> findAllCustomer();

    // deletion
    public String removeDocument(String id);
}
