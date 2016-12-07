package app;

import java.util.Random;

public class Stout implements Beer {

  private static final double MAXIMUM_PERCENTAGE = 6.8;
  private static final double MINIMUM_PERCENTAGE = 6.5;

  public double getAlcoholByVolume() {
    return MINIMUM_PERCENTAGE + (MAXIMUM_PERCENTAGE - MINIMUM_PERCENTAGE) * new Random().nextDouble();
  }

}
