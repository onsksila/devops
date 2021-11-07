package tn.esprit.spring.dto;

import java.util.Date;

import tn.esprit.spring.entities.Employe;

public class ContractDTO {


	private int reference;
	
	
	private Date dateDebut;
	
	private String typeContrat;
	
	private float salaire;
	

	private Employe employe;


	public int getReference() {
		return reference;
	}


	public Date getDateDebut() {
		return dateDebut;
	}


	public String getTypeContrat() {
		return typeContrat;
	}


	public float getSalaire() {
		return salaire;
	}


	public Employe getEmploye() {
		return employe;
	}


	public void setReference(int reference) {
		this.reference = reference;
	}


	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}


	public void setTypeContrat(String typeContrat) {
		this.typeContrat = typeContrat;
	}


	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}


	public void setEmploye(Employe employe) {
		this.employe = employe;
	}


	public ContractDTO(Date dateDebut, String typeContrat, float salaire, Employe employe) {
		super();
		this.dateDebut = dateDebut;
		this.typeContrat = typeContrat;
		this.salaire = salaire;
		this.employe = employe;
	}
	
	
	
	
}
