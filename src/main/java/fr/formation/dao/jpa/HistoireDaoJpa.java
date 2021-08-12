package fr.formation.dao.jpa;

import java.util.List;

import fr.formation.dao.IHistoireDao;
import fr.formation.model.Histoire;

public class HistoireDaoJpa extends AbstractDaoJpa<Histoire> implements IHistoireDao {

	@Override
	public List<Histoire> findAll() {
		return em.createQuery("select h from Histoire h", Histoire.class).getResultList();
	}

	@Override
	public Histoire save(Histoire entity) {
		if (entity.getId() > 0) {
			return this.update(entity);
		} else {
			return this.insert(entity);
		}
	}

	@Override
	public Histoire findById(Integer id) {
		return em.find(Histoire.class, id);
	}

}
