package roman.skrypnyk.sfgpetclinic.services;

import roman.skrypnyk.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();

}
