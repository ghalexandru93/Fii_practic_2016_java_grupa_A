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
public interface StudentDAO extends AbstractDAO {

	/**
	 * Creates a group.
	 * 
	 * @param grupa
	 *            the group to be created.
	 * @return the created group.
	 */
	public Student getStudent(Long id);
	public Student create(Student student);
	public void update(Student student);
	public void delete(Student student);
	public List<Student> findAll();
}