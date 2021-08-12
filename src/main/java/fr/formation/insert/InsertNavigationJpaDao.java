package fr.formation.insert;

import fr.formation.dao.IHistoireDao;
import fr.formation.dao.INavigationDao;
import fr.formation.dao.IReponseDao;
import fr.formation.dao.jpa.AbstractDaoJpa;
import fr.formation.dao.jpa.HistoireDaoJpa;
import fr.formation.dao.jpa.NavigationDaoJpa;
import fr.formation.dao.jpa.ReponseDaoJpa;
import fr.formation.model.Histoire;
import fr.formation.model.Navigation;
import fr.formation.model.OrientationSexuelle;
import fr.formation.model.Reponse;
import fr.formation.model.Sexe;

public class InsertNavigationJpaDao {

	public static void main(String[] args) {
		INavigationDao daoNavigation = new NavigationDaoJpa();
		insertNavigation(daoNavigation);
		AbstractDaoJpa.close();

	}

	public static void insertNavigation(INavigationDao daoNavigation) {
		Navigation maNavigation = new Navigation();

		IReponseDao daoReponse = new ReponseDaoJpa();
		Reponse maReponse = daoReponse.findById(1);
		maNavigation.setChoixEffectue(maReponse);

		IHistoireDao daoHistoire = new HistoireDaoJpa();
		Histoire monHistoire = daoHistoire.findById(1);
		maNavigation.setHistoireRedirigee(monHistoire);

		maNavigation.setSexe(Sexe.FEMININ);
		maNavigation.setOrientationSexelle(OrientationSexuelle.HETERO);

		daoNavigation.save(maNavigation);

	}

}
