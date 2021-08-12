package fr.formation.dao.jpa;

import java.util.List;

import fr.formation.dao.IPersonnageDao;
import fr.formation.model.Personnage;

public class PersonnageDaoJpa extends AbstractDaoJpa<Personnage> implements IPersonnageDao {

	@Override
	public List<Personnage> findAll() {
		return em.createQuery("select p from Personnage p", Personnage.class).getResultList();
	}

	@Override
	public Personnage save(Personnage entity) {
		if (entity.getId() > 0) {
			return this.update(entity);
		} else {
			return this.insert(entity);
		}
	}

	@Override
	public Personnage findById(Integer id) {
		return em.find(Personnage.class, id);
	}

}
