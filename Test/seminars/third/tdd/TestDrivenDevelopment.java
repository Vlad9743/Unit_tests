package seminars.third.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDrivenDevelopment {

    MoodAnalyser moodAnalyser;
    @BeforeEach
    void setUp(){
        moodAnalyser = new MoodAnalyser();
    }

    @Test
    void GoodMoodTest(){
        String result = moodAnalyser.analyseMood("Hello, Program");

        assertEquals("Good mood", result);
    }

    @Test
    void BadMoodTest(){
        String result = moodAnalyser.analyseMood("Hello, piece of a Soft");

        assertEquals("Bad mood", result);
    }

    @Test
    void SuicidalMoodTest(){
        String result = moodAnalyser.analyseMood("Why am I talking to a program?");

        assertEquals("Suicidal mood", result);
    }

    @Test
    void UndeterminedMoodTest(){
        String result = moodAnalyser.analyseMood("???");

        assertEquals("Undetermined", result);
    }

}