import java.util.Scanner;
// criar uma estrutura que sempre devolve o dobro do numero digitado

public class whileteste {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.print("DIGITE O NUMERO: ");
            int var1 = input.nextInt();
            if (true){
                int var2 = var1 *2;
                System.out.println(var2);
            }
        }
    }
}
