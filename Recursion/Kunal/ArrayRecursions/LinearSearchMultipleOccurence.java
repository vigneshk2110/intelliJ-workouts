package ArrayRecursions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LinearSearchMultipleOccurence {
    public static void main(String[] args) {
        int [] arr =  {90, 23, 5, 109, 12, 22, 67, 34,109, 56,109, 234, 278, 109};
//        List<Integer> list = new ArrayList<>();
//        Object[] result = new ArrayList[]{linearSearchMultipleOccurence(arr, 109, 0, list)};
//        System.out.println(Arrays.toString(result));

        ArrayList<Integer> list = linearSearchMultipleOccurence(arr, 109, 0);
        System.out.println(list);
    }

    private static ArrayList<Integer> linearSearchMultipleOccurence(int[] arr, int target, int index) {

        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length){
            return  list;
        }

        if (arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> listFromOthers = linearSearchMultipleOccurence(arr, target, ++index);

        list.addAll(listFromOthers);

        return list;

    }
//    private static ArrayList linearSearchMultipleOccurence(int[] arr, int target, int index, List<Integer> list) {
//
//        if (index == arr.length){
//            return (ArrayList) list;
//        } else if (arr[index] == target) {
//            list.add(index);
//
//        }
//        return linearSearchMultipleOccurence(arr, target, index+1, list);
//
//    }
}
