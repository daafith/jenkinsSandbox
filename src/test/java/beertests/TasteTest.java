package beertests;

import static app.Taste.LEMONNY;
import static app.Taste.SPICY;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import app.IndianPaleAle;

public class TasteTest {

  @Test
  public void ipa_should_taste_lemmony_and_spicy() {
    MatcherAssert.assertThat(true, Matchers.equalTo(false));
    System.out.println(new IndianPaleAle().getTastes().size());
    MatcherAssert.assertThat(new IndianPaleAle().getTastes(), Matchers.contains(SPICY, LEMONNY));
  }

}
