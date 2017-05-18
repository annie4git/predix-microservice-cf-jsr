package com.ge.predix.solsvc.boot;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConnectController {

	@RequestMapping(value = "/connect", method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	Greet connect(@RequestBody Greet url) {
		final String methodName = "ConnectController.connect(): ";

		System.out.println(methodName + "url=" + url.getMessage());
		HttpConnect.getConnect(url.getMessage());

		return new Greet(HttpConnect.getConnect(url.getMessage()));
		
	}

}
