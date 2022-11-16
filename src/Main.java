import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner data =new Scanner(System.in);
        int a ,b,total =1;
        System.out.print("Sayiyi giriniz : ");
        a=data.nextInt();
        System.out.print("Ussu giriniz :");
        b=data.nextInt();

        for(int i = 1; i<=b;i++ ){
            total *= a;

        }
        System.out.print("Cevap : "+ total);
    }
}