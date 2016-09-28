package edu.unasp.com.br.models;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class OrderModel {

	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "MODULE_ID" )
	private Integer idOrder;
	@OneToMany
	private List<ProductModel> productModels;
}
