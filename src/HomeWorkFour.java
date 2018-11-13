import java.util.Random;
import java.util.Scanner;

public class HomeWorkFour {


    public static void main(String[] args) {

        task1();
        System.out.println();
           task2();
        System.out.println();
        task3();
        System.out.println();
        Scanner sc = new Scanner(System.in);
        task4(sc);

    }


    public static void task1 () {
            System.out.println("Task 1");

            int x = 0;
            int[] Array = new int[10];
            for (int i = 0; i < 10; i++) {
                Random rnd = new Random();
                Array[i] = rnd.nextInt(10) - 2;
                if (Array[i] < 0) x++;

                System.out.print(Array[i] + " ");
            }
            System.out.println(" ");
            System.out.print("No odd: " + x + " ");
            System.out.println(" ");
            for (int i = 0; i < Array.length; i++) {
                if (Array[i] > 0) Array[i] = 0;
                System.out.print(Array[i] + " ");
            }

        }
        public static void task2(){
            System.out.println("Task 2");
               int result=0,result1=0,result2 =0,result3 =0;
               int hub = 0,hub1 = 0,hub2 = 0,hub3 = 0;
               int sum=0;
               int sumsr=0;


            int[] Array = new int[1000];
            for (int i = 0; i < Array.length; i++) {
                Random rnd = new Random();
                Array[i] = rnd.nextInt(1000) + 1;
                System.out.print(Array[i] + " ");
            }
            System.out.println(" ");
                for(int i = 0;  i < 250; i++){
                    result +=  Array[i];
                    hub = result/250;
                }
            System.out.println("Арифметическое значение первого деапазона: " + hub );
            for(int i = 250;  i < 500; i++){
                result1 +=  Array[i];
                hub1 = result1/250;
            }
            System.out.println("Арифметическое значение второго деапазона: " + hub1 );
            for(int i = 500;  i < 750; i++){
                result2 +=  Array[i];
                hub2 = result2/250;
            }
            System.out.println("Арифметическое значение третьего деапазона: " + hub2 );
            for(int i = 750;  i < 1000; i++){
                result3 +=  Array[i];
                hub3 = result3/250;
            }
            System.out.println("Арифметическое значение четвертого деапазона: " + hub3 );
            sum=hub+hub1+hub2+hub3;
            sumsr=sum/4;

            System.out.print("Сумма всех 4 деапазонов: " + sum);
            System.out.println(" ");
            System.out.print("Среднее арифметическое значение 4 деапазонов: " + sumsr);

            int answer= Math.max(Math.max(hub, hub1), Math.max(hub2,hub3));
            System.out.println(" ");
            System.out.print("Наибольшее значение четырёх деапазонов: " + answer);

            }




        public static void task3() {
            System.out.println(" ");
            System.out.println("Task 3");

            int[] Arr = new int[10], Arr2 = new int[15];
            int N = 10;
            int s1 = 0;
            int s2 = 0;

            for (int i = 0; i < Arr.length; i++) {
                Arr[i] = (int)(Math.random()*11);
                Arr2[i] = (int)(Math.random()*11);
            }
            System.out.println(" ");
            for (int i = 0; i <Arr.length ; i++) {

                System.out.print(Arr[i] + " " );
                Arr[i]=s2;


            }
            System.out.println(" ");
            for(int i = 0; i <Arr2.length; i++){

                System.out.print(Arr2[i] + " ");
                Arr2[i]=s2;
            }


            System.out.println(" ");

                if (s1 != s2) {
                    System.out.println("Массивы  не одинаковы ");
                } else if(s1 == s2) {
                    System.out.println("Массивы одинаковые");


            }
        }

    public static int task4(Scanner sc) {
        int n;
        int[] fl = new int[]{12};


        System.out.println("Выберите  ячейку массива под №0 : ");
        try {
            n = sc.nextInt();
            System.out.println(" Выбраная ячейка содержит: "+ fl[n] );
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Вы вышли за пределы массива");
            return task4(sc);
        }

        return n;
    }


    }








