package com.github.acnaweb.spring_hibernate_mapping.domain.invoice_item;

import com.github.acnaweb.spring_hibernate_mapping.domain.product.Product;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class InvoiceItem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7552793957272926389L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
	private Long id;
	@ManyToOne
	private Product product;
	private BigDecimal quantity;
	private BigDecimal unitValue;
}
