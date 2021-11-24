package io.reflectoring.tracing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    private static final Logger logger = LoggerFactory.getLogger(DemoController.class);

    @GetMapping(path="/hello")
    ResponseEntity<String> helloWorld(){
        logger.info("/hello endpoint called");
        return ResponseEntity.ok("hello");
    }

}
