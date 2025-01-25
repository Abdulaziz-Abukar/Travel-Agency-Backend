package com.example.demo.BootStrapData;


import com.example.demo.dao.CustomerRepository;
import com.example.demo.dao.DivisionRepository;
import com.example.demo.entities.Customer;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class BootStrapData {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private DivisionRepository divisionRepository;

    @PostConstruct
    public void loadInitialData() {

        if (customerRepository.count() == 1) {

            Customer customerOne = new Customer();
            customerOne.setFirstName("Yuusuf");
            customerOne.setLastName("Emin");
            customerOne.setPostal_code("23453");
            customerOne.setAddress("24 Yung St NE");
            customerOne.setPhone("(403)454-2354");
            customerOne.setDivision(divisionRepository.findAll().get(1));
            customerOne.setCreate_date(new Date());
            customerOne.setLast_update(new Date());

            Customer customerTwo = new Customer();
            customerTwo.setFirstName("Antonio");
            customerTwo.setLastName("Alexis");
            customerTwo.setPostal_code("56432");
            customerTwo.setAddress("13 Dundas St SW");
            customerTwo.setPhone("(403)653-2244");
            customerTwo.setDivision(divisionRepository.findAll().get(2));
            customerTwo.setCreate_date(new Date());
            customerTwo.setLast_update(new Date());

            Customer customerThree = new Customer();
            customerThree.setFirstName("Matt");
            customerThree.setLastName("Slaunwhite");
            customerThree.setPostal_code("16574");
            customerThree.setAddress("29 Harbor St SE");
            customerThree.setPhone("(403)553-9678");
            customerThree.setDivision(divisionRepository.findAll().get(3));
            customerThree.setCreate_date(new Date());
            customerThree.setLast_update(new Date());

            Customer customerFour = new Customer();
            customerFour.setFirstName("Hassan");
            customerFour.setLastName("Kaderi");
            customerFour.setPostal_code("22436");
            customerFour.setAddress("6 Main St NW");
            customerFour.setPhone("(403)579-1211");
            customerFour.setDivision(divisionRepository.findAll().get(4));
            customerFour.setCreate_date(new Date());
            customerFour.setLast_update(new Date());

            Customer customerFive = new Customer();
            customerFive.setFirstName("Mike");
            customerFive.setLastName("Wojy");
            customerFive.setPostal_code("98473");
            customerFive.setAddress("29 Country St NW");
            customerFive.setPhone("(403)448-9964");
            customerFive.setDivision(divisionRepository.findAll().get(5));
            customerFive.setCreate_date(new Date());
            customerFive.setLast_update(new Date());

            customerRepository.save(customerOne);
            customerRepository.save(customerTwo);
            customerRepository.save(customerThree);
            customerRepository.save(customerFour);
            customerRepository.save(customerFive);

            System.out.println("Sample customers added!");
        } else {
            System.out.println("Sample customers already exist!");
        }
    }
}
