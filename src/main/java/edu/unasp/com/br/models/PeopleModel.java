package edu.unasp.com.br.models;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import edu.unasp.com.br.models.enuns.DocumentType;

@Entity
@Table(name="tb_core_people")
@Inheritance( strategy = InheritanceType.SINGLE_TABLE )
@DiscriminatorColumn( name="type" )
public class PeopleModel {

	private String name;
	@Enumerated(EnumType.STRING)
	private DocumentType documentType;
	private String document;
	private String email;
	private String phone;
	
	public PeopleModel(String name, DocumentType documentType, String document, String email, String phone) {
		super();
		this.name = name;
		this.documentType = documentType;
		this.document = document;
		this.email = email;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public DocumentType getDocumentType() {
		return documentType;
	}
	public void setDocumentType(DocumentType documentType) {
		this.documentType = documentType;
	}
	public String getDocument() {
		return document;
	}
	public void setDocument(String document) {
		this.document = document;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "PeopleModel [name=" + name + ", documentType=" + documentType + ", document=" + document + ", email="
				+ email + ", phone=" + phone + "]";
	}
}
