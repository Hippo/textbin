package rip.hippo.textbin.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Hippo
 * @version 1.0.0, 1/22/21
 * @since 1.0.0
 */
public final class Textbin {

    private final String content;

    public Textbin(@JsonProperty("content") String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
