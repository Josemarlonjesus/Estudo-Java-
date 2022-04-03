import java.util.Scanner;

public class calculedorer{
    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite seu numero: ");
        int conta = leitor.nextInt();
        String str = Integer.toString(conta);
        System.out.println(str.length());
    }
}
