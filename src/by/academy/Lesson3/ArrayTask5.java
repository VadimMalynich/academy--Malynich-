package by.academy.Lesson3;

public class ArrayTask5 {
    public static void main(String args[]){
        int arr1[]=new int [5];
        int arr2[]=new int [5];
        int sum1 = 0, sum2 = 0, s1=0, s2=0;
        //Random rand = new Random();
        for(int i=0;i<5;i++){
            arr1[i]=(int)(Math.random()*6);
            arr2[i]=(int)(Math.random()*6);
        }
        System.out.print("Массив 1: ");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
            sum1+=arr1[i];
        }
        s1=sum1/arr1.length;
        System.out.print("\nМассив 2: ");
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
            sum2+=arr2[i];
        }
        s2=sum2/arr2.length;
        if (s1==s2){
            System.out.println("\nСредние арифметические равны");
        }else if(s1>s2){
            System.out.println("\nСреднее арифметическое массива arr1 больше среднего арифметического массива arr2");
        }else{
            System.out.println("\nСреднее арифметическое массива arr2 больше среднего арифметического массива arr1");
        }
    }
}
