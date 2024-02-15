package seminars.third.coverage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class SomeServiceTest {
   // 3.1. Создайте набор тестов, полностью покрывающих все ветви кода функции fizzBuzz.
    // Эта функция принимает на вход число и возвращает "Fizz", если число делится на 3, "Buzz",
    // если число делится на 5, и "FizzBuzz", если число делится на 15. Если число не делится ни на 3,
    // ни на 5, ни на 15, функция возвращает входное число в виде строки.

    SomeService someService;
    @BeforeEach
    void setUp(){
        someService = new SomeService();
    }

    @Test
    void multipleThreeNotFiveReturnsFizz() {
        String result = someService.fizzBuzz(6);

        assertEquals("Fizz", result);
    }

    @Test
    void multipleFiveNotThreeReturnsBuzz() {
        String result = someService.fizzBuzz(10);

        assertEquals("Buzz", result);
    }

    @Test
    void multipleFifteenReturnsFizzBuzz() {
        String result = someService.fizzBuzz(30);

        assertEquals("FizzBuzz", result);
    }

    @Test
    void multipleNothingReturnsSelf() {
        String result = someService.fizzBuzz(29);

        assertEquals("29", result);
    }

    @Test
    void lastNumberIsSixReturnTrue(){
        int[] myArray = new int[] {1, 0, 1, 6};

        assertTrue(someService.firstLast6(myArray));
    }

    @Test
    void firstLastNumberNotSixReturnFalse(){
        int[] myArray = new int[] {1, 0, 1, 3};

        assertFalse(someService.firstLast6(myArray));
    }

    @Test
    void firstNumberIsSixReturnTrue(){
        int[] myArray = new int[] {6, 0, 1, 7};

        assertTrue(someService.firstLast6(myArray));
    }

    @ParameterizedTest
    @CsvSource({"2000.0, 50, 1000", "2000.0, 100, 0", "2000.0, 0, 2000"})
    void parametrisedTest(Double a, int b, int c){
        assertThat(someService.calculatingDiscount(a, b))
                .isEqualTo(c);
    }

    @ParameterizedTest
    @CsvSource({"2000.0, 101, Скидка должна быть в диапазоне от 0 до 100%", "2000.0, -10, Скидка должна быть в диапазоне от 0 до 100%"})
    void parametrisedTest2(Double a, int b, String c){

        assertThatThrownBy(() ->
                someService.calculatingDiscount(a, b))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage(c);
    }

    @Test
    void luckySumHas13ReturnSumOfTwo(){
        int result = someService.luckySum(3,5, 13);

        assertThat(result).isEqualTo(8);
    }

    @Test
    void luckySumHasNo13ReturnSumOfThree(){
        int result = someService.luckySum(3,5, 9);

        assertThat(result).isEqualTo(17);
    }

}