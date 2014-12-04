package com.anoop.gurukul.programme;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

import com.anoop.gurukul.centre.Centre;
import com.anoop.gurukul.subject.Subject;

@Entity
public class Programme {

	@TableGenerator(name="programme_id",table="idgeneration",pkColumnName="programmeId",valueColumnName="programmeIdValue")
	@Id @GeneratedValue(strategy=GenerationType.TABLE, generator="programme_id")
	private int id;
	private String name;
	//private Centre centre;
	//private List<Subject> subjects;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the centre
	 *//*
	public Centre getCentre() {
		return centre;
	}
	*//**
	 * @param centre the centre to set
	 *//*
	public void setCentre(Centre centre) {
		this.centre = centre;
	}*/	
}
