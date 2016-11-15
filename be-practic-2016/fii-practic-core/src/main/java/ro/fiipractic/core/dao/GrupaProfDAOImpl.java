/**
 * 
 */
package ro.fiipractic.core.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ro.fiipractic.core.entity.Grupa;
import ro.fiipractic.core.entity.GrupaP;

/**
 * 
 * DAO implementation for {@link Grupa}.
 * 
 * @author CosminS
 *
 */
@Repository
@Transactional
public class GrupaProfDAOImpl implements GrupaProfDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public GrupaP create(GrupaP grp) {
		getCurrentSession().save(grp);
		return grp;
	}

	@Override
	public void update(GrupaP grp) {
		getCurrentSession().update(grp);

		
	}

	@Override
	public void delete(GrupaP grp) {
		getCurrentSession().delete(grp);
		
	}

	@Override
	public List<GrupaP> listGrupaProfesori() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GrupaP getGrupa(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ro.fiipractic.core.dao.GrupaDAO#create(ro.fiipractic.core.entity.Grupa)
	 */
	
}
