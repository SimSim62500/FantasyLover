package fr.formation.dao.jpa;

import java.util.List;

import fr.formation.dao.IJoueurDao;
import fr.formation.model.Joueur;

public class JoueurDaoJpa extends AbstractDaoJpa<Joueur> implements IJoueurDao {

	@Override
	public List<Joueur> findAll() {
		return em.createQuery("select j from Joueur j", Joueur.class).getResultList();
	}

	@Override
	public Joueur save(Joueur entity) {
		if (entity.getId() > 0) {
			return this.update(entity);
		} else {
			return this.insert(entity);
		}
	}

	@Override
	public Joueur findById(Integer id) {
		return em.find(Joueur.class, id);
	}

}
