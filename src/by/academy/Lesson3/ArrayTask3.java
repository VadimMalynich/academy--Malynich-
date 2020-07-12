package by.academy.Lesson3;

public class ArrayTask3 {
    public static void main(String args[]){
        int arr[]=new int [15];
        int k=0;
        //Random rand = new Random();
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)/*Math.round*/(Math.random()*10);
        }
        System.out.print("Массив: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            if (arr[i]%2==0){
                k++;
            }
        }
        System.out.println("\nКоличество четных элементов: "+k);
        System.out.print("Чётные числа массива: ");
        for(int i=0;i<arr.length;i++){
            if (arr[i]%2==0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
