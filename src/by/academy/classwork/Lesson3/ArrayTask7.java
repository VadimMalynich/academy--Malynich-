package by.academy.classwork.Lesson3;

public class ArrayTask7 {
    public static void main(String args[]){
        int arr[]=new int [20];
        int a=1,b=0,ans=0;
        arr[0]=a;
        for (int i=1;i<arr.length;i++){
            a+=b;
            b=a-b;
            arr[i]=a;
        }
        System.out.print("\nМассив: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
