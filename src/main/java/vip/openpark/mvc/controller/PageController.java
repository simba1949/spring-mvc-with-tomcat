package vip.openpark.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 不使用 {@link ResponseBody}{@link RestController} 表示返回 {@code String} 类型的页面
 *
 * @author anthony
 * @version 2024/1/23 10:37
 */
@Controller
public class PageController {
	
	@RequestMapping(path = {"/", "gotoPage"}, method = {RequestMethod.GET})
	public String gotoPage(@RequestParam(value = "pageName", required = false) String pageName) {
		if (null == pageName || pageName.isEmpty()) {
			return "index";
		}
		
		// index ==> /WEB-INF/view/index.jsp
		// login ==> /WEB-INF/view/login.jsp
		return pageName;
	}
}