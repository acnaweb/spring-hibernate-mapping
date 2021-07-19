package com.github.acnaweb.spring_hibernate_mapping.domain.invoice_item;

import com.github.acnaweb.spring_hibernate_mapping.domain.product.ProductRepository;
import java.math.BigDecimal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class InvoiceItemRepositoryTest {
	@Autowired
	private InvoiceItemRepository invoiceItemRepository;

	@Autowired
	private ProductRepository productRepository;

	@Test
	void givenAddProductWhenSaveThenExpectedOneItem() {
		// given
		var product = productRepository.findByItemId(8);

		var invoiceItem = new InvoiceItem();
		invoiceItem.setQuantity(new BigDecimal(15));
		invoiceItem.setUnitValue(new BigDecimal(10.5));
		invoiceItem.setProduct(product);

		// when
		invoiceItem = invoiceItemRepository.save(invoiceItem);

		// then
		Assertions.assertNotNull(invoiceItem.getId());
	}

}
