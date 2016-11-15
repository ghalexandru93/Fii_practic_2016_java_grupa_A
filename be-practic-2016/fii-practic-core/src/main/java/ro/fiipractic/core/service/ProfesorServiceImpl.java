package ro.fiipractic.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ro.fiipractic.core.dao.ProfesorDAO;
import ro.fiipractic.core.entity.Profesor;

@Service("profesorService")
@Transactional(readOnly = true, rollbackFor = Exception.class)
public class ProfesorServiceImpl implements ProfesorService{
	@Autowired
	private ProfesorDAO prfDAO;

	@Override
	public Profesor create(Profesor prf) {
		return prfDAO.create(prf);
	}
	
	@Override
	public Profesor getProfesor(Long id) {
		return prfDAO.getProfesor(id);
	}

	@Override
	public void update(Profesor prof) {
		prfDAO.update(prof);
		
	}

	@Override
	public void delete(Profesor prof) {
		prfDAO.delete(prof);
	}

	@Override
	public List<Profesor> findAll() {
		return prfDAO.findAll();
	}
}
