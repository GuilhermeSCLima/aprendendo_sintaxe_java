public class AboutMe {
  public static void main(String[] args) {
    
    String name = args[0];
    String surname = args[1];
    Integer age = Integer.valueOf(args[2]);
    Double height = Double.valueOf(args[3]);

    System.out.println("Olá me chamo " + name + " " + surname);
    System.out.println("Tenho " + age + " anos");
    System.out.println("minha altura é " + height + "m");
  }
}
