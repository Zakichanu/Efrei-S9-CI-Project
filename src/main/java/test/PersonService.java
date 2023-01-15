package test;

public class PersonService {

    private PersonRepository repository;

    public void save(Person person) {
        repository.save(person);
    }
}
