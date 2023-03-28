public class Operadores {
    public static void main(String[] args) throws Exception {
        // Atribuição (=)
        String nome = "Guilherme";

        // Aritméticos
        // ==/ + /==/ - /==/ * /==/ / /==/ % /==
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado1 = (10 * 7) + (20 / 4);
        //!!! Observação que ao usar o operador (+) em variaveis do tipo texto, ele exercerá função de concatenação.

        String LinguagemAtual = "LINGUAGEM" + " " + "JAVA";

        String concatenacao = "?";
        System.out.println(concatenacao); //=> ?
        
        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao); //=> 31
        
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao); //=> 1111
        
        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao); //=> 1111
        
        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao); //=> 1111
        
        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao); //=> 13

        // Unários
        // ==/ + /==/ - /==/ ++ /==/ -- /==/ ! /==

        int numero = 5;
        System.out.println(-numero); //=> -5
        System.out.println(numero); //=> 5
        numero = -numero;
        System.out.println(numero); //=> -5
        numero = numero * -1;
        System.out.println(numero); //=> 5

        System.out.println(numero++); //=> 5 //=> pois ele imprime primeiro o resultado e depois soma
        System.out.println(numero); //=> 6
        System.out.println(++numero); //=> 7 //=> pois ele soma primeiro e depois imprime o resultado

        System.out.println(numero--); //=> 7 //=> pois ele imprime primeiro o resultado e depois subtrai
        System.out.println(numero); //=> 6
        System.out.println(--numero); //=> 5 //=> pois ele subtrai primeiro e depois imprime o resultado

        boolean variavel = true;

        System.out.println(!variavel); //=> false
        System.out.println(variavel); //=> true
        
        variavel = !variavel;
        System.out.println(variavel); //=> false

        // Ternario
        // ==/ ?: /==

        int a,b;

        a = 5;
        b = 6;

        String resultado;

        if (a == b) resultado = "verdadeiro";
        else resultado = "falso";

        System.out.println(resultado);

        String resultado2 = a==b ?"verdadeiro" :"falso";
        System.out.println(resultado2);

        // Relacionais
        // ==/ == /==/ != /==/ > /==/ >= /==/ < /==/ <= /==/

        int numero1 = 1;
        int numero2 = 2;

        String igualdade = numero1 == numero2? "numero 1 e 2 são iguais ": "numero 1 e 2 não são iguais ";
        String diferenca = numero1 != numero2? "numero 1 e 2 são diferentes ": "numero 1 e 2 não são diferentes ";
        String maiorQue = numero1 > numero2? "numero 1 é maior que o numero 2 ": "numero 1 não é maior que o numero 2 ";
        String maiorOuIgualQue = numero1 >= numero2? "numero 1 é maior ou igual que o numero 2 ": "numero 1 não é maior ou igual que o numero 2 ";
        String menorQue = numero1 < numero2? "numero 1 é menor que o numero 2 ": "numero 1 não é menor que o numero 2 ";
        String menorOuIgualQue = numero1 <= numero2? "numero 1 é menor ou igual que o numero 2 ": "numero 1 não é menor ou igual que o numero 2 ";

        System.out.println(igualdade + "(==)");
        System.out.println(diferenca + "(!=)");
        System.out.println(maiorQue + "(>)");
        System.out.println(maiorOuIgualQue + "(>=)");
        System.out.println(menorQue + "(<)");
        System.out.println(menorOuIgualQue + "(<=)");

        // Logicos
        // ==/ && /==/ || /==

        boolean condicao1 = false;
        boolean condicao2 = false;

        if(condicao1 && condicao2) System.out.println("As duas condições são verdadeiras");
        else if (condicao1 || condicao2) System.out.println("Uma das condições são verdadeiras");
        else System.out.println("Nenhuma das condições são verdadeiras");
    }
}
