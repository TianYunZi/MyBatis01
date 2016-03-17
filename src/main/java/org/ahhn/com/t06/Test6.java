package org.ahhn.com.t06;

import org.ahhn.com.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.util.List;

/**
 * Created by XJX on 2016/3/17.
 */
public class Test6 {
	@Test
	public void test() {
		SqlSessionFactory sessionFactory = MyBatisUtil.getSessionFactory();
		SqlSession session = sessionFactory.openSession();

		List<User> users = session.selectList("org.ahhn.com.t06.userMapper.getUser", new ConditionUser("%null%", 13, 18));
		System.out.println(users);
		session.close();
	}
}
