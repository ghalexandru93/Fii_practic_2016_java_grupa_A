package ro.fiipractic.core.service;

import java.util.List;

import ro.fiipractic.core.entity.Student;

/**
 * 
 * @author Cosmin-HP
 * @since Mar 27, 2016
 * @version 1.0
 */
public interface StudentService {

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