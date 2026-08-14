package Arrays;
import java.util.ArrayList;
public class Intersection {
//    public static ArrayList<Integer> intersection(int[]arr1,int[]arr2) {
//        ArrayList<Integer> list = new ArrayList<>();
//        for(int i=0;i<arr1.length;i++) {
//            int ele = arr1[i];
//            for(int j=0;j<arr2.length;j++) {
//                if(arr2[j]==ele && list.isEmpty()) {
//                    list.add(arr2[j]);
//                }
//                else if(arr2[j]==ele && list.getLast()!=ele) {
//                    list.add(arr2[j]);
//
//                }
//            }
//        }
//        return list;
//    }
//
//    public static void main(String[] args) {
//        int[]arr1={1,2,3};
//        int[]arr2={5,6};
//        ArrayList<Integer> ans = intersection(arr1,arr2);
//        System.out.println(ans);
//    }

    public static ArrayList<Integer> intersection(int[]arr1,int[]arr2) {
        ArrayList<Integer> list = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<arr1.length) {
            if(arr1[i]==arr2[j] && list.isEmpty()) {
                list.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i]==arr2[j] && list.getLast()!=arr1[i]) {
                list.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i]==arr2[j] && list.getLast()==arr1[i]){
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        return list;
    }
public static void main(String[] args) {
    int[]arr1={1,1,1,2,2,3,3};
    int[]arr2={1,1,2,2,2,3,3,3};
    ArrayList<Integer> list = intersection(arr1,arr2);
    System.out.println(list);
}
}
