package com.anoop.gurukul.subject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.anoop.gurukul.programme.Programme;

@Entity
public class Subject {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private Programme programme;
	private int noOfChapters;
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
	 * @return the programme
	 */
	public Programme getProgramme() {
		return programme;
	}
	/**
	 * @param programme the programme to set
	 */
	public void setProgramme(Programme programme) {
		this.programme = programme;
	}
	/**
	 * @return the noOfChapters
	 */
	public int getNoOfChapters() {
		return noOfChapters;
	}
	/**
	 * @param noOfChapters the noOfChapters to set
	 */
	public void setNoOfChapters(int noOfChapters) {
		this.noOfChapters = noOfChapters;
	}

}
