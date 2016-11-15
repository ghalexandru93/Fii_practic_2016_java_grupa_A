package ro.fiipractic.core.base;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import ro.fiipractic.core.entity.Grupa;
import ro.fiipractic.core.entity.Profesor;
import ro.fiipractic.core.entity.Student;

@Configuration
public class ConfigBean {
	
	 /**
	 *Bean Scope
	 *singleton: This scopes the bean definition to a single instance per Spring IoC container (default).
	 *prototype: This scopes a single bean definition to have any number of object instances.
	 *request: This scopes a bean definition to an HTTP request. Only valid in the context of a web-aware Spring ApplicationContext.
	 *session: This scopes a bean definition to an HTTP session. Only valid in the context of a web-aware Spring ApplicationContext.
	 *global-session: This scopes a bean definition to a global HTTP session. Only valid in the context of a web-aware Spring ApplicationContext.
	 */
	@Bean(/*initMethod = "init", destroyMethod = "cleanup"*/)
	@Scope("prototype")
	public Grupa grupa() {
		return new Grupa();
	}
	
	@Bean(/*initMethod = "init", destroyMethod = "cleanup"*/)
	@Scope("prototype")
	public Profesor profesor() {
		return new Profesor();
	}
	
	@Bean(/*initMethod = "init", destroyMethod = "cleanup"*/)
	@Scope("prototype")
	public Student student() {
		return new Student();
	}
}
