package kr.ac.hansung.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller //@Component + alpha :빈으로 추가해주면서 컨트롤러 역할을 해
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showhome(HttpServletRequest request, Locale locale, Model model) {
		
		logger.info("info level: Welcome home! The Client locale is {}", locale);
		
		String url = request.getRequestURI().toString();
		String clientIpaddress = request.getRemoteAddr();
		
		logger.info("Request URL: " + url);
		logger.info("Client IP: " + clientIpaddress);
		
		return "home";
	}
	
}
