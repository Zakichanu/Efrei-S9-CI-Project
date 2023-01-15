package test;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class PersonRepositoryImpl implements PersonRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(Person person) {
        entityManager.persist(person);
    }

    @Override
    public Person find(Long id) {
        return entityManager.find(Person.class, id);
    }

    @Override
    public List findAll() {
        return entityManager.createQuery("select p from Person p").getResultList();
    }

    @Override
    public void delete(Long id) {
        entityManager.remove(id);
    }

    @Override
    public void update(Person person) {
        entityManager.merge(person);
    }
}

