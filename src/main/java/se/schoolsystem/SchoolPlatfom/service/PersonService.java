package se.schoolsystem.SchoolPlatfom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.schoolsystem.SchoolPlatfom.model.Person;
import se.schoolsystem.SchoolPlatfom.repository.PersonRepository;

@Service
public class PersonService {
    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public void addPerson(Person person){
        personRepository.save(person);
    }
}
