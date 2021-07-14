package com.github.acnaweb.spring_hibernate_mapping.domain.product;

import com.github.acnaweb.spring_hibernate_mapping.domain.list_of_value.ListOfValue;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("1")
public class Product extends ListOfValue {

}
