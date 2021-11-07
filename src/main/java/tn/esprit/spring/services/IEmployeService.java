package tn.esprit.spring.services;



import java.util.Date;
import java.util.List;

import tn.esprit.spring.entities.Contrat;
import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.entities.Mission;
import tn.esprit.spring.entities.Timesheet;




public interface IEmployeService {
	
	////debut yasmine
	public Employe mettreAjourEmailByEmployeId(String email, int employeId);//yas+
	public boolean desaffecterEmployeDuDepartement(int employeId, int depId);//yas
	public int ajouterContrat(Contrat contrat);//yas+
	public boolean affecterContratAEmploye(int contratId, int employeId);//yas+
	public boolean deleteContratById(int contratId);//yas+
	public int getNombreEmployeJPQL();//yas+
	public List<Employe> getAllEmployeByEntreprise(Entreprise entreprise);//yas+
	public boolean deleteAllContratJPQL();//yas+
	public Double getSalaireMoyenByDepartementId(int departementId);//+yas
	/////// fin yasmine
	
	///////debut ons
	public int ajouterEmploye(Employe employe);//ons
	public boolean affecterEmployeADepartement(int employeId, int depId);//ons
	public String getEmployePrenomById(int employeId);//ons
	public boolean deleteEmployeById(int employeId);//ons
	public List<String> getAllEmployeNamesJPQL();//ons
	public boolean mettreAjourEmailByEmployeIdJPQL(String email, int employeId);//ons
	public float getSalaireByEmployeIdJPQL(int employeId);//ons
	public List<Employe> getAllEmployes();//ons
	public List<Timesheet> getTimesheetsByMissionAndDate(Employe employe, Mission mission, Date dateDebut, Date dateFin);//ons
	public Employe getEmployeById(String id);
	
	////// fin ons
	

	
}
