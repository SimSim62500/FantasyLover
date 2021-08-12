package fr.formation.insert;

import fr.formation.dao.IHistoireDao;
import fr.formation.dao.IReponseDao;
import fr.formation.dao.jpa.AbstractDaoJpa;
import fr.formation.dao.jpa.HistoireDaoJpa;
import fr.formation.dao.jpa.ReponseDaoJpa;
import fr.formation.model.Histoire;
import fr.formation.model.Reponse;

public class InsertReponseJpaDao {

	public static void main(String[] args) {
		IReponseDao daoReponse = new ReponseDaoJpa();
		insertReponse(daoReponse);
		AbstractDaoJpa.close();
	}

	public static void insertReponse(IReponseDao daoReponse) {
		Reponse maReponse = new Reponse();
		maReponse.setChoix("");
		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monhistoire = daoHistoire.findById(1);
		maReponse.setHistoire(monhistoire);
		AbstractDaoJpa.close();
		daoReponse.save(maReponse);
	}

}
