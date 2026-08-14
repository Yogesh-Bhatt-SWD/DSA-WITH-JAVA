import java.util.ArrayList; // we use list here because we don't know how many factors of a given number size can't be determined
import java.util.Collections;
import java.util.Scanner;
public class PrintDivisor2 {
    public static void PrintDivisors(int n) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=1;i*i<=n;i++) {
            if(n%i==0) {
                list.add(i);
                if((n/i)!=i) {
                    list.add(n/i);
                }
            }
        }
        Collections.sort(list);
        for (Integer integer : list) {
            System.out.print(integer+" ");
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the Number:");
        n=sc.nextInt();
        PrintDivisors(n);
    }
}
