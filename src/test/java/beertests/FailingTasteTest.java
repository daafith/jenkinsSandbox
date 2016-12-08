package beertests;

import static app.Taste.SPICY;
import static app.Taste.SUNNY;

import java.util.Arrays;
import java.util.List;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import app.IndianPaleAle;
import app.Taste;

public class FailingTasteTest {

  private static final List<Taste> IPA_TASTES = Arrays.asList(SUNNY, SPICY);
  
  @Test
  public void ipa_should_taste_sunny_and_spicy() {
    MatcherAssert.assertThat(new IndianPaleAle().getTastes(), Matchers.containsInAnyOrder(IPA_TASTES));
  }

}
