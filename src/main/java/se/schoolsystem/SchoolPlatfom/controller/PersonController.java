package se.schoolsystem.SchoolPlatfom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import se.schoolsystem.SchoolPlatfom.model.Person;
import se.schoolsystem.SchoolPlatfom.service.PersonService;

@RestController
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/")
    public void addPersons(@RequestBody Person person){
        personService.addPerson(person);
    }

    @PostMapping("/delete/{ssn}")
    public void deletePersonByssn(@PathVariable("ssn") String ssn){
        personService.deletePersonByssn(ssn);
    }

}
