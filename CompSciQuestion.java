import java.util.Scanner;
public class CompSciQuestion{
    //takes the current question avg and the type and returns the appropriate question
    private int theAvg;
    private int thePlace;
    private String[] CompSciQuestions1={
        "1","2","3","4","5","6","7","8","9","10"
    };
    private String[][] CompSciAnswers1={
        {"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},
        {"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},
        {"A","B","C","D"},{"A","B","C","D"}
    };
    private String[] CompSciKey1={
        "1","2","3","4","5","6","7","8","9","10"
    };
    private String[] CompSciQuestions2={
        "1","2","3","4","5","6","7","8","9","10"
    };
    private String[][] CompSciAnswers2={
        {"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},
        {"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},
        {"A","B","C","D"},{"A","B","C","D"}
    };
    private String[] CompSciKey2={
        "1","2","3","4","5","6","7","8","9","10"
    };
    private String[] CompSciQuestions3={
        "1","2","3","4","5","6","7","8","9","10"
    };
    private String[][] CompSciAnswers3={
        {"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},
        {"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},
        {"A","B","C","D"},{"A","B","C","D"}
    };
    private String[] CompSciKey3={
        "1","2","3","4","5","6","7","8","9","10"
    };
    private String[] CompSciQuestions4={
        "1","2","3","4","5","6","7","8","9","10"
    };
    private String[][] CompSciAnswers4={
        {"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},
        {"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},
        {"A","B","C","D"},{"A","B","C","D"}
    };
    private String[] CompSciKey4={
        "1","2","3","4","5","6","7","8","9","10"
    };
    public CompSciQuestion(int avg,int num){
        theAvg=avg;
        thePlace=num;
    }
    public String QuestionAndAnswerCompSci(){
        Scanner posit=new Scanner(System.in);
        String answer;
        if(theAvg==1){
            System.out.println(CompSciQuestions1[thePlace]);
            for(int i=0;i<3;i++){
                System.out.println(CompSciAnswers1[thePlace][i]);
            }
            answer=posit.nextLine();
            if(answer.toLowerCase().equals(CompSciKey1[thePlace]))return "Correct";
            return "False";
        }
        if(theAvg==2){
            System.out.println(CompSciQuestions2[thePlace]);
            for(int i=0;i<3;i++){
                System.out.println(CompSciAnswers2[thePlace][i]);
            }
            answer=posit.nextLine();
            if(answer.toLowerCase().equals(CompSciKey2[thePlace]))return "Correct";
            return "False";
        }
        if(theAvg==3){
            System.out.println(CompSciQuestions3[thePlace]);
            for(int i=0;i<3;i++){
                System.out.println(CompSciAnswers3[thePlace][i]);
            }
            answer=posit.nextLine();
            if(answer.toLowerCase().equals(CompSciKey3[thePlace]))return "Correct";
            return "False";
        }
        if(theAvg==4){
            System.out.println(CompSciQuestions4[thePlace]);
            for(int i=0;i<3;i++){
                System.out.println(CompSciAnswers4[thePlace][i]);
            }
            answer=posit.nextLine();
            if(answer.toLowerCase().equals(CompSciKey4[thePlace]))return "Correct";
            return "False";
        }
        return "";
        
    }
}