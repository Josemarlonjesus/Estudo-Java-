import java.util.Scanner;

public class estruturawhile {
    public static void main(String[] args ){
        Scanner input = new Scanner(System.in);
        int numero = 0;
        // essa variavel acima funciona com qualquer numero tirando o escolhido na função
        while(numero != 10){
            System.out.print("DIGITE UM NUMERO: ");
            numero = input.nextInt();
            //numero = input.nextInt(); isso é novo nao sabia que pode adicionar a variavel a cima do while
            // e chamar ela dentro do whille assim nesse caso usando o Scanner sem ter que novamente
            // mensionar
            if (numero == 10){
                System.out.println("ACERTOU");
            }
            else {
                System.out.println("ERROU");
            }
        }
    }
}
// como funciona ? na primeira função ele te faz uma pergunta na qual se respondida com o numero que foi escolhido
// ele da como "ACERTOU" e encerra
// caso vc nao responda com o numero escolhido ele te oferece novamente  a mesma pergunta ate cegar o resultado desejado
