public class bai2 {
    //hàm tính tổng
    public static int total(int[] arr){
        int total =0;
        for (int i =0; i < arr.length;i++ ) {
            total += i;
        }
        return total;
    }
    //hàm tìm phần tử lớn nhất
    public static int checkMax(int[]arr){
        int max = arr[0];
        for (int i=0; i < arr.length; i++){
            if(max < arr[i]){
                max =arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        System.out.println("Tổng các phần tử trong mảng là: " + total(array));
        System.out.println("Phần tử lớn nhất là :" + checkMax(array));
    }
}
