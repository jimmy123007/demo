package cn.gogo.jedis;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* @author 郭明
* @date 2017年7月14日下午10:13:50
* @version 1.0
*/

@Controller
public class TestJsonp {

	@RequestMapping("/testJsonp")
	@ResponseBody
public 	Map  testJsonp(HttpServletRequest request){
		
		Map map=new HashMap();
		map.put("flag", 1);
		map.put("data",333);
		return map;
		
	}
	
	
}
