package ro.fiipractic.core.service;

import java.util.List;

import ro.fiipractic.core.entity.Grupa;

/**
 * 
 * @author Cosmin-HP
 * @since Mar 27, 2016
 * @version 1.0
 */
public interface GrupaService {

	/**
	 * Creates a group.
	 * 
	 * @param grupa
	 *            the group to be created.
	 * @return the created group.
	 */
	public Grupa create(Grupa grupa);
	/**
	 * Get a group by id.
	 * 
	 * @author Cosmin-HP
	 * @since Mar 27, 2016
	 * @param i
	 * @return
	 */
	public Grupa getGrupa(Long i);

	public List<Grupa> findAll();
	
	public Grupa update(Grupa grupa);
	
	public void delete(Grupa grupa);

}