package matteogabburo.document.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "Goal")
@XmlRootElement
public class Goal implements Serializable {

	@Id
	@Column(name = "id_goal")
	private Long id_goal;
	@Column(name = "name")
	private String name;
	@Column(name = "description")
	private String description;
	
	public Long getId_goal() {
		return id_goal;
	}
	public void setId_goal(Long id_goal) {
		this.id_goal = id_goal;
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
