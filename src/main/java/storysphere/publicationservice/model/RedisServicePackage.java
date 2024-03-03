package storysphere.publicationservice.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Data
@RedisHash(value = "ServicePackage", timeToLive = 3600)
public class RedisServicePackage {

    @Id
    private String id;
    private RedisPublication publication;
    private List<RedisService> services;
    private RedisTariff tariff;
}
