import java.util.Scanner;
public class HistoryQuestion{
    //takes the current question avg and the type and returns the appropriate question
    private int theAvg;
    private int thePlace;
    private String[] HistoryQuestions1={
        "1","2","3","4","5","6","7","8","9","10"
    };
    private String[][] HistoryAnswers1={
        {"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},
        {"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},
        {"A","B","C","D"},{"A","B","C","D"}
    };
    private String[] HistoryKey1={
        "1","2","3","4","5","6","7","8","9","10"
    };
    private String[] HistoryQuestions2={
        "1","2","3","4","5","6","7","8","9","10"
    };
    private String[][] HistoryAnswers2={
        {"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},
        {"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},
        {"A","B","C","D"},{"A","B","C","D"}
    };
    private String[] HistoryKey2={
        "1","2","3","4","5","6","7","8","9","10"
    };
    private String[] HistoryQuestions3={
        "1","2","3","4","5","6","7","8","9","10"
    };
    private String[][] HistoryAnswers3={
        {"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},
        {"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},
        {"A","B","C","D"},{"A","B","C","D"}
    };
    private String[] HistoryKey3={
        "1","2","3","4","5","6","7","8","9","10"
    };
    private String[] HistoryQuestions4={
        "1","2","3","4","5","6","7","8","9","10"
    };
    private String[][] HistoryAnswers4={
        {"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},
        {"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},{"A","B","C","D"},
        {"A","B","C","D"},{"A","B","C","D"}
    };
    private String[] HistoryKey4={
        "1","2","3","4","5","6","7","8","9","10"
    };
    public HistoryQuestion(int avg,int num){
        theAvg=avg;
        thePlace=num;
    }
    public String QuestionAndAnswerHis(){
        Scanner posit=new Scanner(System.in);
        String answer;
        if(theAvg==1){
            System.out.println(HistoryQuestions1[thePlace]);
            for(int i=0;i<3;i++){
                System.out.println(HistoryAnswers1[thePlace][i]);
            }
            answer=posit.nextLine();
            if(answer.toLowerCase().equals(HistoryKey1[thePlace]))return "Correct";
            return "False";
        }
        if(theAvg==2){
            System.out.println(HistoryQuestions2[thePlace]);
            for(int i=0;i<3;i++){
                System.out.println(HistoryAnswers2[thePlace][i]);
            }
            answer=posit.nextLine();
            if(answer.toLowerCase().equals(HistoryKey2[thePlace]))return "Correct";
            return "False";
        }
        if(theAvg==3){
            System.out.println(HistoryQuestions3[thePlace]);
            for(int i=0;i<3;i++){
                System.out.println(HistoryAnswers3[thePlace][i]);
            }
            answer=posit.nextLine();
            if(answer.toLowerCase().equals(HistoryKey3[thePlace]))return "Correct";
            return "False";
        }
        if(theAvg==4){
            System.out.println(HistoryQuestions4[thePlace]);
            for(int i=0;i<3;i++){
                System.out.println(HistoryAnswers4[thePlace][i]);
            }
            answer=posit.nextLine();
            if(answer.toLowerCase().equals(HistoryKey4[thePlace]))return "Correct";
            return "False";
        }
        return "";
        
    }
}