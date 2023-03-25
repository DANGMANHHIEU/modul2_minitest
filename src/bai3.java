import java.util.Arrays;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array;
        int size;
        do {
            System.out.println("Enter size:");
            size = sc.nextInt();
            if(size>1000){
                System.out.println("Nhập lại size, size <1000 thôi!!!");
            }
        }while(size>1000);
        array = new int[size];
        for(int i =0 ; i< array.length; i++){
            System.out.println("phần thử thứ: "+ (i +1) );
            array[i] = sc.nextInt();
        }
        System.out.println("Array: ");
        System.out.println(Arrays.toString(array));
    }
}
