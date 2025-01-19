// Program to Find Elements in First Array but Not in Second Array java Copy

package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class problem2 {
    public static void main(String[] args) {
        Integer[] array1  = {1,2,3,4,5,6,7};
        Integer[] array2 = {1,2,3};

        Set<Integer> setA = new HashSet<>(Arrays.asList(array1));
        Set<Integer> setB = new HashSet<>(Arrays.asList(array2));

        setA.removeAll(setB);
        System.out.println("THe elements are" + setA);
    }
}
