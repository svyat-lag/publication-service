package storysphere.publicationservice.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@Data
@RedisHash("Service")
public class RedisService {

    @Id
    private String id;
    private String title;
    private String description;
    private int price;
    private int step;
}
