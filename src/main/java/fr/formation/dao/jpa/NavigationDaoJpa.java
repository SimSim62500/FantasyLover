package fr.formation.dao.jpa;

import java.util.List;

import fr.formation.dao.INavigationDao;
import fr.formation.model.Navigation;

public class NavigationDaoJpa extends AbstractDaoJpa<Navigation> implements INavigationDao {

	@Override
	public List<Navigation> findAll() {
		return em.createNamedQuery("select n from Navigation n", Navigation.class).getResultList();
	}

	@Override
	public Navigation save(Navigation entity) {
		if (entity.getId() > 0) {
			return this.update(entity);
		} else {
			return this.insert(entity);
		}
	}

	@Override
	public Navigation findById(Integer id) {
		return em.find(Navigation.class, id);
	}

}
