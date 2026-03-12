package com.spring.data.jpa.ex1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//in the following interface declaration, ProductRepository inherits various methods
//from JpaRepository a few example methods names, save() findById() findAll()
//we don't have to write down the code for a class that implements ProductRepository interface.

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

}
