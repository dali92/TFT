package tn.esprit.tft.domain;

import java.io.Serializable;
import java.lang.Integer;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Visitor
 *
 */
@Entity
@Table(name="t_visitor")

public class Visitor implements Serializable {

	
	private Integer idVisitor;
	private Integer ipAddress;
	private static final long serialVersionUID = 1L;

	public Visitor() {
		super();
	}
    @Id
	public Integer getIdVisitor() {
		return idVisitor;
	}

	public void setIdVisitor(Integer idVisitor) {
		this.idVisitor = idVisitor;
	}

	public Integer getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(Integer ipAddress) {
		this.ipAddress = ipAddress;
	}   
	
}
