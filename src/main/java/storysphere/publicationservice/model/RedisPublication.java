package storysphere.publicationservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.List;

@RedisHash("Publication")
public class RedisPublication {

    @Id
    private String id;
    private String title;
    private List<String> authors;
    private String description;
    private byte[] publicationFile;
    private byte[] coverImage;
    private List<String> geners;
}
