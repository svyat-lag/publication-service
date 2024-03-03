package storysphere.publicationservice.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import storysphere.publicationservice.model.RedisServicePackage;
import storysphere.publicationservice.repository.RedisServicePackageRepository;

@Service
@AllArgsConstructor
public class RedisServicePackageService {

    private final RedisServicePackageRepository servicePackageRepository;

    public void addPublication(RedisServicePackage servicePackage) {
        servicePackageRepository.save(servicePackage);
    }
}
