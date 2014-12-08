package com.anoop.gurukul.student;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import com.anoop.gurukul.centre.Centre;
import com.anoop.gurukul.programme.Programme;

@Entity
public class Student {
	@SequenceGenerator(name="student_id", sequenceName="student_seq")
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="student_id")
	private int id;
	private String Name;
	@ManyToOne
	@JoinColumn(name="centre_id")
	private Centre centre;
	
	//considering one student can enroll in multiple programmes
	@ManyToMany
	private List<Programme> programmes;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Centre getCentre() {
		return centre;
	}
	public void setCentre(Centre centre) {
		this.centre = centre;
	}
	public List<Programme> getProgrammes() {
		return programmes;
	}
	public void setProgrammes(List<Programme> programmes) {
		this.programmes = programmes;
	}
	
	/*public Programme getProgramme() {
		return programme;
	}
	public void setProgramme(Programme programme) {
		this.programme = programme;
	}*/
	

}
