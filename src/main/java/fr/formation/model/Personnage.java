package fr.formation.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "personnage")
public class Personnage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PERS_ID")
	private int id;

	@Column(name = "PERS_NOM", length = 50, nullable = false)
	private String nom;

	@Column(name = "PERS_PRENOM", length = 50, nullable = false)
	private String prenom;

	@Column(name = "PERS_SEXE", nullable = false)
	@Enumerated(EnumType.ORDINAL)
	private Sexe sexe;

	@Column(name = "PERS_ORIENTATION_SEXUELLE", nullable = false)
	@Enumerated(EnumType.ORDINAL)
	private OrientationSexuelle orientationSexuelle;

	@OneToMany(mappedBy = "personnage")
	private List<Histoire> histoires;

	public Personnage() {

	}

	public Personnage(String nom, String prenom, Sexe sexe, OrientationSexuelle orientationSexuelle) {
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.orientationSexuelle = orientationSexuelle;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Sexe getSexe() {
		return sexe;
	}

	public void setSexe(Sexe sexe) {
		this.sexe = sexe;
	}

	public OrientationSexuelle getOrientationSexuelle() {
		return orientationSexuelle;
	}

	public void setOrientationSexuelle(OrientationSexuelle orientationSexuelle) {
		this.orientationSexuelle = orientationSexuelle;
	}

	public List<Histoire> getHistoires() {
		return histoires;
	}

	public void setHistoires(List<Histoire> histoires) {
		this.histoires = histoires;
	}

}
