package storysphere.publicationservice.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import storysphere.publicationservice.model.RedisServicePackage;
import storysphere.publicationservice.service.RedisServicePackageService;

@RestController
@RequestMapping("/publication-service/api/v0.0.1")
@AllArgsConstructor
public class ServicePackageController {

    private final RedisServicePackageService servicePackageService;

    @PostMapping("/add-publication")
    @ResponseStatus(HttpStatus.CREATED)
    public void addPublication(@RequestBody RedisServicePackage servicePackage) {
        servicePackageService.addPublication(servicePackage);
    }
}
