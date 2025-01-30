import java.util.Scanner;

public class Quizapplication {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] questions = {
            "1. What is the capital of France?",
            "2. Who developed Java?",
            "3. Which planet is known as the Red Planet?",
            "4. What is the largest ocean on Earth?",
            "5. In which year did World War II end?"
        };
        
        String[][] options = {
            {"A. Paris", "B. London", "C. Berlin", "D. Madrid"},
            {"A. Dennis Ritchie", "B. James Gosling", "C. Bjarne Stroustrup", "D. Guido van Rossum"},
            {"A. Mars", "B. Jupiter", "C. Earth", "D. Venus"},
            {"A. Atlantic Ocean", "B. Pacific Ocean", "C. Indian Ocean", "D. Arctic Ocean"},
            {"A. 1945", "B. 1944", "C. 1939", "D. 1950"}
        };
        
        String[] correctAnswers = {"A", "B", "A", "B", "A"};
        
        int score = 0;
        
        // Start quiz
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            
            System.out.print("Enter your answer (A/B/C/D): ");
            String userAnswer = scanner.next().toUpperCase();
            
            if (userAnswer.equals(correctAnswers[i])) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect!");
            }
            
            System.out.println();
        }
        
        System.out.println("Quiz Over!");
        System.out.println("Your score: " + score + "/" + questions.length);
        
        scanner.close();
    }
}