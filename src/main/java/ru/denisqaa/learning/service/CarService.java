package ru.denisqaa.learning.service;

import java.util.List;
import ru.denisqaa.learning.model.Car;

public interface CarService {
  List<Car> getCarsByUserId(Long userId);
  void addCar(String model, Long constructionYear);
  void deleteCarById(Long carId);
  void createCarsTable();
  void cleanCarsTable();
}
