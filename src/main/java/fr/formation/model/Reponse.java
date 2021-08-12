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
@Table(name = "reponse")
public class Reponse {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "REP_ID")
	private int id;

	@Column(name = "REP_CHOIX", nullable = false)
	private String choix;

	@ManyToOne
	@JoinColumn(name = "REP_HISTOIRE_ID", nullable = false)
	private Histoire histoire;

	@OneToMany(mappedBy = "choixEffectue")
	private List<Navigation> navigations;

	public Reponse() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getChoix() {
		return choix;
	}

	public void setChoix(String choix) {
		this.choix = choix;
	}

	public Histoire getHistoire() {
		return histoire;
	}

	public void setHistoire(Histoire histoire) {
		this.histoire = histoire;
	}

}
