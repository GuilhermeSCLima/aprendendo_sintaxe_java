package edu.guilherme.primeirasemana;
public class MinhaClasse {
  public static void main(String[] args) {

    int ano = 2023;
    ano = 2024; //pode ser alterado;

    final String BR = "Brasil"; //não pode ser alterado (por convenção se escreve toda em maiuscula)

    // varialvel = Tipo nomeBemDefinido = Atribuição? (opcional);
    String myFirstName = "Guilherme";
    String myLastName = "Lima";
    String fullName = nomeCompleto(myFirstName, myLastName);

    int yearOfBirth = 2001;

    boolean alive = true;

    alive = false;

    System.out.println("Hello World");
    System.out.println(fullName);
  }
  
  // Metodos = TipoRetorno nomeObjetivoNoInfinitivo Parametro(s)
  public static String nomeCompleto(String primeiroNome, String segundoNome) {
    return primeiroNome.concat(" ").concat(segundoNome);
  }
  
}