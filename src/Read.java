import java.util.InputMismatchException;
import java.util.Scanner;

public class Read {
    public int getInt(){
        do{
            Scanner scan = new Scanner(System.in);
            try{
                System.out.print("Type a number: ");
                return scan.nextInt();
            } catch (InputMismatchException error){
                System.out.println("Incorrect value!");
            }
        } while(true);
    }

    public float getFloat(){
        do{
            Scanner scan = new Scanner(System.in);
            try{
                System.out.print("Type a number: ");
                return scan.nextFloat();
            } catch (InputMismatchException error){
                System.out.println("Incorrect value!");
            }
        } while(true);
    }

    public double getDouble(){
        do{
            Scanner scan = new Scanner(System.in);
            try{
                System.out.print("Type a number: ");
                return scan.nextDouble();
            } catch (InputMismatchException error){
                System.out.println("Incorrect value!");
            }
        } while(true);
    }

    public long getLong(){
        do{
            Scanner scan = new Scanner(System.in);
            try{
                System.out.print("Type a number: ");
                return scan.nextLong();
            } catch (InputMismatchException error){
                System.out.println("Incorrect value!"); //exercitiul 4
            }
        } while(true);
    }

    public int[] getArray(int size){
        int[] myArr=new int[size];
        System.out.println("Add values in array:");
        for(int i = 0; i < myArr.length; i++){
            myArr[i] = getInt();
        }
        return myArr;
    }

    public void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
