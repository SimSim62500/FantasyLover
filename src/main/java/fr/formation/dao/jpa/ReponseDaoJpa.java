package fr.formation.dao.jpa;

import java.util.List;

import fr.formation.dao.IReponseDao;
import fr.formation.model.Reponse;

public class ReponseDaoJpa extends AbstractDaoJpa<Reponse> implements IReponseDao {

	@Override
	public List<Reponse> findAll() {
		return em.createQuery("select r from Reponse r", Reponse.class).getResultList();
	}

	@Override
	public Reponse save(Reponse entity) {
		if (entity.getId() > 0) {
			return this.update(entity);
		} else {
			return this.insert(entity);
		}
	}

	@Override
	public Reponse findById(Integer id) {
		return em.find(Reponse.class, id);
	}

}
