package com.example.Ecommerce.platform.Repositories;

import com.example.Ecommerce.platform.Models.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CustomerRepository {
    @Query(value = "SELECT s from Customer c")
    List<Customer> getAllCustomer();
@Query(value = "Select from Customer c where c.id= CustomerID")
    Customer getCustomerById(@Param("CustomerID") Integer id);
    @Query(value = "Select from Customer c where c.name= CustomerName")
    Customer getCustomerByName(@Param("CustomerName") String CustomerName);
    @Query(value = "Select from Customer c where c.phoneNumber= phoneNumber")
    Customer getCustomerByphoneNumber(@Param("phoneNumber") Integer phoneNumber);
    @Query(value = "Select from Customer c where c.customerAddress= customerAddress")
    Customer getCustomerBycustomerAddress(@Param("customerAddress") String customerAddress);
    @Query(value = "SELECT s from School s where c.isActive = true")
    List<Customer> getAllActiveSchools();


}
