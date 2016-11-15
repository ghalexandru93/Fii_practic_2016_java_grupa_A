/**
 * 
 */
package ro.fiipractic.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ro.fiipractic.core.dao.GrupaDAO;
import ro.fiipractic.core.entity.Grupa;

/**
 * @author Cosmin-HP
 * @since Mar 27, 2016
 * @version 1.0
 */
@Service("grupaService")
@Transactional(readOnly = true, rollbackFor = Exception.class)
public class GrupaServiceImpl implements GrupaService {
	
	@Autowired
	private GrupaDAO grupaDAO;

	@Override
	public Grupa create(Grupa grupa) {
		return grupaDAO.create(grupa);
	}
	
	@Override
	public Grupa getGrupa(Long id) {
		return grupaDAO.getGrupa(id);
	}

	@Override
	public Grupa update(Grupa grupa) {
		return grupaDAO.update(grupa);
	}
	
	public void delete(Grupa grupa) {
		grupaDAO.delete(grupa);
	}

	@Override
	public List<Grupa> findAll() {
		return grupaDAO.findAll();
	}
}