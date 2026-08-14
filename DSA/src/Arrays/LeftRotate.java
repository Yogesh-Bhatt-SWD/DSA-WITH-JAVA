package Arrays;
import java.util.Scanner;
public class LeftRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value you want to left by  =  ");
        int k=sc.nextInt();
        int[]arr={1,2,3,4,5};
        int[]ans=new int[arr.length];
        int i=0;
        for(int j=k;j<arr.length;j++) {
            ans[i]=arr[j];
            i++;
        }
        for(int j=0;j<k;j++) {
            ans[i]=arr[j];
            i++;
        }
        for(int j=0;j<ans.length;j++) {
            System.out.print(ans[j]+" ");
        }
    }
}
