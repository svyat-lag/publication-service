package storysphere.publicationservice.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.List;

@Data
@RedisHash
public class RedisServicePackage {

    @Id
    private String id;
    private RedisPublication publication;
    private List<RedisService> services;
    private RedisTariff tariff;
}
