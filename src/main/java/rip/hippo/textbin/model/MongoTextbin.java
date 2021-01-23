package rip.hippo.textbin.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Hippo
 * @version 1.0.0, 1/23/21
 * @since 1.0.0
 */
@Document(collection = "textbin")
public final class MongoTextbin {

    @Id
    private final int id;
    private final Textbin textbin;

    public MongoTextbin(int id, Textbin textbin) {
        this.id = id;
        this.textbin = textbin;
    }

    public int getId() {
        return id;
    }

    public Textbin getTextbin() {
        return textbin;
    }
}
