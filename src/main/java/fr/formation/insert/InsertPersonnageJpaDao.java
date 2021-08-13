package fr.formation.insert;

import fr.formation.dao.IPersonnageDao;
import fr.formation.dao.jpa.AbstractDaoJpa;
import fr.formation.dao.jpa.PersonnageDaoJpa;
import fr.formation.model.OrientationSexuelle;
import fr.formation.model.Personnage;
import fr.formation.model.Sexe;

public class InsertPersonnageJpaDao {

	public static void main(String[] args) {
		IPersonnageDao daoPersonnage = new PersonnageDaoJpa();
		insertPersonnage1(daoPersonnage);
		AbstractDaoJpa.close();
	}

	public static void insertPersonnage1(IPersonnageDao daoPersonnage) {
		Personnage monPersonnage = new Personnage("Vlad", "Zarg", Sexe.MASCULIN, OrientationSexuelle.BI);
		daoPersonnage.insert(monPersonnage);
	}

}
