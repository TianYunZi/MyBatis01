package org.ahhn.com.t08;

import org.ahhn.com.t07.User;
import org.ahhn.com.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

/**
 * Created by XJX on 2016/3/18.
 * <p>
 * 测试缓存
 */
public class Test8 {

	//一级缓存 session级缓存
	@Test
	public void testCache1() {
		SqlSessionFactory sessionFactory = MyBatisUtil.getSessionFactory();
		SqlSession session = sessionFactory.openSession();

		String statement = "org.ahhn.com.t08.cuserMapper.getUser";
		CUser cUser = session.selectOne(statement, 1);
		System.out.println(cUser);

		CUser cUser2 = session.selectOne(statement, 1);
		System.out.println(cUser2);

		System.out.println("--------------------------------------------");

		//1.执行session.clearCache();
//		session.clearCache();

		//2.执行增删改操作
//		session.update("org.ahhn.com.t08.cuserMapper.updateUser", new User(1, "Kim", 19));
//		session.commit();

		//3.非同一个session对象
		session.close();
		session = sessionFactory.openSession();

		CUser cUser3 = session.selectOne(statement, 1);
		System.out.println(cUser3);

		session.close();
	}

	//二级缓存 映射文件级缓存
	@Test
	public void testCache2() {
		SqlSessionFactory sessionFactory = MyBatisUtil.getSessionFactory();
		SqlSession session = sessionFactory.openSession();
		SqlSession session2 = sessionFactory.openSession();

		String statement = "org.ahhn.com.t08.cuserMapper.getUser";
		CUser cUser = session.selectOne(statement, 1);
		session.commit();
		System.out.println(cUser);

		System.out.println("--------------------------------------------");

		cUser = session2.selectOne(statement, 1);
		session2.commit();
		System.out.println(cUser);

		System.out.println("--------------------------------------------");

		session.close();
		session2.close();
	}

}
