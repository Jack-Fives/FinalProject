//runs a quiz of multiple questioms
import java.util.Scanner;
public class Quizzer{ 
    public void runQuiz(){
        //scanner is used to decide type of quiz
        System.out.println("What quiz would you like to take: History, Comp Sci or Math?");
        Scanner whatQuiz=new Scanner(System.in);
        String quizType=whatQuiz.nextLine();
        //makes sure there are no errors in capitalization
        quizType=quizType.toLowerCase();
        //records the number of the current question
        int questionNum=0;
        //records the number of correct questions
        int score=0;
        //scanner is used to decide starting level
        System.out.println("What level would you like to start at: 1,2,3 or 4?");
        Scanner whatLevel=new Scanner(System.in);
        int level=whatLevel.nextInt();
        //makes sure that the level chosen is valid
        if(level>4||level<1) {
            System.out.println("Invalid level, please try again");
            //if incorrect, uses recursion to automatically rerun the program
            runQuiz();
            //cancels the current running method after a correct value
            return;
        }
        //for a history quiz
        if(quizType.equals("history")){
            //uses the initial level to ask the first question by calling the HistoryQuestion method
            HistoryQuestion firstQuestion=new HistoryQuestion(level,questionNum);
            //if the question returns correct then it'll print correct and add 1 to the score
            if(firstQuestion.QuestionAndAnswerHis().equals("Correct")){
                score++;
                System.out.println("Correct");
            }
            //otherwise it will print wrong
            else{
                System.out.println("Wrong");
            }
            //regardless it goes onto the next question
            questionNum++;
            //for loop repeats the above process 9 more times
            for(int i=0;i<9;i++){
                //gets the current average by calling the averages method
                Averages thisAverage=new Averages(questionNum,score);
                thisAverage.currentAvg();
                //calls the HistroyQuestion method with the new average
                HistoryQuestion thisQuestion=new HistoryQuestion(thisAverage.returnDiff(),questionNum);
                if(thisQuestion.QuestionAndAnswerHis().equals("Correct")) {
                    score++;
                    System.out.println("Correct");
                }
                else{
                    System.out.println("Wrong");
                }
                questionNum++;
            }
            //prints the final value of score
            System.out.println("Final score: "+score);

        }
        //the process above repeats for each of the following questions
        else if(quizType.equals("comp sci")){
            CompSciQuestion firstQuestion=new CompSciQuestion(level,questionNum);
            if(firstQuestion.QuestionAndAnswerCompSci().equals("Correct")){
                score++;
                System.out.println("Correct");
            }
            else{
                System.out.println("Wrong");
            }
            questionNum++;
            for(int i=0;i<9;i++){
                Averages thisAverage=new Averages(questionNum,score);
                thisAverage.currentAvg();
                CompSciQuestion thisQuestion=new CompSciQuestion(thisAverage.returnDiff(),questionNum);
                if(thisQuestion.QuestionAndAnswerCompSci().equals("Correct")){
                    score++;
                    System.out.println("Correct");
                }
                else{
                    System.out.println("Wrong");
                }
                questionNum++;
            }
            System.out.println("Final score: "+score);
        }
        else if(quizType.equals("math")){
            MathQuestion firstQuestion=new MathQuestion(level,questionNum);
            if(firstQuestion.QuestionAndAnswerMath().equals("Correct")){
                score++;
                System.out.println("Correct");
            }
            else{
                System.out.println("Wrong");
            }
            questionNum++;
            for(int i=0;i<9;i++){
                Averages thisAverage=new Averages(questionNum,score);
                thisAverage.currentAvg();
                MathQuestion thisQuestion=new MathQuestion(thisAverage.returnDiff(),questionNum);
                if(thisQuestion.QuestionAndAnswerMath().equals("Correct")){
                    score++;
                    System.out.println("Correct");
                }
                else{
                    System.out.println("Wrong");
                }
                questionNum++;
            }
            System.out.println("Final score: "+score);

        }
        else{
            //if the type of quiz is invalid, used recursion to rerun the method
            System.out.println("Invalid quiz, please try again");
            runQuiz();
        }
    }
}