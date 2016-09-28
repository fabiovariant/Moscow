package edu.unasp.com.br.models;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import edu.unasp.com.br.models.enuns.Departament;
import edu.unasp.com.br.models.enuns.DocumentType;

@Entity
@DiscriminatorValue(value = "EM")
public class EmployeeModel extends PeopleModel {

	@Enumerated(EnumType.STRING)
	private Departament departament;

	public EmployeeModel(String name, DocumentType documentType, String document,
			String email, String phone, Departament departament) {
		super(name, documentType, document, email, phone);
		this.departament = departament;
	}

	public Departament getDepartament() {
		return departament;
	}

	public void setDepartament(Departament departament) {
		this.departament = departament;
	}
	
}
