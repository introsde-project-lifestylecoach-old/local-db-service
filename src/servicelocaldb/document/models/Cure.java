package matteogabburo.document.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "Cure")
@XmlRootElement
public class Cure implements Serializable {

	@Id
	@Column(name = "id_cure")
	private Long id_cure;
	@Column(name = "id_user")
	private Long id_user;
	@Column(name = "id_medic")
	private Long id_medic;
	@Column(name = "description")
	private String description;
	@Column(name = "duration")
	private Long duration;

	@OneToOne(cascade = CascadeType.ALL, optional = false, fetch = FetchType.EAGER, orphanRemoval = true)
	@JoinColumn(name = "id_medic", nullable = false)
	private Medic medic;

	public Long getId_cure() {
		return id_cure;
	}

	public void setId_cure(Long id_cure) {
		this.id_cure = id_cure;
	}

	public Long getId_user() {
		return id_user;
	}

	public void setId_user(Long id_user) {
		this.id_user = id_user;
	}

	public Long getId_medic() {
		return id_medic;
	}

	public void setId_medic(Long id_medic) {
		this.id_medic = id_medic;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getDuration() {
		return duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public Medic getMedic() {
		return medic;
	}

	public void setMedic(Medic medic) {
		this.medic = medic;
	}

}
