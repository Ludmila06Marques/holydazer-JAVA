import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Holidayzer {
  private List<Holiday> holidays = new ArrayList<>();

  public Holidayzer (Holiday[] holidays) {
    Collections.addAll(this.holidays, holidays);
  }

  public void checkDate(String date) {
    for(int i = 0; i < holidays.size(); i++) {
      if (Objects.equals(holidays.get(i).getDate(), date)) {
        System.out.println(holidays.get(i).getDescription());
        return;
      }
    }

    System.out.println("Não existe feriado nessa data");
  }

  public void getAllHolidays() {
    for(int i = 0; i < holidays.size(); i++) {
      System.out.println(this.holidays.get(i).getDate() + " - " + this.holidays.get(i).getDescription());
    }
  }
}