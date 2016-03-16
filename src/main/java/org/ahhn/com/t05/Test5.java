package org.ahhn.com.t05;

import org.ahhn.com.t04.Classes;
import org.ahhn.com.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

/**
 * Created by XJX on 2016/3/16.
 */
public class Test5 {
	@Test
	public void test() {
		SqlSessionFactory sessionFactory = MyBatisUtil.getSessionFactory();
		SqlSession session = sessionFactory.openSession();

		Classes classes = session.selectOne("org.ahhn.com.t05.studentMapper.getClass", 1);
		System.out.println(classes);
		session.close();
	}

	@Test
	public void test2() {
		SqlSessionFactory sessionFactory = MyBatisUtil.getSessionFactory();
		SqlSession session = sessionFactory.openSession();

		Classes classes = session.selectOne("org.ahhn.com.t05.studentMapper.getClass2", 2);
		System.out.println(classes);
		session.close();
	}
}
