package rip.hippo.textbin.dao;

import rip.hippo.textbin.model.Textbin;

/**
 * @author Hippo
 * @version 1.0.0, 1/22/21
 * @since 1.0.0
 */
public interface TextbinDao {
    int createBin(Textbin textbin);
    Textbin getBin(int id);
}
