package rip.hippo.textbin.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import rip.hippo.textbin.dao.TextbinDao;
import rip.hippo.textbin.model.MongoTextbin;
import rip.hippo.textbin.model.Textbin;
import rip.hippo.textbin.mongo.TextbinRepository;

import java.util.Optional;

/**
 * @author Hippo
 * @version 1.0.0, 1/23/21
 * @since 1.0.0
 */
@Repository("mongoTextbin")
public class MongoTextbinDao implements TextbinDao {

    private final TextbinRepository textbinRepository;

    @Autowired
    public MongoTextbinDao(TextbinRepository textbinRepository) {
        this.textbinRepository = textbinRepository;
    }

    @Override
    public int createBin(Textbin textbin) {
        int size = textbinRepository.findAll().size();
        textbinRepository.insert(new MongoTextbin(size, textbin));
        return size;
    }

    @Override
    public Textbin getBin(int id) {
        MongoTextbin mongoTextbin = textbinRepository.findById(id).orElse(null);
        return mongoTextbin == null ? null : mongoTextbin.getTextbin();
    }
}
