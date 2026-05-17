package com.isha.springdatajpamongodb;

import com.isha.springdatajpamongodb.dto.CustomerDTO;
import com.isha.springdatajpamongodb.service.CustomerService;
import com.isha.springdatajpamongodb.service.ICustomerService;
import com.isha.springdatajpamongodb.utils.IdGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDataJpaMongoDbApplication {

    public static void main(String[] args) {


        ConfigurableApplicationContext container= SpringApplication.run(SpringDataJpaMongoDbApplication.class, args);

        ICustomerService iCustomerService=container.getBean(ICustomerService.class);


        //DTO
       // CustomerDTO dto=new CustomerDTO(2,"Mohit","Bengaluru");
       // String status=iCustomerService.registerCustomer(dto);
        //System.out.println(status);


        // custom id generation
        CustomerDTO dto=new CustomerDTO();
        dto.setId(IdGenerator.generateId());
        dto.setCustNo(3);
        dto.setName("Kunal");
        dto.setCity("Suart");
        String status=iCustomerService.registerCustomer(dto);
        System.out.println(status);

        //findAll
            iCustomerService.findAllCustomer().forEach(v->System.out.println(v));

            // deletion
      String deletionStatus=  iCustomerService.removeDocument("6a09e88116994bce0055994e");
        System.out.println(deletionStatus);
    }

}
