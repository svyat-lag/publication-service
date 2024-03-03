package storysphere.publicationservice.repository;

import org.springframework.data.repository.CrudRepository;
import storysphere.publicationservice.model.RedisServicePackage;

public interface RedisServicePackageRepository extends CrudRepository<RedisServicePackage, String> {
}
