package graph.cycledetection;

import java.util.ArrayList;
import java.util.List;

public class CycleDetectionUsingBfs {
    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i=0;i<6;i++){
            list.add(new ArrayList<>());
        }
        list.get(1).addAll(List.of(2,3));

        list.get(2).addAll(List.of(1,5));

        list.get(3).addAll(List.of(1,4,6));

        list.get(4).addAll(List.of(3));

//        list.get(5).addAll();

    }
}
