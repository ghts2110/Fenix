package com.fenix.api.controller;

import com.fenix.api.models.QDef;
import com.fenix.api.services.QDefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/q-defs")
public class QDefController {

    @Autowired
    private QDefService qDefService;

    @GetMapping
    public List<QDef> getAllQDefs() {
        return qDefService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<QDef> getQDefById(@PathVariable long id) {
        Optional<QDef> qDef = qDefService.findById(id);
        return qDef.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public QDef createQDef(@RequestBody QDef qDef) {
        return qDefService.save(qDef);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteQDef(@PathVariable long id) {
        qDefService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
