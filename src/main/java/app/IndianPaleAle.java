package app;

import static app.Taste.*;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class IndianPaleAle implements Beer {

  private static final double MAXIMUM_PERCENTAGE = 3.8;
  private static final double MINIMUM_PERCENTAGE = 3.7;
  
  @Override
  public double getAlcoholByVolume() {
    return MINIMUM_PERCENTAGE + (MAXIMUM_PERCENTAGE - MINIMUM_PERCENTAGE) * new Random().nextDouble();
  }
  
  @Override
  public List<Taste> getTastes() {
    return Arrays.asList(SPICY, LEMONNY);
  }
  
}
