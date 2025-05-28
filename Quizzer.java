//runs a quiz of multiple questioms
import java.util.Scanner;
public class Quizzer{ 
    //asks for quiz type and creates an object of that type
    //asks the question and call average (start at asked level)
    //call averages
    //call the object again at new level
    //have a counter object to check which question is being called
    public void runQuiz(){
        System.out.println("What quiz would you like to take: History, Comp Sci or Math?");
        Scanner whatQuiz=new Scanner(System.in);
        String quizType=whatQuiz.nextLine();
        quizType=quizType.toLowerCase();
        int questionNum=0;
        int score=0;
        System.out.println("What level would you like to start at: 1,2,3 or 4?");
        Scanner whatLevel=new Scanner(System.in);
        int level=whatLevel.nextInt();
        if(level>4||level<1){
            System.out.println("Invalid level, please try again");
            runQuiz();
            return;
        }
        //check the coder for the averages thing
        if(quizType.equals("history")){
            HistoryQuestion firstQuestion=new HistoryQuestion(level,questionNum);
            if(firstQuestion.QuestionAndAnswerHis().equals("Correct")){
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
            System.out.println("Final score: "+score);

        }
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
            //is there a way to restart the asking process
            System.out.println("Invalid quiz, please try again");
            runQuiz();
        }
    }
}