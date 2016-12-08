package app;

import static app.Taste.BITTER;
import static app.Taste.DARK;
import static app.Taste.HOPPY;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Stout implements Beer {

  private static final double MAXIMUM_PERCENTAGE = 6.8;
  private static final double MINIMUM_PERCENTAGE = 6.5;

  public double getAlcoholByVolume() {
    return MINIMUM_PERCENTAGE + (MAXIMUM_PERCENTAGE - MINIMUM_PERCENTAGE) * new Random().nextDouble();
  }

  @Override
  public List<Taste> getTastes() {
    return Arrays.asList(BITTER, DARK, HOPPY);
  }

}
