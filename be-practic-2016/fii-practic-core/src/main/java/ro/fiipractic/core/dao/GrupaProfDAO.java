package ro.fiipractic.core.dao;

import java.util.List;

import ro.fiipractic.core.base.AbstractDAO;
import ro.fiipractic.core.entity.GrupaP;
import ro.fiipractic.core.entity.Student;

/**
 * DAO interface for {@link GrupaProfesori}.
 * 
 * @author CosminS
 *
 */
public interface GrupaProfDAO extends AbstractDAO {

	/**
	 * Creates a group.
	 * 
	 * @param GrupaProfesori
	 *            the group to be created.
	 * @return the created group.
	 */
	public GrupaP create(GrupaP grp);
	public void update(GrupaP grp);
	public void delete(GrupaP grp);
	public List<GrupaP> listGrupaProfesori();
	public GrupaP getGrupa(Long id);
}