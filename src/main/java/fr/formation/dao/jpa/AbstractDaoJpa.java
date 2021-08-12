package fr.formation.dao.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class AbstractDaoJpa<T> {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("FantasyLoverUnit");

	protected EntityManager em = emf.createEntityManager();

	public static void close() {
		emf.close();
	}

	public T insert(T entity) {
		em.getTransaction().begin();
		em.persist(entity);
		em.getTransaction().commit();
		return entity;
	}

	public T update(T entity) {
		em.getTransaction().begin();
		entity = em.merge(entity);
		em.getTransaction().commit();
		return entity;
	}

	public void delete(T entity) {
		em.getTransaction().begin();
		em.remove(entity);
		em.getTransaction().commit();
	}

	public abstract T findById(Integer id);

	public void deleteById(Integer id) {
		T monEntityASupprimer = this.findById(id);
		this.delete(monEntityASupprimer);
	}

}
