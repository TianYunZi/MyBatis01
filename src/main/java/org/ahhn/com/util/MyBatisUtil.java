package org.ahhn.com.util;

import org.ahhn.com.t02.Test;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * Created by XJX on 2016/3/14.
 */
public class MyBatisUtil {
	public static SqlSessionFactory getSessionFactory() {
		String resource = "conf.xml";
		InputStream inputStream = Test.class.getClassLoader().getResourceAsStream(resource);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		return sessionFactory;
	}
}
