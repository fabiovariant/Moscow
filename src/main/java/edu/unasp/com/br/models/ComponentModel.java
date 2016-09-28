package edu.unasp.com.br.models;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_core_product_model")
public class ComponentModel {

	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "PROD_ID" )
	@Column(name="id_component")
	private Integer idComponent;
	private String name;
	private BigDecimal price;
	@OneToMany(mappedBy = "idModule", targetEntity = ModuleModel.class, fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
	@JoinColumn(name="id_module")
	private ModuleModel module;
	private String description;
	private Long stockQtde;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<ComponentModel> componentsApplicables = new HashSet<ComponentModel>();
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy="componentsApplicables")
	private Set<ComponentModel> compomentCompatibles = new HashSet<ComponentModel>();
	
	public Integer getId() {
		return idComponent;
	}
	public void setId(Integer id) {
		this.idComponent = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public ModuleModel getModule() {
		return module;
	}
	public void setModule(ModuleModel module) {
		this.module = module;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getStockQtde() {
		return stockQtde;
	}
	public void setStockQtde(Long stockQtde) {
		this.stockQtde = stockQtde;
	}
	public Integer getIdComponent() {
		return idComponent;
	}
	public void setIdComponent(Integer idComponent) {
		this.idComponent = idComponent;
	}
	public Set<ComponentModel> getComponentsApplicables() {
		return componentsApplicables;
	}
	public void setComponentsApplicables(Set<ComponentModel> componentsApplicables) {
		this.componentsApplicables = componentsApplicables;
	}
	public Set<ComponentModel> getCompomentCompatibles() {
		return compomentCompatibles;
	}
	public void setCompomentCompatibles(Set<ComponentModel> compomentCompatibles) {
		this.compomentCompatibles = compomentCompatibles;
	}
	@Override
	public String toString() {
		return "ComponentModel [idComponent=" + idComponent + ", name=" + name + ", price=" + price + ", module="
				+ module + ", description=" + description + ", stockQtde=" + stockQtde + ", componentsApplicables="
				+ componentsApplicables + ", compomentCompatibles=" + compomentCompatibles + "]";
	}
}
