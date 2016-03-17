package org.ahhn.com.t02;

import org.ahhn.com.t06.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by XJX on 2016/3/14.
 */
public interface UserMapper2 {

	@Insert("INSERT INTO users(NAME,age) VALUES (#{name},#{age})")
	public int addUser(User user);

	@Delete("DELETE FROM users WHERE id=#{id}")
	public int deleteById(int id);

	@Update("UPDATE users SET NAME=#{name},age=#{age} WHERE id=#{id}")
	public int updateUser(User user);

	@Select("SELECT * FROM users WHERE id=#{id}")
	public User getUserById(int id);

	@Select("SELECT * FROM users")
	public List<User> getAllUsers();
}
