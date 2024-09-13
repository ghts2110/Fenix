package com.fenix.api.controller;

import com.fenix.api.models.ExpProf;
import com.fenix.api.services.ExpProfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/exp-profs")
public class ExpProfController {

    @Autowired
    private ExpProfService expProfService;

    @GetMapping
    public List<ExpProf> getAllExpProfs() {
        return expProfService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ExpProf> getExpProfById(@PathVariable long id) {
        Optional<ExpProf> expProf = expProfService.findById(id);
        return expProf.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ExpProf createExpProf(@RequestBody ExpProf expProf) {
        return expProfService.save(expProf);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteExpProf(@PathVariable long id) {
        expProfService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
