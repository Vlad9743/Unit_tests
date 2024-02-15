package seminars.third.tdd;

public class MoodAnalyser {

    public String analyseMood(String message) {
        if (message.equals("Hello, Program"))
        {
            return "Good mood";
        }

        if (message.equals("Hello, piece of a Soft"))
        {
            return "Bad mood";
        }

        if (message.equals("Why am I talking to a program?"))
        {
            return "Suicidal mood";
        }

        return "Undetermined";
    }

}