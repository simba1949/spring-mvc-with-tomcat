package vip.openpark.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * 不使用 {@link ResponseBody}{@link RestController} 表示返回 {@code String} 类型的页面
 *
 * @author anthony
 * @version 2024/1/23 10:37
 */
@Controller
public class PageController {
	
	/**
	 * 使用 {@link ResponseBody} 返回页面
	 *
	 * @param pageName 页面名称
	 * @return 页面
	 */
	@RequestMapping(path = {"/", "gotoPage"}, method = {RequestMethod.GET})
	public String gotoPage(@RequestParam(value = "pageName", required = false) String pageName) {
		if (null == pageName || pageName.isEmpty()) {
			return "index";
		}
		// index ==> /WEB-INF/view/index.jsp
		// login ==> /WEB-INF/view/login.jsp
		return pageName;
	}
	
	/**
	 * 使用 {@link ModelAndView} 返回页面
	 *
	 * @param pageName 页面名称
	 * @return 页面
	 */
	@RequestMapping(path = "gotoPage2", method = {RequestMethod.GET})
	public ModelAndView gotoPage2(@RequestParam(value = "pageName", required = false) String pageName) {
		return new ModelAndView(pageName);
	}
}