package ru.netology.hibernate.repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.netology.hibernate.model.Person;
import ru.netology.hibernate.model.PersonId;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, PersonId> {
    List<Person> findAllByCityOfLivingEquals(String city);

    List<Person> findAllByAgeIsLessThan(int age, Sort sort);

    Optional<Person> findByNameEqualsAndSurnameEquals(String name, String surname);

}
