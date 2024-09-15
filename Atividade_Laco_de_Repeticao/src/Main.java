import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // inicializaçao; condiçaõ; incremento
        // ++ -> vai somar +1 i = i + 1

        // String[] nomesJogadores = new String[10];
        //Scanner sc = new Scanner(System.in);
        //for (int i = 0; i < 10;  i++){
        //  System.out.println("Informe o nome do play "+i);
        // nomesJogadores[i] = sc.next();

        //Pedir o nome do time A
        //pedir os nomes do time A (5 nomes )
        //pedir o nome do time B
        // pedir o nome do time B( 5 nomes)
        String timeA = "";
        String timeB = "";
        String[] jogadoresA = new String[5];
        String[] jogadoresB = new String[5];

        Scanner sc = new Scanner(System.in);

        System.out.println("Imforme o nome do time A ");
        timeA = sc.nextLine();
        System.out.println("Imforme o nome do time B ");
        timeB = sc.nextLine();


        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o nome do jogador do time A " + i);
            jogadoresA[i] = sc.next();

        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o nome do jogador do time B  " + i);
            jogadoresB[i] = sc.next();
        }

        System.out.println("Nome do Time A: "+timeA);


        for (int i = 0; i < 5; i++) {

            System.out.println("O nomme do jogador do time A : " + jogadoresA[i]);

        }

        System.out.println("Nome do Time B: "+timeB);
        for (int i = 0; i < 5; i++) {

            System.out.println("O nomme do jogador do time  B : " + jogadoresB[i]);
        }

    }
}