package ro.fiipractic.core.service.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import antlr.collections.List;
import ro.fiipractic.core.base.ConfigBean;
import ro.fiipractic.core.dao.GrupaDAO;
import ro.fiipractic.core.entity.Grupa;
import ro.fiipractic.core.entity.Student;
import ro.fiipractic.core.service.GrupaService;
import ro.fiipractic.core.service.StudentService;

/**
 * JUnit test for {@link GrupaDAO}.
 * 
 * @author CosminS
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring-config/spring-root.xml")
//@Ignore
public class StudentServiceTest {

	ApplicationContext ctx = new AnnotationConfigApplicationContext(
			ConfigBean.class);

	@Autowired
	private StudentService stService;

	@Autowired
	private GrupaService grupaService;
	/**
	 * Dummy test for checking the persistence.
	 */
	@Test
	@Ignore
	public void testCreate() {
		Student st = new Student();
		st.setNume("Rares");
		st.setGrupa(null);
		st.setNrMatricol("12414214");
		st.setAnStudiu(4);
		
		st = stService.create(st);

		assertNotNull(st.getId());
	}

	@Test
	
	public void testCreateSpringBean() {
		Student st = ctx.getBean(Student.class);
		st.setNume("Rares");
		st.setGrupa(null);
		st.setNrMatricol("155514");
		st.setAnStudiu(4);
		st = stService.create(st);
		assertNotNull(st.getId());
	}

	@Test
	@Ignore
	public void testGetStudent() {
		Grupa gr = new Grupa();
		gr.setNumeGrupa("1402b");
		gr = grupaService.create(gr);
		Student st = new Student();
		st.setNume("Rares");
		st.setGrupa(gr);
		st.setNrMatricol("6666666");
		st.setAnStudiu(4);
		st = stService.create(st);
		Student found = stService.getStudent(st.getId());
		assertNotNull(found);
	}
	
	@Test
	@Ignore
	public void testList() {
		stService.findAll();
	}
	
	@Test
	@Ignore
	public void testUpdateStudent() {
		Student toUpdate = stService.getStudent((long) 5);
		toUpdate.setNume("UpdatedStudent");
		toUpdate.setAnStudiu(1);
		stService.update(toUpdate);
		assertNotNull(toUpdate);
	}
	
	@Test
	@Ignore
	public void testDeleteStudent() {
		Student toDelete = stService.getStudent((long)6);
		stService.delete(toDelete);
	}
}