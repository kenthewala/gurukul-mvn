package com.anoop.gurukul.student;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
	
	@ManyToOne
	@JoinColumn(name="programme_id")
	private Programme programme;
	
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
	
	public Programme getProgramme() {
		return programme;
	}
	public void setProgramme(Programme programme) {
		this.programme = programme;
	}
	

}
