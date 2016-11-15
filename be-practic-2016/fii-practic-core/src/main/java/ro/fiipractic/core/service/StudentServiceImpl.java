/**
 * 
 */
package ro.fiipractic.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ro.fiipractic.core.dao.StudentDAO;
import ro.fiipractic.core.entity.Student;

/**
 * @author Cosmin-HP
 * @since Mar 27, 2016
 * @version 1.0
 */
@Service("studentService")
@Transactional(readOnly = true, rollbackFor = Exception.class)
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDAO studentDAO;


	@Override
	public Student create(Student student) {
		return 	studentDAO.create(student);
	}


	@Override
	public void update(Student student) {
		studentDAO.update(student);
	}

	@Override
	public void delete(Student student) {
		studentDAO.delete(student);
		
	}

	@Override
	public Student getStudent(Long id) {
		return studentDAO.getStudent(id);
	}


	@Override
	public List<Student> findAll() {
		return studentDAO.findAll();
	}
}