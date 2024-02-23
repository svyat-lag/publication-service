package storysphere.publicationservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/demo") // изменить на что-то типа http://localhost:8080/api/v1/client
    public String demo() {
        return "Demo";
    }
}
