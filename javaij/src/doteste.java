import java.util.Scanner;
// criar uma estrutura que sempre devolve o dobro do numero digitado

public class doteste {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("DIGITE O NUMERO: ");
            var var1 = input.nextInt();
            var var2 = var1 * 2;
            System.out.println(var2);
        }while(true);
    }
}
