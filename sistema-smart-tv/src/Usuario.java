public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        
        // Liga a TV
        smartTv.ligar();

        // Diminuir volume em 5 pontos
        int i = 5;
        while (i > 0) {
            smartTv.diminuirVolume();
            i--;
        }

        // altera o canal para 35;
        smartTv.alterarCanal(25);

        // Alterar canal manualmente até o 35
        i = 10;
        while (i > 0) {
            smartTv.avancarCanal();
            i--;
        }
        System.out.println(smartTv.canal);

        // Volta ao canal 31
        i = 4;
        while (i > 0) {
            smartTv.retrocederCanal();
            i--;
        }
        System.out.println(smartTv.canal);

        // aumenta o volume para 50
        i = 30;
        while (i > 0) {
            smartTv.aumentarVolume();
            i--;
        }

        // desliga a tv
        smartTv.desligar();

        System.out.println("Estado final -> Energia: " + smartTv.ligada);
        System.out.println("Estado final -> Volume: " + smartTv.volume);
        System.out.println("Estado final -> Canal: " + smartTv.canal);
    }
}
