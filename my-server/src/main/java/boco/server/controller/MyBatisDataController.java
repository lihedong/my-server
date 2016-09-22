package boco.server.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/data")
public class MyBatisDataController {
	@RequestMapping("/query")
	public String DataHandler(HttpServletRequest request,
			HttpServletResponse response) {
        System.out.println("abc");
		return "success";
	}
}
