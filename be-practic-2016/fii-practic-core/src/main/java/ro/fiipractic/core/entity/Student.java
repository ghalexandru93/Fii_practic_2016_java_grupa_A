package ro.fiipractic.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import ro.fiipractic.core.base.BaseEntity;

@SuppressWarnings("serial")
@Entity
@Table(name = "studenti", schema = "fii-practic")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
@XmlRootElement(name = "student")
public class Student extends BaseEntity{
   
	@Column(name = "nume", nullable = false, length = 255)
	private String nume;
    @Column(name = "matricol", nullable = false, length = 255)
    private String nrMatricol;
    @Column(name = "an_studiu", nullable = false, length = 255)
	private int anStudiu;
    @ManyToOne
	private Grupa id_grupa;
	
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public String getNrMatricol() {
		return nrMatricol;
	}
	public void setNrMatricol(String nrMatricol) {
		this.nrMatricol = nrMatricol;
	}
	public int getAnStudiu() {
		return anStudiu;
	}
	public void setAnStudiu(int anStudiu) {
		this.anStudiu = anStudiu;
	}
	public Grupa getGrupa() {
		return id_grupa;
	}
	public void setGrupa(Grupa grupa) {
		this.id_grupa = grupa;
	}
	
	 @Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + anStudiu;
			result = prime * result + ((id_grupa == null) ? 0 : id_grupa.hashCode());
			result = prime * result + ((nrMatricol == null) ? 0 : nrMatricol.hashCode());
			result = prime * result + ((nume == null) ? 0 : nume.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Student other = (Student) obj;
			if (anStudiu != other.anStudiu)
				return false;
			if (id_grupa == null) {
				if (other.id_grupa != null)
					return false;
			} else if (!id_grupa.equals(other.id_grupa))
				return false;
			if (nrMatricol == null) {
				if (other.nrMatricol != null)
					return false;
			} else if (!nrMatricol.equals(other.nrMatricol))
				return false;
			if (nume == null) {
				if (other.nume != null)
					return false;
			} else if (!nume.equals(other.nume))
				return false;
			return true;
		}
}
