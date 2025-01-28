import java.util.ArrayList;
import java.util.Scanner;

public class QuestionService {

    Questions[] questions = new Questions[5];
    private int totalPoints = 0;
    public QuestionService() {
        questions[0] = new Questions("What is the size of an int in Java?", "8 bits", "16 bits", "32 bits", "64 bits", "32 bits");

        questions[1] = new Questions("Which keyword is used to prevent a method from being overridden in Java?", "static", "final", "const", "protected", "final");

        questions[2] = new Questions("What does the x++ operator do in Java?",
                "Increments the value of x and returns the updated value.",
                "Decrements the value of x and returns the updated value.",
                "Returns the current value of x and then increments it.",
                "Returns the current value of x without incrementing it.",
                "Returns the current value of x and then increments it.");

        questions[3] = new Questions("Which of the following statements is true about Java?",
                "Java is platform-dependent.",
                "Java supports operator overloading.",
                "Java does not support multiple inheritance through classes.",
                "Java does not support object-oriented programming.",
                "Java does not support multiple inheritance through classes.");

        questions[4] = new Questions("Which exception is thrown when a thread is interrupted while waiting or sleeping?",
                "ArithmeticException",
                "InterruptedException",
                "IOException",
                "ThreadException",
                "InterruptedException");
    }
    Scanner sc = new Scanner(System.in);
    void displayQuestions() {
        try
        {
            for (Questions question : questions) {
                question.getQuestion();
                int inputAnswer = sc.nextInt();
                int answerIndex = question.getAnswerIndex();
                if(inputAnswer == answerIndex) {
                    totalPoints++;
                    System.out.println("Correct answer.");
                }else
                {
                    System.out.println("Incorrect answer.");
                    System.out.println("Correct answer is :" + question.getAnswer());
                }

            }
        }catch(Exception e)
        {
            System.out.println("Please enter a valid number and try again.");
        }

    }
    void getTotalPoints() {
        System.out.println("Total points: " + totalPoints);
    }

}
