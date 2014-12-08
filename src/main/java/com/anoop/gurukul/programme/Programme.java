package com.anoop.gurukul.programme;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.TableGenerator;

import com.anoop.gurukul.centre.Centre;
import com.anoop.gurukul.exam.Examination;
import com.anoop.gurukul.student.Student;
import com.anoop.gurukul.subject.Subject;

@Entity
public class Programme {

	@TableGenerator(name="programme_id",table="idgeneration",pkColumnName="programmeId",valueColumnName="programmeIdValue")
	@Id @GeneratedValue(strategy=GenerationType.TABLE, generator="programme_id")
	private int id;
	private String name;
	private int startDate;
	
	@ManyToOne
	@JoinColumn(name="centre_id")
	private Centre centre;
	@ManyToMany
	@JoinTable(name="programme_subject", joinColumns=@JoinColumn(name="programme_id"), inverseJoinColumns=@JoinColumn(name="subject_id"))
	private List<Subject> subjects;
	@ManyToMany
	@JoinTable(name="programme_student", joinColumns=@JoinColumn(name="programme_id"), inverseJoinColumns=@JoinColumn(name="student_id"))
	private List<Student> students;
	
	@OneToMany
	private List<Examination> examniations;
	
	
	
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
	public int getStartDate() {
		return startDate;
	}
	public void setStartDate(int startDate) {
		this.startDate = startDate;
	}
	public Centre getCentre() {
		return centre;
	}
	public void setCentre(Centre centre) {
		this.centre = centre;
	}
	public List<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
	public List<Examination> getExamniations() {
		return examniations;
	}
	public void setExamniations(List<Examination> examniations) {
		this.examniations = examniations;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}	
}
