import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b= scan.nextInt();
        int c=scan.nextInt();
        int d=scan.nextInt();
        int e=scan.nextInt();
        int sum=a+b+c+d+e;
        int percent=(sum*100)/500;
        if(percent>=80) System.out.println("A");
        else if(percent<80 && percent>=60) System.out.println("B");
        else if(percent<60 && percent>=40) System.out.println("C");
        else System.out.println("D");
    }
}
