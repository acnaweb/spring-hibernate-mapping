package com.github.acnaweb.spring_hibernate_mapping.domain.product;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class ProductRepositoryTest {

	@Autowired
	private ProductRepository repository;

	@Test
	void givenCountThenExpectedThree() {
		// when
		var count = repository.count();

		// then
		Assertions.assertEquals(3, count);
	}

}
