package fr.formation.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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

	// perso à choisir, + l'expression qu'il doit avoir

	@OneToMany(mappedBy = "histoire")
	private List<Reponse> reponses;

	@OneToOne
	@JoinColumn(name = "HIST_NAVIGATION_ID")
	private Navigation navigation;

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

}
