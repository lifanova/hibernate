package ru.netology.hibernate.repository;

import lombok.Data;
import org.springframework.stereotype.Repository;
import ru.netology.hibernate.model.Person;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
@Data
public class PersonRepository {
    @PersistenceContext
    private final EntityManager entityManager;
    public List<Person> getPersonsByCity(String city) {
        TypedQuery<Person> query = entityManager.createQuery("select p from Person p where p.cityOfLiving=:city", Person.class);

        return query.setParameter("city", city).getResultList();
    }
}
