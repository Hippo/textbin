package rip.hippo.textbin.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import rip.hippo.textbin.model.MongoTextbin;

/**
 * @author Hippo
 * @version 1.0.0, 1/23/21
 * @since 1.0.0
 */
public interface TextbinRepository extends MongoRepository<MongoTextbin, Integer> {
}
