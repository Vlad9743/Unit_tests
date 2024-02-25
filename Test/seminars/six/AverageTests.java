package seminars.six;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class AverageTests {

    AverageCalculation averageCalculation;
    String Message1 = "Первый список имеет большее среднее значение";
    String Message2 = "Второй список имеет большее среднее значение";
    String Message3 = "Средние значения равны";
    String Message4 = "Первый список пуст.";
    String Message5 = "Второй список пуст.";
    @BeforeEach
    void setUp()
    {
        averageCalculation = new AverageCalculation();
    }

    @Test
    void calcAverageTest()
    {
        AverageCalculation averageCalculation = new AverageCalculation();
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 4, -7, 8, 14, 0));

        double result = averageCalculation.calcAverage(list);

        assertThat(result - 3.833333).isLessThan(0.00000001);
    }

    @Test
    void firstListEmptyReturnMess4()
    {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(3, 4, -7, 8, 14, 0));

        String result = averageCalculation.compareLists(arrayList1, arrayList1);

        assertThat(result).isEqualTo(Message4);
    }

    @Test
    void secondListEmptyReturnMess5()
    {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(3, 4, -7, 8, 14, 0));

        String result = averageCalculation.compareLists(arrayList2, arrayList1);

        assertThat(result).isEqualTo(Message5);
    }

    @Test
    void firstAvgGreaterReturnMess1()
    {
        ArrayList<Integer> arrayList1 = new ArrayList<>(Arrays.asList(3, 3, 3));
        ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(2, 2));

        String result = averageCalculation.compareLists(arrayList1, arrayList2);

        assertThat(result).isEqualTo(Message1);
    }

    @Test
    void secondAvgGreaterReturnMess2()
    {
        ArrayList<Integer> arrayList1 = new ArrayList<>(Arrays.asList(3, 3, 3));
        ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(2, 2));

        String result = averageCalculation.compareLists(arrayList2, arrayList1);

        assertThat(result).isEqualTo(Message2);
    }

    @Test
    void avgsEqualReturnMess3()
    {
        ArrayList<Integer> arrayList1 = new ArrayList<>(Arrays.asList(3, 3, 3));
        ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(1, 4, 3, 4));

        String result = averageCalculation.compareLists(arrayList1, arrayList2);

        assertThat(result).isEqualTo(Message3);
    }


}
