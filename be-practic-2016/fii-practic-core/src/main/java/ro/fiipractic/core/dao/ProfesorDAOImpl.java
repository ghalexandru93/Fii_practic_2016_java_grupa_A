package ro.fiipractic.core.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ro.fiipractic.core.entity.Profesor;

@Repository
@Transactional
public class ProfesorDAOImpl implements ProfesorDAO{

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public Profesor create(Profesor prf) {
		getCurrentSession().save(prf);
		return prf;
	}


	@Override
	public void update(Profesor prf) {
		getCurrentSession().update(prf);
		getCurrentSession().flush();
	}

	@Override
	public void delete(Profesor prf) {
		getCurrentSession().delete(prf);
		getCurrentSession().flush();		
	}

    public List<Profesor> findAll() {
		 List<Profesor> prfList = getCurrentSession().createQuery("FROM Profesor p").list(); 
         for (Iterator<Profesor> iterator = prfList.iterator(); iterator.hasNext();){
            Profesor pr = (Profesor) iterator.next(); 
            System.out.print("Nume : " + pr.getNume() + "\n"); 
            System.out.print("Disciplina : " + pr.getDisciplina() + "\n"); 
         }
		return prfList;
	}

	@Override
	public Profesor getProfesor(Long id) {
		return getCurrentSession().get(Profesor.class, id);
	}

}
