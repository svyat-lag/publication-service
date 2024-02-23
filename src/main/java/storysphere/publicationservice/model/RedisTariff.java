package storysphere.publicationservice.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.List;

@Data
@RedisHash
public class RedisTariff {

    @Id
    private String id;
    private String name;
    private int publicationPrice;
    private int royalty;
    private List<String> conditions;
}
