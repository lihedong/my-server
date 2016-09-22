package boco.server.test;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class AppTest {
	private static ApplicationContext context;

	private static JdbcTemplate jdbcTemplate;

	public static void main(String[] args) throws SQLException {
		context = new ClassPathXmlApplicationContext(
				"classpath:spring-mybatis.xml");
		jdbcTemplate  = (JdbcTemplate) context.getBean("jdbcTemplate");
	    List<Map<String,Object>> list=jdbcTemplate.queryForList("select * from festival_busi");
	    System.out.println(list.size());
	    System.out.println(list);
	    System.out.println(list.get(0));
	
	}

}
