package pl.com.mcsystems.sfgdi.controllers;

import org.springframework.stereotype.Controller;
import pl.com.mcsystems.sfgdi.services.PetService;

@Controller
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}
