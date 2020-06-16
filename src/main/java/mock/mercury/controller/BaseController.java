package mock.mercury.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Giacomo F.M.
 * @since 2020-06-16
 */
@RestController
public class BaseController {

	@GetMapping("greeting")
	public String greeting() {
		return "Welcome!";
	}

	@GetMapping("favicon.ico")
	public File favicon() throws IOException {
		Resource favicon = new ClassPathResource("classpath:static/favicon.ico");
		return favicon.getFile();
	}

}
