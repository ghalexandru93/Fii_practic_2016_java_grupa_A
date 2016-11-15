package ro.fiipractic.core.service;

import java.util.List;

import ro.fiipractic.core.entity.Profesor;

public interface ProfesorService {
	public Profesor getProfesor(Long id);
	public Profesor create(Profesor prof);
	public void update(Profesor prof);
	public void delete(Profesor prof);
	public List<Profesor> findAll();
}
