import java.util.Scanner;
class Scaner
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        String name = sc.next();
        
        System.out.println("enter roll no");
        int roll_no = sc.nextInt();
        
        System.out.println("enter phone number");
        long ph_no = sc.nextLong();
        
        System.out.println("-----------------------------");
        System.out.println("NAME : "+ name);
        System.out.println("ROLL_NO : "+ roll_no);
        System.out.println("PHONE NUMBER : "+ ph_no);


        
    }
}