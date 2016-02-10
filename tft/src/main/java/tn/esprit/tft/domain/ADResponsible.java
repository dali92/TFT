package tn.esprit.tft.domain;

import java.io.Serializable;
import javax.persistence.*;
import tn.esprit.tft.domain.Membre;

/**
 * Entity implementation class for Entity: ADResponsible
 *
 */
@Entity
@Table(name="t_ADResponsible")

public class ADResponsible extends Membre implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public ADResponsible() {
		super();
	}
   
}
