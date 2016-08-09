package matteogabburo.document.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "Medic")
@XmlRootElement
public class Medic implements Serializable {

	@Id
	@Column(name = "id_medic")
	private Long id_medic;
	@Column(name = "name")
	private String name;
	@Column(name = "mail")
	private String mail;
	@Column(name = "telephone")
	private String telephone;

	public Long getId_medic() {
		return id_medic;
	}

	public void setId_medic(Long id_medic) {
		this.id_medic = id_medic;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

}
