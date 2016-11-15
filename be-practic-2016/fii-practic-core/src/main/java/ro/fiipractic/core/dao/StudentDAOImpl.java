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
public class StudentDAOImpl implements StudentDAO {

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
	public Student create(Student student) {
		getCurrentSession().save(student);
		return student;
	}


	@Override
	public void update(Student student) {
		getCurrentSession().update(student);
		getCurrentSession().flush();
	}

	@Override
	public void delete(Student student) {
		getCurrentSession().delete(student);
		getCurrentSession().flush();
	}

	@Override
    public List<Student> findAll() {
		 List<Student> stdList = getCurrentSession().createQuery("FROM Student st").list(); 
         for (Iterator<Student> iterator = stdList.iterator(); iterator.hasNext();){
            Student st = iterator.next(); 
            System.out.print("First Name: " + st.getNume() + "\n"); 
            System.out.print("Last Name: " + st.getNrMatricol() + "\n"); 
            System.out.println("An studiu: " + st.getAnStudiu() + "\n"); 
         }
		return stdList;
	}

	@Override
	public Student getStudent(Long id) {
		return getCurrentSession().get(Student.class, id);
	}
}