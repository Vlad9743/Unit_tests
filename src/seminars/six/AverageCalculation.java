package seminars.six;

import java.util.ArrayList;

public class AverageCalculation {

    public Double calcAverage(ArrayList<Integer> list)
    {
        Integer sum = 0;
        for (int item : list)
        {
            sum += item;
        }
        return sum.doubleValue() / list.size();
    }


    public String compareLists(ArrayList<Integer> list1, ArrayList<Integer> list2)
    {
        if (list1.size() == 0)
        {
            return ("Первый список пуст.");
        }
        else if (list2.size() == 0)
        {
            return ("Второй список пуст.");
        }
        else
        {
            AverageCalculation averageCalculation = new AverageCalculation();
            Double avg1 = averageCalculation.calcAverage(list1);
            Double avg2 = averageCalculation.calcAverage(list2);

            if (avg1 > avg2)
            {
                return ("Первый список имеет большее среднее значение");
            }
            if (avg1 < avg2)
            {
                return ("Второй список имеет большее среднее значение");
            }
            return ("Средние значения равны");
        }
    }
}
