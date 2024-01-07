package Project2;

public class Swap2String {
    public static void main(String[] args) {
        //Write a program to swap 2 String without a temporary variable?
        String a="Hanane";
        String b="Yannis";
        System.out.println("before swap :"+"a="+a+" "+"b="+b);
        a=a+b;//a=HananeYannis
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        System.out.println("After swaping : "+"a="+a+" "+"b="+b);


    }
}
