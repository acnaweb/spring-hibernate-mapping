package com.github.acnaweb.spring_hibernate_mapping.domain.product;

import com.github.acnaweb.spring_hibernate_mapping.domain.list_of_value.ListOfValueRepository;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long>, ListOfValueRepository<Product> {

}
