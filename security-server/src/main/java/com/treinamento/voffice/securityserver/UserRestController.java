package com.treinamento.voffice.securityserver;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/users")
public class UserRestController {

	@RequestMapping("/current")
	public Principal current(Principal principal) {
		return principal;
	}

	@RequestMapping("/ping")
	public ResponseEntity<String> ping() {
		return ResponseEntity.ok("ping: " + System.currentTimeMillis());
	}

}
