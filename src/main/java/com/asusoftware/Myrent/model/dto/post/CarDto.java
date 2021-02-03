package com.asusoftware.Myrent.model.dto.post;

import com.asusoftware.Myrent.model.Car;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

/**
 * My-rent Created by Antonio on 2/3/2021
 */
@Getter
@Setter
public class CarDto {

    @NotBlank private String brand;
    @NotBlank private String model;
    @NotBlank private String engine;
    @NotBlank private String hp;
    @NotBlank private String year;
    @NotBlank private String tires;
    @NotBlank private String color;

    public static Car toEntity(CarDto carDto) {
        Car car = new Car();
        car.setBrand(carDto.getBrand());
        car.setModel(carDto.getModel());
        car.setEngine(carDto.getEngine());
        car.setHp(carDto.getHp());
        car.setYear(carDto.getYear());
        car.setTires(carDto.getTires());
        car.setColor(carDto.getColor());
        return car;
    }

    public static CarDto toDto(Car car) {
        CarDto carDto = new CarDto();
        carDto.setBrand(car.getBrand());
        carDto.setModel(car.getModel());
        carDto.setEngine(car.getEngine());
        carDto.setHp(car.getHp());
        carDto.setYear(car.getYear());
        carDto.setTires(car.getTires());
        carDto.setColor(car.getColor());
        return carDto;
    }
}
