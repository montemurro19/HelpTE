package br.com.helpte;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class teste {

	@GetMapping("/teste")
	ResponseEntity<String> all() {
		return ResponseEntity.ok("Hello world");
	}	
}
