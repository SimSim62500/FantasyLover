package fr.formation.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "histoire")
public class Histoire {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "HIST_ID")
	private int id;

	@Column(name = "HIST_NARRATION", nullable = false, length = 100000)
	private String narration;

	@OneToMany(mappedBy = "histoire")
	private List<Reponse> reponses;

	@OneToMany(mappedBy = "histoireRedirigee")
	private List<Navigation> navigations;

	@ManyToOne
	@JoinColumn(name = "HIST_PERSONNAGE_ID")
	private Personnage personnage;

	@Column(name = "HIST_EXPRESSION")
	private Expression expression;

	@Column(name = "HIST_SEXE_JOUEUR")
	private Sexe sexeDuJoueur;

	public Histoire() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNarration() {
		return narration;
	}

	public void setNarration(String narration) {
		this.narration = narration;
	}

	public List<Reponse> getReponses() {
		return reponses;
	}

	public void setReponses(List<Reponse> reponses) {
		this.reponses = reponses;
	}

	public List<Navigation> getNavigations() {
		return navigations;
	}

	public void setNavigations(List<Navigation> navigations) {
		this.navigations = navigations;
	}

	public Expression getExpression() {
		return expression;
	}

	public void setExpression(Expression expression) {
		this.expression = expression;
	}

	public Personnage getPersonnage() {
		return personnage;
	}

	public void setPersonnage(Personnage personnage) {
		this.personnage = personnage;
	}

	public Sexe getSexeDuJoueur() {
		return sexeDuJoueur;
	}

	public void setSexeDuJoueur(Sexe sexeDuJoueur) {
		this.sexeDuJoueur = sexeDuJoueur;
	}

}
