public class App {
  public static void main(String[] args) throws Exception {
    Holiday holiday1 = new Holiday("01/01/2023", "Confraternização mundial");
    Holiday holiday2 = new Holiday("21/02/2023", "Carnaval");
    Holiday holiday3 = new Holiday("17/04/2023", "Páscoa");
    Holiday holiday4 = new Holiday("21/04/2023", "Tiradentes");
    Holiday holiday5 = new Holiday("01/05/2023", "Dia do trabalho");
    Holiday holiday6 = new Holiday("08/06/2023", "Corpus Christi");
    Holiday holiday7 = new Holiday("07/09/2023", "Independência do Brasil");
    Holiday holiday8 = new Holiday("12/10/2023", "Nossa Senhora Aparecida");
    Holiday holiday9 = new Holiday("02/11/2023", "Finados");
    Holiday holiday10 = new Holiday("15/11/2023", "Proclamação da República");
    Holiday holiday11 = new Holiday("25/12/2023", "Natal");

    Holiday[] holidays = {holiday1, holiday2, holiday3, holiday4, holiday5, holiday6, holiday7, holiday8, holiday9, holiday10, holiday11};

    Holidayzer holidayzer = new Holidayzer(holidays);

    holidayzer.checkDate("08/06/2023");
    holidayzer.checkDate("25/12/2023");
    holidayzer.getAllHolidays();
  }
}