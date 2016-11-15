package ro.fiipractic.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import ro.fiipractic.core.base.BaseEntity;

/**
 * Entity for group.
 * 
 * @author CosminS
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "grupe", schema = "fii-practic")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
@XmlRootElement(name = "grupe")
public class Grupa extends BaseEntity {

    @Column(name = "nume", nullable = false, length = 255)
    private String numeGrupa;

    public String getNumeGrupa() {
        return numeGrupa;
    }

    public void setNumeGrupa(String numeGrupa) {
        this.numeGrupa = numeGrupa;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((numeGrupa == null) ? 0 : numeGrupa.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Grupa other = (Grupa) obj;
        if (numeGrupa == null) {
            if (other.numeGrupa != null) {
                return false;
            }
        } else if (!numeGrupa.equals(other.numeGrupa)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Grupa [numeGrupa=" + numeGrupa + "]";
    }
}