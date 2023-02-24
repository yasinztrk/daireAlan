import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r;
        double pi=3.14;
        int a;
        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz :");
        r=input.nextInt();
        System.out.print("Daire diliminin açısını giriniz :");
        a=input.nextInt();

        double alan=r*r*pi;
        double cevre=2*pi*r;
        double dilim=(pi*(r*r)*a)/360;

        System.out.println("Dairenin Alanı :"+alan);
        System.out.println("Dairenin Çevresi :"+cevre);
        System.out.println("Daire Diliminin Alanı :"+dilim);


    }
}