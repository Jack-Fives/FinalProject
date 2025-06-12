import java.util.Scanner;
//Runs the quiz for the user
public class Quizzer{ 
    public void runQuiz(){
        //uses a scanner to ask what type of quiz to run
        System.out.println("What quiz would you like to take: History, Comp Sci or Math?");
        Scanner whatQuiz=new Scanner(System.in);
        String quizType=whatQuiz.nextLine();
        quizType=quizType.toLowerCase();
        //keeps track of the current question
        int questionNum=0;
        //keeps track of the score
        int score=0;
        //keeps track of how many questions of each level are asked
        int lev1=0;
        int lev2=0;
        int lev3=0;
        int lev4=0;
        //uses a scanner to ask what level to start at
        System.out.println("What level would you like to start at: 1,2,3 or 4?");
        Scanner whatLevel=new Scanner(System.in);
        int level=whatLevel.nextInt();
        //contingency in case level is invalid
        if(level>4||level<1) {
            System.out.println("Invalid level, please try again");
            runQuiz();
            return;
        }
        //checks what type of quiz was requested
        if(quizType.equals("history")){
            //calls the first question using the asked for starting level
            HistoryQuestion firstQuestion=new HistoryQuestion(level,questionNum);
            //checks to see if the question was answered correctly or not, and if so increases the score
            if(firstQuestion.QuestionAndAnswerHis().equals("Correct")){
                score++;
                System.out.println("Correct");
            }
            else{
                System.out.println("Wrong");
            }
            //increases the question number
            questionNum++;
            //checks to see what level question was answered, and records it
            if(level==1){
                lev1++;
            }
            if(level==2){
                lev2++;
            }
            if(level==3){
                lev3++;
            }
            if(level==4){
                lev4++;
            }
            //repeats this process 9 times for the rest of the questions
            for(int i=0;i<9;i++){
                //finds the average using the current score and the total questions 
                Averages thisAverage=new Averages(questionNum,score);
                //turns that into a number from 1-4
                thisAverage.currentAvg();
                //tells the user their current average
                System.out.println("Your average is "+thisAverage.returnDiff());
                //plugs it into the questioner 
                HistoryQuestion thisQuestion=new HistoryQuestion(thisAverage.returnDiff(),questionNum);
                if(thisQuestion.QuestionAndAnswerHis().equals("Correct")) {
                    score++;
                    System.out.println("Correct");
                }
                else{
                    System.out.println("Wrong");
                }
                questionNum++;
                if(thisAverage.returnDiff()==1){
                    lev1++;
                }
                if(thisAverage.returnDiff()==2){
                    lev2++;
                }
                if(thisAverage.returnDiff()==3){
                    lev3++;
                }
                if(thisAverage.returnDiff()==4){
                    lev4++;
                }
            }
            //tells the user their stats
            System.out.println("Final score: "+score+" questions correct");
            System.out.println("You answered "+ lev1+" level 1 questions, ");
            System.out.print(lev2+" level 2 questions,");
            System.out.print(lev3+" level 3 questions,");
            System.out.print("and "+lev4+" level 4 questions,");
        }
        //same as the above code
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
            if(level==1){
                lev1++;
            }
            if(level==2){
                lev2++;
            }
            if(level==3){
                lev3++;
            }
            if(level==4){
                lev4++;
            }
            for(int i=0;i<9;i++){
                Averages thisAverage=new Averages(questionNum,score);
                thisAverage.currentAvg();
                System.out.println("Your average is "+thisAverage.returnDiff());
                CompSciQuestion thisQuestion=new CompSciQuestion(thisAverage.returnDiff(),questionNum);
                if(thisQuestion.QuestionAndAnswerCompSci().equals("Correct")){
                    score++;
                    System.out.println("Correct");
                }
                else{
                    System.out.println("Wrong");
                }
                questionNum++;
                if(thisAverage.returnDiff()==1){
                 lev1++;
                }
                if(thisAverage.returnDiff()==2){
                lev2++;
                }
                if(thisAverage.returnDiff()==3){
                    lev3++;
                }
                if(thisAverage.returnDiff()==4){
                    lev4++;
                }

            }
            System.out.println("Final score: "+score+" questions correct");
            System.out.println("You answered "+ lev1+" level 1 questions, ");
            System.out.print(lev2+" level 2 questions,");
            System.out.print(lev3+" level 3 questions,");
            System.out.print("and "+lev4+" level 4 questions,");
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
            if(level==1){
                lev1++;
            }
            if(level==2){
                lev2++;
            }
            if(level==3){
                lev3++;
            }
            if(level==4){
                lev4++;
            }
            for(int i=0;i<9;i++){
                Averages thisAverage=new Averages(questionNum,score);
                thisAverage.currentAvg();
                System.out.println("Your average is "+thisAverage.returnDiff());
                MathQuestion thisQuestion=new MathQuestion(thisAverage.returnDiff(),questionNum);
                if(thisQuestion.QuestionAndAnswerMath().equals("Correct")){
                    score++;
                    System.out.println("Correct");
                }
                else{
                    System.out.println("Wrong");
                }
                questionNum++;
                if(thisAverage.returnDiff()==1){
                 lev1++;
                }
                if(thisAverage.returnDiff()==2){
                lev2++;
                }
                if(thisAverage.returnDiff()==3){
                    lev3++;
                }
                if(thisAverage.returnDiff()==4){
                    lev4++;
                }

            }
            System.out.println("Final score: "+score+" questions correct");
            System.out.println("You answered "+ lev1+" level 1 questions, ");
            System.out.print(lev2+" level 2 questions,");
            System.out.print(lev3+" level 3 questions,");
            System.out.print("and "+lev4+" level 4 questions,");
        }
        else{
            System.out.println("Invalid quiz, please try again");
            runQuiz();
        }
    }
}