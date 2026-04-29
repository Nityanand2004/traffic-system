package com.example.trafficsystem.controller;

import com.example.trafficsystem.entity.Violation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/violations")
public class ViolationController {

    // GET (no DB)
    @GetMapping
    public List<Violation> getAll() {
        return List.of();
    }

    // POST (no DB)
    @PostMapping
    public Violation save(@RequestBody Violation v) {
        return v;
    }

    // DELETE (no DB)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        // do nothing
    }
}