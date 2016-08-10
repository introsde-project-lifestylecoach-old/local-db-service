package matteogabburo.document.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Dao {
	
	private EntityManagerFactory emf;

    private Dao()
    {
        if (emf!=null) {
            emf.close();
        }
        emf = Persistence.createEntityManagerFactory("lifestylecoach_localdb-jpa");
    }
	
    //entity manager methods
    public EntityManager createEntityManager() {return emf.createEntityManager();}
    public void closeConnections(EntityManager em) {em.close();}
    public EntityTransaction getTransaction(EntityManager em) {return em.getTransaction();}
    public EntityManagerFactory getEntityManagerFactory() {return emf;}
}
