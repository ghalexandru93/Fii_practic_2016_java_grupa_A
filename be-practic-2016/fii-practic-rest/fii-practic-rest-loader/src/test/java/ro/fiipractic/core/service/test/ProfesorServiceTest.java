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

import ro.fiipractic.core.base.ConfigBean;
import ro.fiipractic.core.dao.GrupaDAO;
import ro.fiipractic.core.entity.Grupa;
import ro.fiipractic.core.entity.Profesor;
import ro.fiipractic.core.service.ProfesorService;

/**
 * JUnit test for {@link GrupaDAO}.
 * 
 * @author CosminS
 *
 */
 
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring-config/spring-root.xml")
public class ProfesorServiceTest {

	ApplicationContext ctx = new AnnotationConfigApplicationContext(
			ConfigBean.class);

	@Autowired
	private ProfesorService profesorService;

	/**
	 * Dummy test for checking the persistence.
	 */

	@Test
	public void testCreate() {
		Profesor prf = new Profesor();
		prf.setNume("A");
		prf.setDisciplina("matematica");
		prf = profesorService.create(prf);

		assertNotNull(prf.getId());
	}

	@Test
	public void testCreateSpringBean() {
		Profesor prf = ctx.getBean(Profesor.class);
		prf.setNume("B");
		prf.setDisciplina("informatica");

		prf = profesorService.create(prf);

		assertNotNull(prf.getId());
	}

	@Test
	@Ignore
	public void testGetProfesor() {
		Profesor created = new Profesor();
		created.setNume("C");
		created.setDisciplina("romana");
		
		created = profesorService.create(created);
		
		Profesor found = profesorService.getProfesor(created.getId());
		
		assertNotNull(found);
	}
	
	@Test
	@Ignore
	public void testUpdateProfesor() {
		Profesor profesor = profesorService.getProfesor((long)1);
		profesor.setNume("Nume updatat2");
		profesorService.update(profesor);
		assertNotNull(profesor.getId());
	}
	
	@Test
	@Ignore
	public void testDeleteProfesor() {
		Profesor profesor = profesorService.getProfesor((long)1);
		profesorService.delete(profesor);
		assertNotNull(profesor.getId());
	}
	
	@Test
	@Ignore
	public void testGetAll() {
		profesorService.findAll();
	}
}
