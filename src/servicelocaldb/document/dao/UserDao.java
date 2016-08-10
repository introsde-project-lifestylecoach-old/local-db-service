package servicelocaldb.document.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import servicelocaldb.document.models.User;

public class UserDao extends Dao implements UserDao_interface{

	public UserDao()
	{
		super();
	}
	
	@Override
	public User save(User user) {
		
		EntityManager em = createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
        tx.begin();
        em.persist(user);
        tx.commit();
        
        closeConnections(em);
        return user;
	}

	@Override
	public User update(User user) {
		EntityManager em = createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
        tx.begin();
        user= em.merge(user);
        tx.commit();
        
        closeConnections(em);
        return user;
	}

	@Override
	public User delete(User user) {
		EntityManager em = createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
        tx.begin();
        user=em.merge(user);
        em.remove(user);
        tx.commit();
        
        closeConnections(em);
        return user;
	}

	@Override
	public User getUserById(Long id) {
		EntityManager em = createEntityManager();
		User user = em.find(User.class, id);
		closeConnections(em);
		return user;
	}

	@Override
	public User getUserByAuthentication(String mail, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
