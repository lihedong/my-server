package boco.server.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringContextUtils implements ApplicationContextAware {

	private static ApplicationContext applicationContext;

	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	public void setApplicationContext(ApplicationContext applicationContext) {
		SpringContextUtils.applicationContext = applicationContext;
	}

}
