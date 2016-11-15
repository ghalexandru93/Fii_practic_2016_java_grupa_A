package ro.fiipractic.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import ro.fiipractic.core.base.BaseEntity;

@SuppressWarnings("serial")
@Entity
@Table(name = "profesori", schema = "fii-practic")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
@XmlRootElement(name = "profesori")
public class Profesor extends BaseEntity {
	@Column(name = "nume", nullable = false, length = 255)
	private String nume;
	@Column(name = "disciplina", nullable = false, length = 255)
	private String disciplina;
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

}
