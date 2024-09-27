package com.example.mahak.springcrud.controllers;

import com.example.mahak.springcrud.models.Characters;
import com.example.mahak.springcrud.services.CRUDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MarvelCrudController {
    @Autowired
    CRUDService crudService;
    @PostMapping(path = "create")
    public void createSuperHero(@RequestBody Characters superhero){
        crudService.createSuperhero(superhero);
    }
    //localhost:8080/read?id=1
    @GetMapping("read")
    public Characters readSuperHeroById(@RequestParam (name="id") int val){
        return crudService.readSuperHeroById(val);
    }
    //update api endpoint
    @PutMapping("update")
    public void updateSuperHeroHumanName(@RequestBody Characters superhero, @RequestParam(name="id") int id){
        crudService.updateSuperHeroHumanName(superhero, id);
    }

    @DeleteMapping("delete")
    public void deleteSuperHero(@RequestParam(name="id") int id){
        crudService.deleteSuperHero(id);
    }

    @GetMapping("read-all")
    public List<Characters> readAllSupeHeroes(){
        return crudService.readAllSuperheroes();
    }
}
