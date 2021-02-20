/**
 * @author Varun
 *
 */
package com.vanaru.labs.dev.sso.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Varun
 *
 */

@RestController
public class SsoController {
	@GetMapping("/")
	public String loggedIn(Principal principal) {
		return "Welcome " + principal.getName() + " !"; 
	}
	
}