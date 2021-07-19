package com.github.acnaweb.spring_hibernate_mapping.domain.list_of_value;

public interface ListOfValueRepository<T> {
	T findByItemId(Integer itemId);
}
