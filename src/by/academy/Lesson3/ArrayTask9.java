package by.academy.Lesson3;

public class ArrayTask9 {
    public static void main(String args[]){
        int arr1[]=new int [10];
        int arr2[]=new int [10];
        double arr3[]=new double [10];
        for(int i=0;i<10;i++){
            arr1[i]=(int)(1+Math.random()*9);
            arr2[i]=(int)(1+Math.random()*9);
            arr3[i]=(double)arr1[i]/arr2[i];
        }
        System.out.print("\nМассив 1: ");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.print("\nМассив 2: ");
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.print("\nМассив 3: ");
        for(int i=0;i<arr3.length;i++){
            System.out.printf(arr3[i]+" ");
        }
        int k=0;
        for(int i=0;i<arr3.length;i++){
            if (arr3[i]%1==0){
                k++;
            }
        }
        System.out.println("\nЦелых чисел в 3 массиве: "+k);
    }
}
