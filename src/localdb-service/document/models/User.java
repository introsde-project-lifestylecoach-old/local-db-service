package matteogabburo.document.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "User")
@XmlRootElement
public class User implements Serializable {

	@Id
	@Column(name = "id_user")
	private Long id_user;
	@Column(name = "name")
	private String name;
	@Column(name = "mail")
	private String mail;
	@Column(name = "surname")
	private String surname;
	@Column(name = "telephone")
	private String telephone;
	@Column(name = "passwd")
	private String passwd;

	@OneToMany(mappedBy = "id_user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Health> healthList;
	@OneToMany(mappedBy = "id_user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<UserGoal> goals;
	@OneToMany(mappedBy = "id_user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<UserActivity> activities;
	@OneToMany(mappedBy = "id_user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Cure> cures;

	public Long getId_user() {
		return id_user;
	}

	public void setId_user(Long id_user) {
		this.id_user = id_user;
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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public List<Health> getHealthList() {
		return healthList;
	}

	public void setHealthList(List<Health> healthList) {
		this.healthList = healthList;
	}

	public List<UserGoal> getGoals() {
		return goals;
	}

	public void setGoals(List<UserGoal> goals) {
		this.goals = goals;
	}

	public List<UserActivity> getActivities() {
		return activities;
	}

	public void setActivities(List<UserActivity> activities) {
		this.activities = activities;
	}

	public List<Cure> getCures() {
		return cures;
	}

	public void setCures(List<Cure> cures) {
		this.cures = cures;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	
}
