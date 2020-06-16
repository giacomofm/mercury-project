package mock.mercury.controller;

import java.io.IOException;
import java.nio.file.Files;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Giacomo F.M.
 * @since 2020-06-16
 */
@RestController
public class MockingController {

	@GetMapping(value = "path/to/mock", produces = MediaType.APPLICATION_JSON_VALUE)
	public String mockJsonData() throws IOException {
		Resource data = new ClassPathResource("data.json");
		return new String(Files.readAllBytes(data.getFile().toPath()));
	}

}
