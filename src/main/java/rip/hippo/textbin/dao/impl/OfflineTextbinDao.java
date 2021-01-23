package rip.hippo.textbin.dao.impl;

import org.springframework.stereotype.Repository;
import rip.hippo.textbin.dao.TextbinDao;
import rip.hippo.textbin.model.Textbin;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hippo
 * @version 1.0.0, 1/22/21
 * @since 1.0.0
 */
@Repository("offlineTextbin")
public class OfflineTextbinDao implements TextbinDao {

    private final List<Textbin> textbins = new ArrayList<>();

    @Override
    public int createBin(Textbin textbin) {
        textbins.add(textbin);
        return textbins.size() - 1;
    }

    @Override
    public Textbin getBin(int id) {
        if (id >= textbins.size()) {
            return null;
        }
        return textbins.get(id);
    }
}
