import java.util.Scanner;
public class MathQuestion{
    //takes the current question avg and the type and returns the appropriate question
    private int theAvg;
    private int thePlace;
    private String[] MathQuestions1={
        "1","2","3","4","5","6","7","8","9","10"
    };
    private String[][] MathAnswers1={
        {"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},
        {"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},
        {"A","B","C","D"},{"A","B","C","D"}
    };
    private String[] MathKey1={
        "1","2","3","4","5","6","7","8","9","10"
    };
    private String[] MathQuestions2={
        "1","2","3","4","5","6","7","8","9","10"
    };
    private String[][] MathAnswers2={
        {"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},
        {"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},
        {"A","B","C","D"},{"A","B","C","D"}
    };
    private String[] MathKey2={
        "1","2","3","4","5","6","7","8","9","10"
    };
    private String[] MathQuestions3={
        "1","2","3","4","5","6","7","8","9","10"
    };
    private String[][] MathAnswers3={
        {"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},
        {"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},
        {"A","B","C","D"},{"A","B","C","D"}
    };
    private String[] MathKey3={
        "1","2","3","4","5","6","7","8","9","10"
    };
    private String[] MathQuestions4={
        "1","2","3","4","5","6","7","8","9","10"
    };
    private String[][] MathAnswers4={
        {"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},
        {"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},
        {"A","B","C","D"},{"A","B","C","D"}
    };
    private String[] MathKey4={
        "1","2","3","4","5","6","7","8","9","10"
    };
    public MathQuestion(int avg,int num){
        theAvg=avg;
        thePlace=num;
    }
    public String QuestionAndAnswerMath(){
        Scanner posit=new Scanner(System.in);
        String answer;
        if(theAvg==1){
            System.out.println(MathQuestions1[thePlace]);
            for(int i=0;i<3;i++){
                System.out.println(MathAnswers1[thePlace][i]);
            }
            answer=posit.nextLine();
            if(answer.toLowerCase().equals(MathKey1[thePlace]))return "Correct";
            return "False";
        }
        if(theAvg==2){
            System.out.println(MathQuestions2[thePlace]);
            for(int i=0;i<3;i++){
                System.out.println(MathAnswers2[thePlace][i]);
            }
            answer=posit.nextLine();
            if(answer.toLowerCase().equals(MathKey2[thePlace]))return "Correct";
            return "False";
        }
        if(theAvg==3){
            System.out.println(MathQuestions3[thePlace]);
            for(int i=0;i<3;i++){
                System.out.println(MathAnswers3[thePlace][i]);
            }
            answer=posit.nextLine();
            if(answer.toLowerCase().equals(MathKey3[thePlace]))return "Correct";
            return "False";
        }
        if(theAvg==4){
            System.out.println(MathQuestions4[thePlace]);
            for(int i=0;i<3;i++){
                System.out.println(MathAnswers4[thePlace][i]);
            }
            answer=posit.nextLine();
            if(answer.toLowerCase().equals(MathKey4[thePlace]))return "Correct";
            return "False";
        }
        return "";
        
    }
}