package se.schoolsystem.SchoolPlatfom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
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

    @GetMapping
    public String helloworld(){
        return "hello world";
    }

}
