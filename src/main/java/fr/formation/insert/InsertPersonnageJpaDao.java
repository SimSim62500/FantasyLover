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
		insertPersonnage(daoPersonnage);
		AbstractDaoJpa.close();
	}

	public static void insertPersonnage(IPersonnageDao daoPersonnage) {
		Personnage monPersonnage = new Personnage("Zarg", "Zarg", Sexe.MASCULIN, OrientationSexuelle.BI);
		daoPersonnage.insert(monPersonnage);
	}

}
