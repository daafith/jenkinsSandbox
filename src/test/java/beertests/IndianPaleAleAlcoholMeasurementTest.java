package beertests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

import java.util.Arrays;
import java.util.List;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import app.IndianPaleAle;

@RunWith(Parameterized.class)
public class IndianPaleAleAlcoholMeasurementTest {

  @Parameters
  public static List<Object[]> data() {
      return Arrays.asList(new Object[20][0]);
  }
  
  @Test
  public void twenty_ipas_should_have_acceptable_alcohol_by_volume_percentage() {
    double alcoholByVolume = new IndianPaleAle().getAlcoholByVolume();
    System.out.println(alcoholByVolume);
    assertThat(alcoholByVolume, closeTo(3.75, 0.5));
  }
  
  @Test
  public void fout() {
    assertThat(true, Matchers.equalTo(false));
  }

}
