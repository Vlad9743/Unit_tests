package seminars.six;

import java.util.ArrayList;
import java.util.Arrays;

public class AverageMain {

    public static void main(String[] args) {
        AverageCalculation averageCalculation = new AverageCalculation();
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(3, 4, -7, 8, 14, 0));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(-3, 12, 75, 4, -16, 86, 0, 6));

        String result = averageCalculation.compareLists(list1, list2);
        System.out.println(result);
    }

}
