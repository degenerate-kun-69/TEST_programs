import java.io.*;
import java.util.Scanner;

public class print {
    static String returnIN(String str){
        System.out.format(str);
        return str;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str1= new String("Hello world");
        returnIN(str1);

    }
}
