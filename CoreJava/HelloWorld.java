public class HelloWorld {  // Class name must match the filename (case-sensitive)

    public static void main(String[] args) {
        System.out.println("Hello, World!"); // Or any other code you want to run

        int a=10;
        int b=20;
        a=a^b;
        System.out.println("a is :"+a);
        b=a^b;
        System.out.println("b is :"+b);
        a=a^b;
        System.out.println("a is :"+a);
        System.out.println("b is :"+b);


    }
}