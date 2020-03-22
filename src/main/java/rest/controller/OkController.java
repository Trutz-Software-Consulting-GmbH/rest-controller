package rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class OkController {

	@GetMapping("/sayok")
	String sayok() {
		return "ok";
	}

}
