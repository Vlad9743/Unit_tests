package seminars.third.coverage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seminars.third.hw.MainHW;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class HWTests {

    MainHW mainHW;
    @BeforeEach
    void setUp(){
        mainHW = new MainHW();
    }

    @Test
    void numberIsEvenReturnTrue(){
        assertEquals(mainHW.evenOddNumber(4), true);
    }

    @Test
    void numberIsOddReturnFalse(){
        assertEquals(mainHW.evenOddNumber(5), false);
    }

    @Test
    void numberIsLessThan25ReturnFalse(){
        assertFalse(mainHW.numberInInterval(14));
    }

    @Test
    void numberIsInIntervalReturnTrue(){
        assertTrue(mainHW.numberInInterval(50));
    }

    @Test
    void numberIsGreaterThan100ReturnFalse(){
        assertFalse(mainHW.numberInInterval(140));
    }
}
