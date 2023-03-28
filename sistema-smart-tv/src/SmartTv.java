public class SmartTv {
  boolean ligada = false;
  int canal = 1;
  int volume = 25;

  public void ligar() {
    ligada = true;
    System.out.println("Ligou");
  }
  
  public void desligar() {
    ligada = false;
    System.out.println("Desligou");
  }
  
  public void aumentarVolume() {
    volume++;
    System.out.println("Aumentou o volume");
  }
  
  public void diminuirVolume() {
    volume--;
    System.out.println("Diminui o volume");
  }
  
  public void alterarCanal(int canal) {
    this.canal = canal;
    System.out.println("Canal alterado para " + canal);
  }
  
  public void avancarCanal() {
    canal++;
    System.out.println("avançou canal");
  }
  
  public void retrocederCanal() {
    canal--;
    System.out.println("retrocedeu canal");
  }
}