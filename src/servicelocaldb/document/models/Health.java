package servicelocaldb.document.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "Health")
@XmlRootElement
public class Health implements Serializable {

	@Id
	@Column(name = "id_health")
	private Long id_health;
	@Column(name = "id_user")
	private Long id_user;
	@Column(name = "height")
	private Float height;
	@Column(name = "pression")
	private Float pression;
	@Column(name = "pulse")
	private Float pulse;
	@Column(name = "pudaily_stepslse")
	private Integer daily_steps;
	@Column(name = "calories_per_meal")
	private Integer calories_per_meal;
	@Column(name = "sleep_hours")
	private Float sleep_hours;
	@Column(name = "weigth")
	private Float weigth;
	public Long getId_health() {
		return id_health;
	}
	public void setId_health(Long id_health) {
		this.id_health = id_health;
	}
	public Long getId_user() {
		return id_user;
	}
	public void setId_user(Long id_user) {
		this.id_user = id_user;
	}
	public Float getHeight() {
		return height;
	}
	public void setHeight(Float height) {
		this.height = height;
	}
	public Float getPression() {
		return pression;
	}
	public void setPression(Float pression) {
		this.pression = pression;
	}
	public Float getPulse() {
		return pulse;
	}
	public void setPulse(Float pulse) {
		this.pulse = pulse;
	}
	public Integer getDaily_steps() {
		return daily_steps;
	}
	public void setDaily_steps(Integer daily_steps) {
		this.daily_steps = daily_steps;
	}
	public Integer getCalories_per_meal() {
		return calories_per_meal;
	}
	public void setCalories_per_meal(Integer calories_per_meal) {
		this.calories_per_meal = calories_per_meal;
	}
	public Float getSleep_hours() {
		return sleep_hours;
	}
	public void setSleep_hours(Float sleep_hours) {
		this.sleep_hours = sleep_hours;
	}
	public Float getWeigth() {
		return weigth;
	}
	public void setWeigth(Float weigth) {
		this.weigth = weigth;
	}

	
}
