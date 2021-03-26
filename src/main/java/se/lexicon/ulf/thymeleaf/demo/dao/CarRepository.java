package se.lexicon.ulf.thymeleaf.demo.dao;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.ulf.thymeleaf.demo.model.Car;

import java.util.List;
import java.util.UUID;

public interface CarRepository extends CrudRepository<Car, UUID> {
    List<Car> findByBrand(String brand);
    List<Car> findByModelName(String modelName);
    List<Car> findByColor(String color);
    List<Car> findByRegPlate(String regPlate);
    List<Car> findByMileageLessThan(int mileage);
    List<Car> findByMileageGreaterThan(int mileage);
    List<Car> findByMileageBetween(int lowestMileage, int highestMileage);
}
/*
Look at Spring docs for more info
https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation
 */