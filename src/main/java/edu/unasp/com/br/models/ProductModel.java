package edu.unasp.com.br.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_core_final_product")
public class ProductModel {
	
	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "MODULE_ID" )
	private Integer idProduct;
	@OneToMany
	private List<ComponentModel> componentModels;

	public Integer getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(Integer idProduct) {
		this.idProduct = idProduct;
	}
	public List<ComponentModel> getComponentModels() {
		return componentModels;
	}
	public void setComponentModels(List<ComponentModel> componentModels) {
		this.componentModels = componentModels;
	}
}
