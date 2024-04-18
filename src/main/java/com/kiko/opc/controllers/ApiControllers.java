package com.kiko.opc.controllers;

import com.kiko.opc.models.OpCharacter;
import com.kiko.opc.repo.CharacterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiControllers {

    @Autowired
    private CharacterRepo characterRepo;

    @GetMapping(value="/")
    public String getPage(){
        return "Hello";
    }

    @GetMapping(value="/characters")
    public List<OpCharacter> getCharacter(){
        return characterRepo.findAll();
    }

    @PostMapping(value="/save")
    public String saveCharacter(@RequestBody OpCharacter character){
        characterRepo.save(character);
        return "Saved successfully!";
    }

    @PutMapping(value = "update/{id}")
    public String updateCharacter(@PathVariable long id, @RequestBody OpCharacter character){
        OpCharacter updatedCharacter = characterRepo.findById(id).get();
        updatedCharacter.setAge(character.getAge());
        updatedCharacter.setName(character.getName());
        updatedCharacter.setOccupation(character.getOccupation());
        updatedCharacter.setDfPower(character.getDfPower());
        characterRepo.save(updatedCharacter);
        return "Character with ID: " + id + " updated successfully";
    }

    @DeleteMapping(value = "delete/{id}")
    public String deleteCharacter(@PathVariable long id){
        OpCharacter characterToDelete = characterRepo.findById(id).get();
        characterRepo.delete(characterToDelete);
        return "Deleted successfully";
    }

}
