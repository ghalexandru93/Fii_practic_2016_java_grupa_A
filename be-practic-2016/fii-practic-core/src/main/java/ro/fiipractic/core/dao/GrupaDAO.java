package ro.fiipractic.core.dao;

import java.util.List;

import ro.fiipractic.core.base.AbstractDAO;
import ro.fiipractic.core.entity.Grupa;
import ro.fiipractic.core.entity.Student;

/**
 * DAO interface for {@link Grupa}.
 * 
 * @author CosminS
 *
 */
public interface GrupaDAO extends AbstractDAO {

	/**
	 * Creates a group.
	 * 
	 * @param grupa
	 *            the group to be created.
	 * @return the created group.
	 */
	public Grupa create(Grupa grupa);

	public Grupa getGrupa(Long id);
	
	public Grupa update(Grupa grupa);
	
	public List<Grupa> findAll();

	public void delete(Grupa grupa);

}