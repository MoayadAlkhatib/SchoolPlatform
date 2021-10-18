package se.schoolsystem.SchoolPlatfom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.schoolsystem.SchoolPlatfom.model.Person;

public interface PersonRepository extends JpaRepository<Person, String> {
}
