package com.routeplan.risVaje.Controller;

import com.routeplan.risVaje.Models.Vozila;
import com.routeplan.risVaje.Repo.VozilaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/vozila")
public class VozilaContr {
    @Autowired
    private VozilaRepo vozilaDao;

    @GetMapping("")
    public Iterable<Vozila> vrniVsaVozila() {
        return vozilaDao.findAll();
    }

    @GetMapping("{id}")
    public Optional<Vozila> vrniVoziloID(@PathVariable(name="id") Long id) {
        return vozilaDao.findById(id);
    }

    @PostMapping("")
    public Vozila dodajVozilo(@RequestBody Vozila vozila) {
        return vozilaDao.save(vozila);
    }

    @PutMapping("{id}")
    public Vozila spremeniVozilo(@PathVariable(name="id") Long id, @RequestBody Vozila vozila) {

        if(!vozilaDao.existsById(id))
            return null;

        vozila.setId(id);
        return vozilaDao.save(vozila);
    }


    @GetMapping("/model/{model}/proizvajalec/{proizvajalec}")
    public Iterable<Vozila> vrniVozilo(@PathVariable(name = "model") String model, @PathVariable(name = "proizvajalec") String proizvajalec) {
        return vozilaDao.vrniVozilo(model, proizvajalec);
    }

    @DeleteMapping("{id}")
    public Boolean IzbrisiVozilo(@PathVariable(name="id") Long id) {

        if(!vozilaDao.existsById(id))
            return false;
        vozilaDao.deleteById(id);
        return true;
    }

}