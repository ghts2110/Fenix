package com.fenix.api.controller;

import com.fenix.api.models.SitTrabModel;
import com.fenix.api.services.SitTrabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sit-trabs")
public class SitTrabController {

    @Autowired
    private SitTrabService sitTrabService;

    @GetMapping
    public List<SitTrabModel> getAllSitTrabs() {
        return sitTrabService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SitTrabModel> getSitTrabById(@PathVariable long id) {
        Optional<SitTrabModel> sitTrab = sitTrabService.findById(id);
        return sitTrab.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public SitTrabModel createSitTrab(@RequestBody SitTrabModel sitTrabModel) {
        return sitTrabService.save(sitTrabModel);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSitTrab(@PathVariable long id) {
        sitTrabService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
