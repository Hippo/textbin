package rip.hippo.textbin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rip.hippo.textbin.model.Textbin;
import rip.hippo.textbin.service.TextbinService;

/**
 * @author Hippo
 * @version 1.0.0, 1/23/21
 * @since 1.0.0
 */
@RestController
@RequestMapping("api")
public final class TextbinController {

    private final TextbinService textbinService;

    @Autowired
    public TextbinController(TextbinService textbinService) {
        this.textbinService = textbinService;
    }

    @PostMapping
    public int createTextbin(@RequestBody Textbin textbin) {
        return textbinService.getTextbinDao().createBin(textbin);
    }

    @GetMapping(path = "{id}")
    public ResponseEntity<Textbin> getTextbin(@PathVariable("id") int id) {
        Textbin bin = textbinService.getTextbinDao().getBin(id);
        if (bin == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.ok(bin);
    }

    @DeleteMapping
    public ResponseEntity<?> deleteMapping() {
        return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
    }

    @PutMapping
    public ResponseEntity<?> putMapping() {
        return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
    }
}
