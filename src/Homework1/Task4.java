package Homework1;

public class Task4 {
    public static void main(String[] args) {
        double a=2;
        int i=1;
        System.out.println("Вывод степени 2");
        while(a<1_000_000){
            a*=2;/*Math.pow(a,2);*/
            i++;
            System.out.print(i+" ");
        }
    }
}
