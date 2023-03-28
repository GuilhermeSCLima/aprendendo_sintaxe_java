public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        //Tipos primitivos
        byte tipoByte = 127;
        short tipoShort = 32767;
        char tipoChar = 'C';
        float tipoFloat = 2.6f;
        double tipoDouble = 3.59;
        int tipoInt = 2147483647;
        long tipoLong = 9223372036854775807L;
        boolean tipoBooleano = true;
        //exemplos:
        byte idade = 123;
		short ano = 2021;
		int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
		long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
		float pi = 3.14F;
		double salario = 1275.33;

        //explicação double/float
        double slarioMinimo = 1.200; // é igual a 1,200
        double slarioMinimo2 = 1200; // é igual a 1.200

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        // short numeroCurto2 = numeroNormal; // Erro pois o int pode ser superior ao short em algum momento

        //Constante
        final String MY_FULL_NAME = "João Guilherme S. C. Lima";
    }
}
