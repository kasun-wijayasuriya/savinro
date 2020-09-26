/**
 * 
 */
package com.bit.savinro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Kasun Nalinda
 *
 */
@Controller
public class TestController {
	
	@GetMapping("/home")
	public String home(Model model) {
		return "home";
	}
	
	@GetMapping("/index")
	public String index(Model model) {
		return "index";
	}

}
