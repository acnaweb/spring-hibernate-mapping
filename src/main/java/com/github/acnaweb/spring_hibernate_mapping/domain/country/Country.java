package com.github.acnaweb.spring_hibernate_mapping.domain.country;

import com.github.acnaweb.spring_hibernate_mapping.domain.list_of_value.ListOfValue;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("2")
public class Country extends ListOfValue {

}
