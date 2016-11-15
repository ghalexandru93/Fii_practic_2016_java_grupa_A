package ro.fiipractic.core.service.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

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
import ro.fiipractic.core.entity.GrupaP;
import ro.fiipractic.core.service.GrupaPService;
import ro.fiipractic.core.service.GrupaService;

/**
 * JUnit test for {@link GrupaDAO}.
 * 
 * @author CosminS
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring-config/spring-root.xml")
public class GrupaPServiceTest {

	ApplicationContext ctx = new AnnotationConfigApplicationContext(
			ConfigBean.class);

	@Autowired
	private GrupaPService grupaProfService;

	/**
	 * Dummy test for checking the persistence.
	 */
	@Test
	public void testCreate() {
//		GrupaP grupa = new GrupaP();
//		grupa.setNumeGrupa("FII PRACTIC 2016 - GROUP A");
//		grupa = grupaProfService.create(grupa);
//		
//		assertNotNull(grupa.getId());
	}

}