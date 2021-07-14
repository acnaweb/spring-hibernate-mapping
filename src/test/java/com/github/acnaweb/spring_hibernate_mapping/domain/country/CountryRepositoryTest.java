package com.github.acnaweb.spring_hibernate_mapping.domain.country;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class CountryRepositoryTest {

	@Autowired
	private CountryRepository repository;

	@Test
	void givenCountThenExpectedFour() {
		// when
		var count = repository.count();

		// then
		Assertions.assertEquals(4, count);
	}

}
