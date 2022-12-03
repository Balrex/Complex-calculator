import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double re, im;
        Complex numb = new Complex();
        System.out.println("Введите действительную часть");
        Scanner sc = new Scanner(System.in);
         re = sc.nextDouble();
         numb.setRe(re);
         System.out.println("Введите мнимую часть");
         im = sc.nextDouble();
         numb.setIm(im);
         // можно было сделать через numb = Complex(re, im);
         System.out.println("|z| = "+ numb.mod());
         System.out.println("arg(z) = "+ numb.arg());
         System.out.println("Введите действительнуюасть второго числа");
         re = sc.nextDouble();
        System.out.println("Введите мнимую второго числа");
        im = sc.nextDouble();
         numb.operationsum(re, im);
         if (numb.getIm()<0)
            System.out.println("Z1+Z2="+numb.getRe()+numb.getIm()+"i");
         else System.out.println("Z1+Z2="+numb.getRe()+"+"+numb.getIm()+"i");
         numb.operationsub(re, im);
        if (numb.getIm()<0)
            System.out.println("Z1-Z2="+numb.getRe()+numb.getIm()+"i");
        else System.out.println("Z1-Z2="+numb.getRe()+"+"+numb.getIm()+"i");
    }
}