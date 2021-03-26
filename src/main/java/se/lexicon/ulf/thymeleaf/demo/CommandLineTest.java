package se.lexicon.ulf.thymeleaf.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import se.lexicon.ulf.thymeleaf.demo.dao.CarRepository;
import se.lexicon.ulf.thymeleaf.demo.model.Car;

@Component
public class CommandLineTest implements CommandLineRunner
{
    private CarRepository carRepository;
    @Autowired
    public CommandLineTest(CarRepository carRepository)
    {
        this.carRepository= carRepository;
    }

    //Just seeding some cars so we have something to work with
    @Override public void run(String... args) throws Exception
    {
        Car[] cars = new Car[3];

        cars[0] = new Car("SAAB","900 Turbo", "ABC123","Blue",36000);
        cars[1] = new Car("Volvo","245", "CBA321","Brown",43000);
        cars[2] = new Car("BMW","525i", "CDE456","Black",26000);

        System.out.println("------------ before save -------------");
        for (Car aCar : cars ) {
            System.out.println(aCar);
        }

        System.out.println("------------ save to DB -------------");
        for (Car aCar : cars ) {
            carRepository.save(aCar);
        }

        System.out.println("------------ print after save -------------");
        for (Car aCar : cars ) {
            System.out.println(aCar);
        }
    }
}
