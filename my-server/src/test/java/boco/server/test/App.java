package boco.server.test;

import java.util.List;
import java.util.Map;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import boco.server.service.BaseService;

public class App {
	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
		BaseService bi= (BaseService) context.getBean("baseService");
		
		List<Map<String,Object>>list=bi.queryBusi();
		System.out.println("list="+list);
		
		List<Map<String,Object>>lists=bi.queryBts();
		System.out.println("lists="+lists);
	}
}
