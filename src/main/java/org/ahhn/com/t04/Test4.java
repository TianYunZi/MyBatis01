package org.ahhn.com.t04;

import org.ahhn.com.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

/**
 * Created by XJX on 2016/3/15.
 */
public class Test4 {

	@Test
	public void test() {
		SqlSessionFactory sessionFactory = MyBatisUtil.getSessionFactory();
		SqlSession session = sessionFactory.openSession();

		Classes classes = session.selectOne("org.ahhn.com.t04.classesMapper.getClasses", 1);
		System.out.println(classes);
		session.close();
	}

	@Test
	public void test2() {
		SqlSessionFactory sessionFactory = MyBatisUtil.getSessionFactory();
		SqlSession session = sessionFactory.openSession();

		Classes classes = session.selectOne("org.ahhn.com.t04.classesMapper.getClasses2", 2);
		System.out.println(classes);
		session.close();
	}
}
