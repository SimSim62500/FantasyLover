package fr.formation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "joueur")
public class Joueur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "JOUEUR_ID")
	private int id;

	@Column(name = "JOEUR_NOM", nullable = false, length = 50)
	private String nom;

	@Column(name = "JOUEUR_PRENOM", nullable = false, length = 50)
	private String prenom;

	@Column(name = "JOUEUR_SEXE", nullable = false)
	private Sexe sexe;

	@Column(name = "JOUEUR_ORIENTATION_SEXUELLE", nullable = false)
	private OrientationSexuelle orientationSexuelle;

	@Column(name = "JOUEUR_JAUGE")
	private int jauge = 10; // MAX 150

	public Joueur(String nom, String prenom, Sexe sexe, OrientationSexuelle orientationSexuelle) {
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.orientationSexuelle = orientationSexuelle;
	}

	public Joueur() {

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

	public int getJauge() {
		return jauge;
	}

	public void setJauge(int jauge) {
		this.jauge = jauge;
	}
}
