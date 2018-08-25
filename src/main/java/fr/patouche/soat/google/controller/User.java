package fr.patouche.soat.google.controller;

import java.security.Principal;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableOAuth2Sso
public class User {

	@RequestMapping("/user")
	public Principal user(Principal principal) {
		return principal;
	}
}
