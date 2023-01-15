package test;


import org.springframework.stereotype.Component;

import java.util.List;


public interface PersonRepository {
	void save(Person person);
	Person find(Long id);
	List findAll();
	void delete(Long id);
	void update(Person person);
}
