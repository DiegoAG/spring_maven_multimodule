package com.altia.formacion.spring.ejemplowebmaven.web;

import static org.springframework.web.bind.annotation.RequestMethod.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping(method=GET, value="/")
	public String home() {
		return "home";
	}
}
