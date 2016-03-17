package org.ahhn.com.t07;

import org.ahhn.com.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by XJX on 2016/3/17.
 */
public class Test7 {
	@Test
	public void test() {
		SqlSessionFactory sessionFactory = MyBatisUtil.getSessionFactory();
		SqlSession session = sessionFactory.openSession();

		Map<String, Integer> parameter = new HashMap<String, Integer>();
		parameter.put("sex_id", 1);
		parameter.put("user_count", -1);
		session.selectOne("org.ahhn.com.t07.userMapper.getUserCount", parameter);
		Integer userCount = parameter.get("user_count");
		System.out.println(userCount);

		session.close();
	}
}
