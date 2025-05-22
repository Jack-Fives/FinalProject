//runs a quiz of multiple questioms
import java.util.Scanner;
public class Quizzer{ 
    //asks for quiz type and creates an object of that type
    //asks the question and call average (start at asked level)
    //call questionDiff
    //call the object again at new level
    //have a counter object to check which question is being called
    public int runQuiz(){
        System.out.println("What quiz would you like to take");
        Scanner whatQuiz=new Scanner(System.in);
        String quizType=whatQuiz.nextLine();
        quizType=quizType.toLowerCase();
        int questionNum=1;
        int score=1;
        System.out.println("What level would you like to start at");
        Scanner whatLevel=new Scanner(System.in);
        int level=whatLevel.nextInt();

        if(quizType.equals("history")){
        
            for(int i=0;i<10;i++){
                if(HistoryQuestion(Averages(questionNum,score),questionNum).equals("Correct"))score++;
                questionNum++;
            }
        }
        else if(quizType.equals("comp sci")){

        }
        else if(quizType.equals("math")){
            
        }
    } 
}