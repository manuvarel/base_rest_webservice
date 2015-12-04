package com.company.project.webservices;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/service")
public class RestService {

	@RequestMapping(value = "/ping", method = RequestMethod.GET)
	public String ping(@RequestParam(value = "message") String message) {
		return message + " returned";
	}

}
