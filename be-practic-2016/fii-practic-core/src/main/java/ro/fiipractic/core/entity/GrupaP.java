package ro.fiipractic.core.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import ro.fiipractic.core.base.BaseEntity;

@Entity
@Table(name = "grupe_profesori", schema = "fii-practic")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
@XmlRootElement(name = "grupe_profesori")
public class GrupaP extends BaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@ManyToOne
	private Grupa idGrupaProfesori;
	@ManyToOne
	private Profesor idProfesor;
	
	public Grupa getIdGrupaProfesori() {
		return idGrupaProfesori;
	}
	public void setIdGrupaProfesori(Grupa idGrupaProfesori) {
		this.idGrupaProfesori = idGrupaProfesori;
	}
	
}
