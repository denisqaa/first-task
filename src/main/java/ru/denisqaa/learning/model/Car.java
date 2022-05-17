package ru.denisqaa.learning.model;

import lombok.Data;

@Data
public class Car {
  private Long id;
  private String model;
  private Long yearOfConstruction;
  private Long userId;
}
