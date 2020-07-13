package by.academy.classwork.Lesson3;

public class ArrayTask4 {
    public static void main(String args[]){
        int arr[]=new int [8];
        //Random rand = new Random();
        for(int i=0;i<arr.length;i++){
            //arr[i]=rand.nextInt(10);
            arr[i]=(int)(1+Math.random()*11);
        }
        System.out.print("Массив: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            if (arr[i]%2!=0){
                arr[i]=0;
            }
        }
        System.out.print("\nМассив: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
