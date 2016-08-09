package matteogabburo.document.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "Activity")
@XmlRootElement
public class Activity implements Serializable {
	
	@Id
	@Column(name = "id_activity")
	private Long id_activity;
	@Column(name = "name")
	private String name;
	@Column(name = "description")
	private String description;
	
	public Long getId_activity() {
		return id_activity;
	}
	public void setId_activity(Long id_activity) {
		this.id_activity = id_activity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	
	
}
