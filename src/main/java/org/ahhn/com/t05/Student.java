package org.ahhn.com.t05;

/**
 * Created by XJX on 2016/3/16.
 */
public class Student {
	private Integer id;
	private String name;

	public Student() {
	}

	public Student(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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
		return "Student{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
