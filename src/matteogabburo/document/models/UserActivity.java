package matteogabburo.document.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "UserGoal")
@XmlRootElement
public class UserActivity implements Serializable {

	@Id
	@Column(name = "id_useractivity")
	private Long id_useractivity;
	@Column(name = "id_user")
	private Long id_user;
	@Column(name = "id_activity")
	private Long id_activity;

	@OneToMany(mappedBy = "id_activity", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Activity> activities;

	public Long getId_useractivity() {
		return id_useractivity;
	}

	public void setId_useractivity(Long id_useractivity) {
		this.id_useractivity = id_useractivity;
	}

	public Long getId_user() {
		return id_user;
	}

	public void setId_user(Long id_user) {
		this.id_user = id_user;
	}

	public Long getId_activity() {
		return id_activity;
	}

	public void setId_activity(Long id_activity) {
		this.id_activity = id_activity;
	}

	public List<Activity> getActivities() {
		return activities;
	}

	public void setActivities(List<Activity> activities) {
		this.activities = activities;
	}

}
