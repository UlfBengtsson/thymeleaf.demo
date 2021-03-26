package se.lexicon.ulf.thymeleaf.demo.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Car {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    private String brand;
    private String modelName;
    private String regPlate;
    private String color;

    private int mileage;

    public Car() {
    }

    public Car(String brand, String modelName, String regPlate, String color, int mileage) {
        this.brand = brand;
        this.modelName = modelName;
        this.regPlate = regPlate;
        this.color = color;
        this.mileage = mileage;
    }

    public Car(UUID id,String brand, String modelName, String regPlate, String color, int mileage) {
        this.id = id;
        this.brand = brand;
        this.modelName = modelName;
        this.regPlate = regPlate;
        this.color = color;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id= " + ((id == null) ? "null" : id ) + '|' +
                " brand= " + ((brand == null) ? "null" : brand) + '|' +
                " modelName= " + ((modelName == null) ? "null" : modelName) + '|' +
                " regPlate= " + ((regPlate == null) ? "null" : regPlate) + '|' +
                " color= " + ((color == null) ? "null" : color) + '|' +
                " mileage= " + mileage + '}';
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getRegPlate() {
        return regPlate;
    }

    public void setRegPlate(String regPlate) {
        this.regPlate = regPlate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
