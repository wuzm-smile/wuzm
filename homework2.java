package day01;

public class homework2 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,8,6,4,3};
        bubbleSort(arr);
    }

    //定义对数组排序的方法
    public static void bubbleSort(int[] arr){
        for (int i=0; i<arr.length-1; i++){
            for (int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                }
            }
        }
        System.out.print("从小到大得排序是：");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}