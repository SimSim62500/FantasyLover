package fr.formation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "navigation")
public class Navigation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "NAV_ID")
	private int id;

	@ManyToOne
	@JoinColumn(name = "NAV_HISTOIRE_REDIRIGEE_ID")
	private Histoire histoireRedirigee;

	@ManyToOne
	@JoinColumn(name = "NAV_CHOIX_EFFECTUE")
	private Reponse choixEffectue;

	@Column(name = "NAV_SEXE")
	private Sexe sexe;

	@Column(name = "NAV_ORIENTATION_SEXUELLE")
	private OrientationSexuelle orientationSexelle;

	public Navigation() {

	}

	public Histoire getHistoireRedirigee() {
		return histoireRedirigee;
	}

	public void setHistoireRedirigee(Histoire histoireRedirigee) {
		this.histoireRedirigee = histoireRedirigee;
	}

	public Reponse getChoixEffectue() {
		return choixEffectue;
	}

	public void setChoixEffectue(Reponse choixEffectue) {
		this.choixEffectue = choixEffectue;
	}

	public Sexe getSexe() {
		return sexe;
	}

	public void setSexe(Sexe sexe) {
		this.sexe = sexe;
	}

	public OrientationSexuelle getOrientationSexelle() {
		return orientationSexelle;
	}

	public void setOrientationSexelle(OrientationSexuelle orientationSexelle) {
		this.orientationSexelle = orientationSexelle;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
