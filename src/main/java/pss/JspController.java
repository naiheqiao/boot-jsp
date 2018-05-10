package pss;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JspController {
	
	/**
	 *
	 * Error resolving template "indexJsp", template might not exist or 
	 * might not be accessible by any of the configured Template Resolvers
	 * @param map
	 * @return
	 */
	@RequestMapping("/jspIndex")
	public String hello(Map<String,Object> map) {
		map.put("name", "小石潭记");
		map.put("age", 29);
		return "/indexJsp";
	}
}
