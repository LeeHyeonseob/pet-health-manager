package swe_group_11.pethealthmanager.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import swe_group_11.pethealthmanager.DTO.PetDTO;
import swe_group_11.pethealthmanager.service.PetService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/pets")
public class PetController {

    //DI

    private PetService petService;

    //변경사항 받아서 view로
    @PostMapping
    public ResponseEntity<?> createPet(@RequestBody PetDTO petDTO) {
        PetDTO createdPet = petService.createPet(petDTO);
        return ResponseEntity.ok(createdPet);
    }
}
