package Lesson3;

public class ArrayTask8 {
    public static void main(String args[]){
        int arr[]=new int [12];
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)(-16+Math.random()*32);
        }
        System.out.print("\nМассив: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int k=0, max = arr[0];
        for (int i=0;i<arr.length;i++){
            if(max<=arr[i]){
                max=arr[i];
                k=i;
            }
        }
        System.out.println("\nИндекс максимального элемента: "+k);
    }
}
