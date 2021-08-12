package fr.formation.insert;

import fr.formation.dao.IHistoireDao;
import fr.formation.dao.jpa.AbstractDaoJpa;
import fr.formation.dao.jpa.HistoireDaoJpa;
import fr.formation.model.Histoire;

public class InsertHistoireJpaDao {

	public static void main(String[] args) {
		IHistoireDao daoHistoire = new HistoireDaoJpa();
		insertHistoire(daoHistoire);
		AbstractDaoJpa.close();
	}

	public static void insertHistoire(IHistoireDao daoHistoire) {
		Histoire monHistoire = new Histoire();
		monHistoire.setNarration("Ton texte $joueur$");
		"monTexte".replace("$joueur$", "le nom du joueur");
		daoHistoire.insert(monHistoire);
	}

}
