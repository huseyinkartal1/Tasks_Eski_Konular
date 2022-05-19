import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Methods {

     Scanner scanner = new Scanner(System.in);

    public void showTasks() {

        FileReader reader=null;
        try {
            reader=new FileReader("src/tasks.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        char[] data=new char[3000];
        for (char i = 0; i <data.length ; i++) {
            try {
                data[i] =(char) reader.read();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(data);
    }

    //TASK 1
    public void usAl() {

        System.out.print("Taban sayısınız giriniz: ");
        int taban = scanner.nextInt();
        System.out.print("Üs sayısınız giriniz: ");
        int us = scanner.nextInt();

        if(taban==0){
            System.out.println(0);
        }else {
            int result=1;
            for (int i = 0; i <us ; i++) {
                result*=taban;
            }
            System.out.println("İşlem sonucu:" + result);
        }
    }

    //TASK 2
    public void uceBolunen() {

        System.out.println("İki adet tamsayı giriniz: ");
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        for (int i = start+1; i <end ; i++) {
            if (i%3==0){
                System.out.println(i);
            }
        }
    }

    //TASK 3
    public void getEvenNumbers() {

        System.out.println("İki adet tamsayı giriniz: ");
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        int[] arr=new int[(end-start)/2];
        int count=0;
        for (int i = start+1; i <end ; i++) {
            if (i%2==0){
               arr[count]=i;
               count++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //TASK 4
   public void isNumberBetweenFiftyAndHundred(){

        System.out.println("Bir adet tamsayı giriniz: ");
        int number = scanner.nextInt();
        boolean bl=number>50&&number<100;
            System.out.println("Girdiğiniz sayi 50 ile 100 arasında mı? "+bl);

    }

    //TASK 5
    public void isNumberOutOfRangeFiftyAndHundred() {
        System.out.println("Bir adet tamsayı giriniz: ");
        int number = scanner.nextInt();
        boolean bl=!(number>50&&number<100);
        System.out.println("Girdiğiniz sayi 50 ile 100 aralığı dışında mı? "+bl);
    }

    //TASK 6
    public void countTrueValues() {
        System.out.println("Mantıksal diziniz kaç elemanlı olsun ? ");
        int diziBoyutu=scanner.nextInt();
        boolean[] bl=new boolean[diziBoyutu];
        for (int i = 0; i <diziBoyutu ; i++) {
            System.out.println("Boolean değerini giriniz: true yada false");
            try {
                bl[i]=scanner.nextBoolean();
            } catch (Exception e) {
                System.err.println("Hatalı giriş yaptınız.");
            }
        }
        int count=0;
        for (boolean each:bl
             ) {
            if(each) {
                count++;
            }
        }
        System.out.println("Dizinizdeki doğru sayısı: "+count);

    }
}
