package ro.fiipractic.core.service;

import java.util.List;

import ro.fiipractic.core.entity.GrupaP;

public interface GrupaPService {
	public GrupaP create(GrupaP grp);
	public void update(GrupaP grp);
	public void delete(GrupaP grp);
	public List<GrupaP> listGrupaProfesori();
	public GrupaP getGrupaP(Long id);
}
