package com.anoop.gurukul.exam;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Examination {
	@SequenceGenerator(name="examination_id", sequenceName="examination_seq")
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="examination_id")
	private int id;
	private ExaminationType type;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ExaminationType getType() {
		return type;
	}
	public void setType(ExaminationType type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
