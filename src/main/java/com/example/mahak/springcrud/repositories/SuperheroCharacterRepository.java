package com.example.mahak.springcrud.repositories;

import com.example.mahak.springcrud.models.Characters;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuperheroCharacterRepository extends JpaRepository<Characters, Integer> {
}
