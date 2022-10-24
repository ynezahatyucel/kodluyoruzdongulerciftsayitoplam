package Giris;
import java.util.Scanner;

public class dongulerTwo {
    public static void main(String[] args) {
      int y,total=0;
      Scanner inp=new Scanner(System.in);

      do {
          System.out.println("Sayı giriniz" );
          y= inp.nextInt();
          if (y%2==0){
              total+=y;
          }

      }while (y%2==0);

        System.out.println("çift sayılar ve 4 ün katlarının toplamı : "+total);


        }

    }

