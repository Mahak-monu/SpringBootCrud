package com.example.mahak.springcrud.services;

import com.example.mahak.springcrud.models.Characters;
import com.example.mahak.springcrud.repositories.SuperheroCharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CRUDService {
    @Autowired
    SuperheroCharacterRepository superheroCharacterRepository;
    public void createSuperhero(Characters character){
        superheroCharacterRepository.save(character);

    }
    public Characters readSuperHeroById(int val){
        return superheroCharacterRepository.findById(val).get();
    }
    public void updateSuperHeroHumanName(Characters superhero, int id){
        Characters  superheroToBeUpdated = readSuperHeroById(id);
        superheroToBeUpdated.setHumanName(superhero.getHumanName());
        superheroCharacterRepository.save(superheroToBeUpdated);

    }
    public void deleteSuperHero(int id){
        superheroCharacterRepository.deleteById(id);
    }
    public List<Characters> readAllSuperheroes(){
        return superheroCharacterRepository.findAll();
    }
}
