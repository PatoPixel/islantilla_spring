package com.soltel.islantilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class IslantillaApplication {
	

	    @RequestMapping(value = "/")
	    public String index() {
	        return "<h1>Primera prueba</h1>";
	    }
	
	
	public static void main(String[] args) {
		SpringApplication.run(IslantillaApplication.class, args);
	}

}
