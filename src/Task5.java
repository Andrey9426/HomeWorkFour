public class Task5 {
    public static void main(String[] args) {
        Task5 task5= new Task5();
            String name;
        int age;
        int x;
       task5.print("Hi ",98);



    }
    public static int print(int a){
        System.out.println(a);
        return a;
    }
    public static void print(int a,int b, int c) {
        int x = a + b + c;

        System.out.println(x);


    }

    public static void print(double a,double b ){
         double x = a- b ;
            System.out.println(x);

        }
        public void print(String name){
            System.out.println(name);
        }

        public void print(String name ,int age ) {
            System.out.println(name +" " +age);
        }
    }


