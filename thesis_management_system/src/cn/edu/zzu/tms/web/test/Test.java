package cn.edu.zzu.tms.web.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/test")
public class Test {
	
	@RequestMapping(value = "test1", method = RequestMethod.GET)
	public String test1() {
		return "test/test1";
	}
	
	@RequestMapping(value = "test2", method = RequestMethod.GET)
	public String test2() {
		return "test/test2";
	}

}
