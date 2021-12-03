import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        Read read = new Read();
        System.out.println("Exercitiul 1:");
        int x = read.getInt();
        System.out.println("The number is: " + x);

        System.out.print("Exercitiul 2:");
        float xfloat = read.getFloat();
        System.out.println("The number is:" +xfloat );
        double xdouble = read.getDouble();
        System.out.println("The number is:" + xdouble);

        long xlong = read.getLong();
        System.out.println("The number is:" + xlong);

        System.out.println("Exercitiul 3:");
        int[] array = read.getArray(3);
        System.out.println("Array values are:");
        read.printArray(array);
        
        LogicalOp op = new LogicalOp();


    }
}
