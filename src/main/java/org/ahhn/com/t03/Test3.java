package org.ahhn.com.t03;

import org.ahhn.com.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

/**
 * Created by XJX on 2016/3/14.
 */
public class Test3 {

	@Test
	public void test() {
		SqlSessionFactory sessionFactory = MyBatisUtil.getSessionFactory();
		SqlSession session = sessionFactory.openSession();

		Order order = session.selectOne("org.ahhn.com.t03.orderMapper.getOrder", 1);
		System.out.println(order);
	}

	@Test
	public void test2(){
		SqlSessionFactory sessionFactory = MyBatisUtil.getSessionFactory();
		SqlSession session = sessionFactory.openSession();

		Order order = session.selectOne("org.ahhn.com.t03.orderMapper.getOrder2", 1);
		System.out.println(order);
	}
}
