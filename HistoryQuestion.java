import java.util.Scanner;
public class HistoryQuestion{
    //the value of the current average (1-4)
    private int theAvg;
    //the current question number
    private int thePlace;
    //initializes the two instance variables
    public HistoryQuestion(int avg,int num){
        theAvg=avg;
        thePlace=num;
    }
    //the questions for avg=1
    private String[] HistoryQuestions1={
        "1","2","3","4","5","6","7","8","9","10"
    };
    //the possible answers for avg=1. This is a 2D array because there are 4 possible answers for each question
    private String[][] HistoryAnswers1={
        {"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},
        {"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},
        {"A","B","C","D"},{"A","B","C","D"}
    };
    //the correct answers for avg=1
    private String[] HistoryKey1={
        "1","2","3","4","5","6","7","8","9","10"
    };
    //the questions for avg=2
    private String[] HistoryQuestions2={
        "1","2","3","4","5","6","7","8","9","10"
    };
    //the possible answers for avg=2. This is a 2D array because there are 4 possible answers for each question
    private String[][] HistoryAnswers2={
        {"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},
        {"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},
        {"A","B","C","D"},{"A","B","C","D"}
    };
    //the correct answers for avg=2
    private String[] HistoryKey2={
        "1","2","3","4","5","6","7","8","9","10"
    };
    //the questions for avg=3
    private String[] HistoryQuestions3={
        "1","2","3","4","5","6","7","8","9","10"
    };
    //the possible answers for avg=3. This is a 2D array because there are 4 possible answers for each question
    private String[][] HistoryAnswers3={
        {"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},
        {"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},
        {"A","B","C","D"},{"A","B","C","D"}
    };
    //the correct answers for avg=3
    private String[] HistoryKey3={
        "1","2","3","4","5","6","7","8","9","10"
    };
    //the questions for avg=4
    private String[] HistoryQuestions4={
        "1","2","3","4","5","6","7","8","9","10"
    };
    //the possible answers for avg=4. This is a 2D array because there are 4 possible answers for each question
    private String[][] HistoryAnswers4={
        {"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},
        {"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},
        {"A","B","C","D"},{"A","B","C","D"}
    };
    //the answers for avg=4
    private String[] HistoryKey4={
        "1","2","3","4","5","6","7","8","9","10"
    };
    //asks a single history question
    public String QuestionAndAnswerHis(){
        //scanner records the students answer
        Scanner posit=new Scanner(System.in);
        String answer;
        //if the avg=1
        if(theAvg==1){
            //asks the student the current question
            System.out.println(HistoryQuestions1[thePlace]);
            //shows the student each of the 4 answers
            for(int i=0;i<4;i++){
                System.out.println(HistoryAnswers1[thePlace][i]);
            }
            //records the students answer
            answer=posit.nextLine();
            posit.close();
            //checks to see if the students answer is equal to the correct answer
            if(answer.toLowerCase().equals(HistoryKey1[thePlace]))return "Correct";
            return "False";
        }
        //if the avg=2
        if(theAvg==2){
            //asks the student the current question
            System.out.println(HistoryQuestions2[thePlace]);
            //shows the student each of the 4 answers
            for(int i=0;i<4;i++){
                System.out.println(HistoryAnswers2[thePlace][i]);
            }
            //records the students answer
            answer=posit.nextLine();
            posit.close();
            //checks to see if the students answer is equal to the correct answer
            if(answer.toLowerCase().equals(HistoryKey2[thePlace]))return "Correct";
            return "False";
        }
        //if the avg=3
        if(theAvg==3){
            //asks the student the current question
            System.out.println(HistoryQuestions3[thePlace]);
            //shows the student each of the 4 answers
            for(int i=0;i<4;i++){
                System.out.println(HistoryAnswers3[thePlace][i]);
            }
            //records the students answer
            answer=posit.nextLine();
            posit.close();
            //checks to see if the students answer is equal to the correct answer
            if(answer.toLowerCase().equals(HistoryKey3[thePlace]))return "Correct";
            return "False";
        }
        //if the avg=4
        if(theAvg==4){
            //asks the student the current question
            System.out.println(HistoryQuestions4[thePlace]);
            //shows the student each of the 4 answers
            for(int i=0;i<4;i++){
                System.out.println(HistoryAnswers4[thePlace][i]);
            }
            //records the students answer
            answer=posit.nextLine();
            posit.close();
            //checks to see if the students answer is equal to the correct answer
            if(answer.toLowerCase().equals(HistoryKey4[thePlace]))return "Correct";
            return "False";
        }
        posit.close();
        return "";
        
    }
}