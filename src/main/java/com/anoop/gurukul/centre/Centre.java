package com.anoop.gurukul.centre;

import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import com.anoop.gurukul.programme.Programme;


@Entity
@Access(AccessType.FIELD)
public class Centre {
	@SequenceGenerator(name="centre_id", sequenceName="centre_seq")
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="centre_id")
	private int id;
	private String code;
	private String address;
	
	@OneToMany(mappedBy="centre",targetEntity=Programme.class)
	private List<Programme> programmes;
	
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
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
}
