package edu.unasp.com.br.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_core_module")
public class ModuleModel {

	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "MODULE_ID" )
	@Column(name="id_module")
	private Integer idModule;
	private String name;
	@Column(name="presentation_sequence")
	private Integer presentationSequence;
	@Column(name="is_active")
	private Boolean isActivate;
	
	public Integer getId() {
		return idModule;
	}
	public void setId(Integer id) {
		this.idModule = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPresentationSequence() {
		return presentationSequence;
	}
	public void setPresentationSequence(Integer presentationSequence) {
		this.presentationSequence = presentationSequence;
	}
	public Boolean getActivate() {
		return isActivate;
	}
	public void setActivate(Boolean activate) {
		this.isActivate = activate;
	}
	@Override
	public String toString() {
		return "ModuleModel [idModule=" + idModule + ", name=" + name + ", presentationSequence=" + presentationSequence
				+ ", isActivate=" + isActivate + "]";
	}
}
