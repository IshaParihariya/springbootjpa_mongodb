package com.isha.springdatajpamongodb.repo;

import com.isha.springdatajpamongodb.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ICustomerRepo extends MongoRepository<Customer,String>
{
}
