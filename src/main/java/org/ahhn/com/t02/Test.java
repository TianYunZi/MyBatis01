package org.ahhn.com.t02;


import org.ahhn.com.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * Created by XJX on 2016/3/13.
 */
public class Test {
	@org.junit.Test
	public void testAddUser() {
		SqlSessionFactory sessionFactory = MyBatisUtil.getSessionFactory();
		SqlSession session = sessionFactory.openSession();//默认手动提交，自动提交：sessionFactory.openSession(true)

		int insert = session.insert("org.ahhn.com.t02.userMapper.addUser", new User("AA", 22));

		session.commit();
		session.close();
		System.out.println(insert);
	}

	@org.junit.Test
	public void testUpdate() {
		SqlSessionFactory sessionFactory = MyBatisUtil.getSessionFactory();
		SqlSession session = sessionFactory.openSession();//默认手动提交，自动提交：sessionFactory.openSession(true)

		int update = session.update("org.ahhn.com.t02.userMapper.updateUser", new User(4, "AA2", 222));

		session.commit();
		session.close();
		System.out.println(update);
	}

	@org.junit.Test
	public void testDelete() {
		SqlSessionFactory sessionFactory = MyBatisUtil.getSessionFactory();
		SqlSession session = sessionFactory.openSession();//默认手动提交，自动提交：sessionFactory.openSession(true)

		int delete = session.delete("org.ahhn.com.t02.userMapper.deleteUser", 4);

		session.commit();
		session.close();
		System.out.println(delete);
	}

	@org.junit.Test
	public void testQuery() {
		SqlSessionFactory sessionFactory = MyBatisUtil.getSessionFactory();
		SqlSession session = sessionFactory.openSession();//默认手动提交，自动提交：sessionFactory.openSession(true)

		User user = session.selectOne("org.ahhn.com.t02.userMapper.getUser", 1);

		session.commit();
		session.close();
		System.out.println(user);
	}

	@org.junit.Test
	public void testQueryAll() {
		SqlSessionFactory sessionFactory = MyBatisUtil.getSessionFactory();
		SqlSession session = sessionFactory.openSession();//默认手动提交，自动提交：sessionFactory.openSession(true)

		List<User> users = session.selectList("org.ahhn.com.t02.userMapper.getAllUsers");

		session.commit();
		session.close();
		System.out.println(users);
	}

	@org.junit.Test
	public void testAddUser2() {
		SqlSessionFactory sessionFactory = MyBatisUtil.getSessionFactory();
		SqlSession session = sessionFactory.openSession();//默认手动提交，自动提交：sessionFactory.openSession(true)

		UserMapper2 mapper = session.getMapper(UserMapper2.class);
		int insert = mapper.addUser(new User("BBB", 21));

		session.commit();
		session.close();
		System.out.println(insert);
	}
}
