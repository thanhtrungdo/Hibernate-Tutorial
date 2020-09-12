/*
* (C) Copyright Thanh Trung Do 
* @author Admin
* @date Sep 11, 2020
*/
package trung.hibernate.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="course")
public class Course {
	@Id
	private int id;
	
	private String name;
	
	public Course() {
		super();
	}
	public Course(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + "]";
	}
	

}
