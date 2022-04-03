import java.util.Scanner;

public class estruturafor{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite oq quer repetir");
        String var1 = input.nextLine();
        System.out.print("Quantas vezes quer repetir: ");
        int var2 = input.nextInt();
        for (int i = 0; i <= var2; i++) {
            System.out.println(var1 + i);
        }
    }
}
