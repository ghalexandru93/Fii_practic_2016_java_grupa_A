/**
 * 
 */
package ro.fiipractic.core.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ro.fiipractic.core.entity.Grupa;
import ro.fiipractic.core.entity.Student;

/**
 * 
 * DAO implementation for {@link Grupa}.
 * 
 * @author CosminS
 *
 */
@Repository
@Transactional
public class GrupaDAOImpl implements GrupaDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ro.fiipractic.core.dao.GrupaDAO#create(ro.fiipractic.core.entity.Grupa)
	 */
	@Override
	public Grupa create(Grupa grupa) {
		getCurrentSession().save(grupa);
		return grupa;
	}

	@Override
	public Grupa getGrupa(Long id) {
		return getCurrentSession().get(Grupa.class, id);
	}

	@Override
	public Grupa update(Grupa grupa) {
		 getCurrentSession().update(grupa);
		 getCurrentSession().flush();
		 return grupa;
	}
	
	@Override
	public void delete(Grupa grupa){
		getCurrentSession().delete(grupa);
		getCurrentSession().flush();
	}

	@Override
	  public List<Grupa> findAll() {
		 List<Grupa> grList = getCurrentSession().createQuery("FROM Grupa gr").list(); 
        for (Iterator<Grupa> iterator = grList.iterator(); iterator.hasNext();){
           Grupa gr = (Grupa) iterator.next(); 
           System.out.print("ID Grupa : " + gr.getId() + "\n"); 
           System.out.print("Nume Grupa: " + gr.getNumeGrupa() + "\n"); 
        }
		return grList;
	}
}