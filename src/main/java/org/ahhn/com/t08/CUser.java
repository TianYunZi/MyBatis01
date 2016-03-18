package org.ahhn.com.t08;

import java.io.Serializable;

/**
 * Created by XJX on 2016/3/18.
 */
public class CUser implements Serializable {

	public CUser() {
	}

	public CUser(Integer id, String name, Integer age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	private Integer id;
	private String name;
	private Integer age;

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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "CUser{" +
				"id=" + id +
				", name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
