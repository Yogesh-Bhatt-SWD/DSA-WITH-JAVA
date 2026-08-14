package Arrays;

import java.util.ArrayList;
import java.util.List;

public class SetMatrixZero {
    public static void main(String[] args) {
        int [][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<3;i++) {
            for(int j=0;j<4;j++) {
                if(matrix[i][j]==0) {
                    list.add(i);
                    list.add(j);
                }
            }
        }
        System.out.println(list);
    }
}
