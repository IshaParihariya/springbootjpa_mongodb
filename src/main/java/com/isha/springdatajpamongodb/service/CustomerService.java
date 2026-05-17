package com.isha.springdatajpamongodb.service;

import com.isha.springdatajpamongodb.dto.CustomerDTO;
import com.isha.springdatajpamongodb.model.Customer;
import com.isha.springdatajpamongodb.repo.ICustomerRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements ICustomerService{

    @Autowired
    private ICustomerRepo repo;
    @Override
    public String registerCustomer(CustomerDTO dto) {
        //data saved in dto so from there copy and save in the db
        //Created empty Entity object.
        Customer cx=new Customer();
      //  Copied same field values from DTO → Entity.
        BeanUtils.copyProperties(dto,cx);
        //Saved customer into MongoDB.
        Customer cusDoc=repo.save(cx);
        return "customer detail saved with id "+ cusDoc.getId();
    }

    @Override
    public List<Customer> findAllCustomer() {
        return repo.findAll();
    }


    // deletion with Optional
    @Override
    public String removeDocument(String id )
    {
       Optional<Customer> optional= repo.findById(id);
       if(optional.isPresent())
       {
           repo.deleteById(id);
           return "record deleted with id "+id;
       }
       else
           return "unable to delete the record";
    }
}
