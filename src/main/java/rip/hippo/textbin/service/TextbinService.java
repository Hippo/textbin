package rip.hippo.textbin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import rip.hippo.textbin.dao.TextbinDao;

/**
 * @author Hippo
 * @version 1.0.0, 1/23/21
 * @since 1.0.0
 */
@Service
public class TextbinService {

    private final TextbinDao textbinDao;

    @Autowired
    public TextbinService(@Qualifier("mongoTextbin") TextbinDao textbinDao) {
        this.textbinDao = textbinDao;
    }

    public TextbinDao getTextbinDao() {
        return textbinDao;
    }
}
