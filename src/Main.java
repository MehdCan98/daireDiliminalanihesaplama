import java.util.Scanner;
//Kullanıcıdan veri alabilmek için Scanner sınıfını porjemize dahil ediyoruz.

public class Main {
    public static void main(String[] args) {

        //yarı çap için integer, pi ve alan için ise double veri tiplerinde değişkenleri ataıyoruz.
        int  r;
        double pi = 3.14, a;

        Scanner input  = new Scanner(System.in);

        //Kullanıcıdan yarı çap ve merkez alan verilerini alıyoruz.
        System.out.print("Dairenin yarıçap uzunluğunu giriniz: ");
        r = input.nextInt();

        System.out.print("Dairenin diliminin açısını giriniz: ");
        a = input.nextDouble();


        //Kullanıcıdan aldığımız verilerimizi double değişkeniyle formullerle işliyoruz.
        double alanHesap =(pi*(r*r)*a) / 360;

        //Çıktı olarak sonucu kullanıcıya iletiyoruz.
        System.out.print(alanHesap);



    }
}