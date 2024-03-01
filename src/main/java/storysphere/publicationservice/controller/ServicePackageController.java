package storysphere.publicationservice.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import storysphere.publicationservice.model.RedisServicePackage;
import storysphere.publicationservice.service.RedisServicePackageService;

@RestController
@AllArgsConstructor
public class ServicePackageController {

    private final RedisServicePackageService servicePackageService;

    @PostMapping("/addPublication")
    @ResponseStatus(HttpStatus.CREATED)
    public void addPublication(@RequestBody RedisServicePackage servicePackage) {
        servicePackageService.addPublication(servicePackage);
    }
}
