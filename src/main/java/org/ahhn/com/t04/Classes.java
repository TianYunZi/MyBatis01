package org.ahhn.com.t04;

import org.ahhn.com.t05.Student;

import java.util.List;

/**
 * Created by XJX on 2016/3/15.
 */
public class Classes {
	private int id;
	private String name;
	private Teacher teacher;
	private List<Student> students;

	public Classes() {
	}

	public Classes(int id, String name, Teacher teacher) {
		this.id = id;
		this.name = name;
		this.teacher = teacher;
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

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Classes{" +
				"id=" + id +
				", name='" + name + '\'' +
				", teacher=" + teacher +
				", students=" + students +
				'}';
	}
}
