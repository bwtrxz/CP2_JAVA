package com.example.Controller;
import com.example.Entity.Brinquedo;
import com.example.Repository.BrinquedoRepository;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/brinquedos")
public class BrinquedoController {
    public final BrinquedoRepository brinquedoRepository;
    public BrinquedoController(BrinquedoRepository brinquedoRepository) {
        this.brinquedoRepository = brinquedoRepository;
    }

    @GetMapping
    public List<Brinquedo> getAllBrinquedos() {
        return brinquedoRepository.findAll();
    }

    @PostMapping
    public Brinquedo addBrinquedo(@RequestBody Brinquedo brinquedo) {
        return brinquedoRepository.save(brinquedo);
    }
}
