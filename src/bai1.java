import java.util.Scanner;

public class bai1 {
    // hàm kiển tra số nguyên tố
    public static boolean checkSNT(int number){
        if(number <2){
            return false;
        }
        else{
            for(int i =2; i <=Math.sqrt(number);i++){
                if(number % i == 0){
                    return false;
                }
            }
        }
        return  true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = sc.nextInt();
        System.out.println("Số nguyên tố nhỏ hơn Number:");
        for( int i =0; i <number;i++){
            if(checkSNT(i)== true){
                System.out.println(i);
            }
        }
    }
}
