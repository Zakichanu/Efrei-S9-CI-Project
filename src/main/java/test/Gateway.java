package test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;


public class Gateway {
    private Logger logger = LoggerFactory.getLogger(Gateway.class);
    @Autowired
    private EntityManager entityManager;

    public void saveData(Object data) {
        entityManager.persist(data);
        logger.info("Data saved to the database: " + data);
    }
}
