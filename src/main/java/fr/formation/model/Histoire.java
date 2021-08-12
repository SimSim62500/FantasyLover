package fr.formation.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "histoire")
public class Histoire {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "HIST_ID")
	private int id;

	@Column(name = "HIST_NARRATION", nullable = false)
	private String narration;

	@OneToMany(mappedBy = "histoire")
	private List<Reponse> reponses;

	@OneToMany(mappedBy = "histoireRedirigee")
	private List<Navigation> navigations;

	@ManyToMany(mappedBy = "histoires")
	private List<Personnage> personnages;

	@Column(name = "expression")
	private Expression expression;

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

	public List<Personnage> getPersonnages() {
		return personnages;
	}

	public void setPersonnages(List<Personnage> personnages) {
		this.personnages = personnages;
	}

	public Expression getExpression() {
		return expression;
	}

	public void setExpression(Expression expression) {
		this.expression = expression;
	}

}
