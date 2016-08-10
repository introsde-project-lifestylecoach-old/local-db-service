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
public class UserGoal implements Serializable {

	@Id
	@Column(name = "id_usergoal")
	private Long id_usergoal;
	@Column(name = "id_user")
	private Long id_user;
	@Column(name = "id_goal")
	private Long id_medic;
	@Column(name = "done")
	private boolean done;
	@Column(name = "duration")
	private Float duration;

	@OneToMany(mappedBy = "id_goal", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Goal> goals;

	public Long getId_usergoal() {
		return id_usergoal;
	}

	public void setId_usergoal(Long id_usergoal) {
		this.id_usergoal = id_usergoal;
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

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	public Float getDuration() {
		return duration;
	}

	public void setDuration(Float duration) {
		this.duration = duration;
	}

	public List<Goal> getGoals() {
		return goals;
	}

	public void setGoals(List<Goal> goals) {
		this.goals = goals;
	}

}
