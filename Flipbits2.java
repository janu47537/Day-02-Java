import java.util.*;
public class Flipbits2{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int position=sc.nextInt();
        System.out.println(a^(1<<position));
    }
}