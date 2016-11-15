/**
 * 
 */
package ro.fiipractic.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ro.fiipractic.core.dao.GrupaProfDAO;
import ro.fiipractic.core.entity.GrupaP;

/**
 * @author Cosmin-HP
 * @since Mar 27, 2016
 * @version 1.0
 */
@Service("grupaPService")
@Transactional(readOnly = true, rollbackFor = Exception.class)
public class GrupaPServiceImpl implements GrupaPService {
	
	@Autowired
	private GrupaProfDAO grupaProfDAO;

	@Override
	public GrupaP create(GrupaP grupa) {
		return grupaProfDAO.create(grupa);
	}
	
	@Override
	public GrupaP getGrupaP(Long id) {
		return grupaProfDAO.getGrupa(id);
	}

	
	@Override
	public void update(GrupaP grp) {
		grupaProfDAO.update(grp);
	}

	@Override
	public void delete(GrupaP grp) {
		grupaProfDAO.delete(grp);
		
	}

	@Override
	public List<GrupaP> listGrupaProfesori() {
		// TODO Auto-generated method stub
		return null;
	}
}