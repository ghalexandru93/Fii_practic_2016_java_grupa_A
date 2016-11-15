package ro.fiipractic.core.dao;

import java.util.List;

import ro.fiipractic.core.base.AbstractDAO;
import ro.fiipractic.core.entity.Profesor;

public interface ProfesorDAO extends AbstractDAO {
	public Profesor getProfesor(Long id);
	public Profesor create(Profesor prof);
	public void update(Profesor prof);
	public void delete(Profesor prof);
	public List<Profesor> findAll();
}
