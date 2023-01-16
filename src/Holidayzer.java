import java.util.HashMap;
import java.util.Map;

public class Holidayzer {

  Map<String , String> feriados = new HashMap<>();
  public Holidayzer(){
    montaFeriado();
  }


  public void ehFeriado(String feriado){
    String pegaFeriado = feriados.get(feriado);
    if(pegaFeriado== null){
      System.out.println("Este feriado nao existe");
      return;

    }
    System.out.println("A data "+ feriado + " corresponde ao feriado de "+ pegaFeriado);
  }
  public void listaFeriado(){
    feriados.forEach((key , value)-> System.out.println("data: "+ key +" "+ value));
  }

  public void montaFeriado(){
    feriados.put("01/01/2023","Confraternização mundial");
    feriados.put("21/02/2023", "Carnaval");
    feriados.put("17/04/2023","Páscoa");
    feriados.put("21/04/2023","Tiradentes");
    feriados.put("01/05/2023","Dia do trabalho");
    feriados.put("08/06/2023","Corpus Christi");
    feriados.put("07/09/2023","Independência do Brasil");
    feriados.put("12/10/2023" ,"Nossa Senhora Aparecida");
 
    

    
  }
 
}