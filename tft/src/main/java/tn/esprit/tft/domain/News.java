package tn.esprit.tft.domain;

import java.io.Serializable;
import java.lang.Integer;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Document
 *
 */
@Entity
@Table(name="t_new")

public class News implements Serializable {

	
	private Integer idDocument;
	private Integer visibility;
	private Administrator administrator ; 
	private String article;
	private static final long serialVersionUID = 1L;

	public News() {
		super();
	}   
	
	public Integer getVisibility() {
		return this.visibility;
	}

	public void setVisibility(Integer visibility) {
		this.visibility = visibility;
	}
	@ManyToOne
	@JoinColumn(name="administrator")
	public Administrator getAdministrator() {
		return administrator;
	}
	public void setAdministrator(Administrator administrator) {
		this.administrator = administrator;
	}
    @Id
	public Integer getIdDocument() {
		return idDocument;
	}

	public void setIdDocument(Integer idDocument) {
		this.idDocument = idDocument;
	}

	public String getArticle() {
		return article;
	}

	public void setArticle(String article) {
		this.article = article;
	}
   
}
