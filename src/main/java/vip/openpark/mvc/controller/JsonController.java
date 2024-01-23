package vip.openpark.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 注解 @ResponseBody 表示响应数据为 JSON
 *
 * @author anthony
 * @version 2024/1/23 10:54
 */
@Controller
@ResponseBody
public class JsonController {
	
	@RequestMapping(path = "sayHello", method = {RequestMethod.GET})
	public String sayHello(@RequestParam("name") String name) {
		return "Hello " + name + "!";
	}
}