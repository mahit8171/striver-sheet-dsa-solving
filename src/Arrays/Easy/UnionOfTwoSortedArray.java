package Arrays.Easy;

import java.util.ArrayList;
import java.util.List;

public class UnionOfTwoSortedArray {
   public static List<Integer> findUnion(int[] arr1, int[] arr2) {
       List<Integer> Union = new ArrayList<>();
       int len1 = arr1.length;
       int len2 = arr2.length;
       int i = 0 , j = 0 ;
       while (i < len1 && j < len2) {
           if (arr1[i] < arr2[j] ) {
               if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i])
                   Union.add(arr1[i]);
               i++;
           }else if (arr2[j] < arr1[i] ) {
               if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i])
                   Union.add(arr1[j]);
               j++;



           }
           else {
               if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i])
                   Union.add(arr1[i]);
               i++;
               j++;
           }

       }
       while (i < len1 && j < len2) {
           if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i])
               Union.add(arr1[i]);
           i++;
       }


       while (j < len2) {
           if (Union.isEmpty() || Union.get(Union.size() - 1) != arr2[j])
               Union.add(arr2[j]);
           j++;
       }

       // Return the union list
       return Union;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        List<Integer> result = findUnion(arr1, arr2);
        System.out.println(result);
    }
}
