package Homework1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        String str1, str2;
        int count=0;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Введите первую строку: ");
        str1=scanner.nextLine();
        System.out.print("Введите вторую строку: ");
        str2=scanner.nextLine();
        char string1[]=str1.toCharArray();
        char string2[]=str2.toCharArray();
        for(int i=0;i<string1.length;i++){
            for(int j=0;j<string2.length;j++){
                if(string1[i]==string2[j]){
                    count++;
                    for(int k=j;k<string2.length-1;k++){
                        string2[k]=string2[k+1];
                    }
                    break;
                }
            }
        }
        if(count==string1.length){
            System.out.println("Одна строка является перестановкой другой!");
        }else{
            System.out.println("Одна строка не является перестановкой другой!");
        }
        scanner.close();
    }
}
