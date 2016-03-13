package org.ahhn.com.t01;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by XJX on 2016/3/13.
 */
public class Test {
	@org.junit.Test
	public void test1() throws IOException {
		String resource = "conf.xml";
		Reader reader = Resources.getResourceAsReader(resource);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = sessionFactory.openSession();
		User user = session.selectOne("org.ahhn.com.t01.userMapper.getUser", 1);
		System.out.println(user);
	}
}
