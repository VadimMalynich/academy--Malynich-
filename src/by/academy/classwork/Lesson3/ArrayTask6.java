package by.academy.classwork.Lesson3;

public class ArrayTask6 {
    public static void main(String args[]){
        int arr[]=new int [4];
        //int arr2[]={50, 59, 80,99};
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)(10+Math.random()*90);
        }
        System.out.print("Массив: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int num=arr[0];
        int k=0;
        for (int i=1;i<arr.length;i++){
            if (arr[i]>=num){
                num=arr[i];
                k++;
            }
        }
        if (k==3){
            System.out.println("\nМассив является строго возрастающей последовательностью");
        } else{
            System.out.println("\nМассив не является строго возрастающей последовательностью");
        }
    }
}
