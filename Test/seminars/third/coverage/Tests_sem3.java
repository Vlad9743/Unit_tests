package seminars.third.coverage;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class Tests_sem3 {

    // Попробуйте реализовать в калькуляторе с помощью методологии TDD (с описанием шагов) функцию расчета длины окружности

    @Test
    void circleLengthTest()
    {
        Circle circle = new Circle();
        Double expected = 62.83185307179586;

        Double result = circle.calcLength(10);

        assertThat(result).isEqualTo(expected);
    }

}
