package Lesson3;

public class ArrayTask2 {
    public static void main(String args[]){
        int arr[]=new int [50];
        int j=0;
        for(int i=0;i<100;i++){
            if (i%2!=0){
               arr[j]=i;
               j++;
            }
        }
        System.out.print("Массив: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\nМассив: ");
        for(int i=49;i>=0;i--){
            System.out.print(arr[i]+" ");
        }

    }
}
