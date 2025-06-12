import java.util.Scanner;
public class MathQuestion{
    //see documentation in HistoryQuestion method for explanation
    private int theAvg;
    private int thePlace;
    private String[] MathQuestions1={
        "1) What is the value of 7 + 5 * 2?",
        "2) Solve for x: 2x + 3 = 11",
        "3) What is the square root of 81?",
        "4) Which of the following is a prime number?",
        "5) What is 25% of 200?",
        "6) What is the perimeter of a rectangle with length 5 and width 3?",
        "7) What is 2 to the power of 4?",
        "8) Convert 0.75 to a fraction.",
        "9) What is the next number in the sequence: 2, 4, 8, 16, ?",
        "10) Simplify: (3x + 4x)"
    };
    private String[][] MathAnswers1={
        {"A) 24","B) 19","C) 17","D) 27"},
        {"A) 3","B) 4","C) 5","D) 6"},
        {"A) 7","B) 8","C) 9","D) 10"},
        {"A) 15","B) 17","C) 21","D) 25"},
        {"A) 25","B) 40","C) 50","D) 60"},
        {"A) 8","B) 15","C) 16","D) 18"},
        {"A) 8","B) 12","C) 16","D) 18"},
        {"A) 1/4","B) 2/3","C) 3/4","D) 4/5"},
        {"A) 18","B) 24","C) 30","D) 32"},
        {"A) 7x","B) x","C) 12x","D) 1x"}
    };
    private String[] MathKey1={
        "c","b","c","b","c","c","c","c","d","a"
    };
    private String[] MathQuestions2={
        "1) Solve: 3x-5=16",
        "2) What is the slope of the line given by the equation 2y=6x-4",
        "3) Factor x^2-9x+20",
        "4) What is the distance between the points (3, 4) and (7, 1)?",
        "5) What is the volume of a cube with side length 4 cm?",
        "6) Simplify: (2x^2)(3x^3)",
        "7) If the mean of the numbers 5, 7, 8, x, and 10 is 8, what is the value of x?",
        "8) A triangle has angles 40°, 60°, and __?",
        "9) Convert 3/8 to a decimal",
        "10) A line passes through (0, 2) and has a slope of -3. What is its equation?"
    };
    private String[][] MathAnswers2={
        {"A) 5","B) 7","C) 6","D) 4"},
        {"A) 3","B) 2","C) 6","D) 4"},
        {"A) (x-4)(x-5)","B) (x+4)(x+5)","C) (x-2)(x-10)","D) (x-1)(x-20)"},
        {"A) 4","B) 5","C) √25","D) 5√2"},
        {"A) 16 cm³","B) 32 cm³","C) 64 cm³","D) 48 cm³"},
        {"A) 6x⁵","B) 5x⁶","C) 6x⁶","D) 6x⁴"},
        {"A) 10","B) 12","C) 9","D) 8"},
        {"A) 80°","B) 90°","C) 100°","D) 60°"},
        {"A) 0.325","B) 0.375","C) 0.4","D) 0.3"},
        {"A) y = -3x + 2","B) y = 3x + 2","C) y = -3x - 2","D) y = 2x - 3"}
    };
    private String[] MathKey2={
        "b","a","a","b","c","a","a","a","b","a"
    };
    private String[] MathQuestions3={
        "1) Solve for x: (2x-1)/3=5",
        "2) Which of the following represents the inverse of the function f(x)=2x+3",
        "3) What is the discriminant of the quadratic equation 2x^2-4x+1=0",
        "4) A circle has the equation (x-3)^2+(y+2)^2=16. What is the radius?",
        "5) If the probability of event A is 0.3 and the probability of event B is 0.5, what is the probability that either A or B occurs (assuming they're mutually exclusive)?",
        "6) What is the solution set for x^2-4x-5=0",
        "7) What is the midpoint between the points (6, 4) and (2, -2)?",
        "8) Simplify: (x^2-4)/(x-2)",
        "9) If a data set has a mean of 10 and a standard deviation of 2, which of the following is within one standard deviation of the mean?",
        "10) A right triangle has legs of lengths 5 and 12. What is the length of the hypotenuse?"
    };
    private String[][] MathAnswers3={
        {"A) 6","B) 7","C) 8","D) 9"},
        {"f^-1(x)=(x+3)/2","f^-1(x)=(x-3)/2","f^-1(x)=2x-3","f^-1(x)=2/(x+3)"},
        {"A) 4","B) 0","C) 8","D) 16"},
        {"A) 4","B) 8","C) 2","D) 16"},
        {"A) 0.8","B) 0.15","C) 0.5","D) 0.65"},
        {"A) {5,1}","B) {−5,1}","C) {-5,-1}","D) {5,1}"},
        {"A) (4, 1)","B) (2, 3)","C) (8, 6)","D) (3, 2)"},
        {"A) x + 2","B) x - 2","C) x^2 - 2","D) x^2 - 2x - 4"},
        {"A) 6","B) 13","C) 11","D) 15"},
        {"A) 13","B) 10","C) 17","D) 15"}
    };
    private String[] MathKey3={
        "c","b","c","a","a","b","a","a","c","a"
    };
    private String[] MathQuestions4={
        "1) Solve the system of equations: 2x+y=7|3x-y=8",
        "2) What is the domain of the function f(x)=1/x-5",
        "3) Factor completely: x^3-27",
        "4) What is the range of the function x^2+6x+9",
        "5) A bag contains 4 red, 5 blue, and 3 green marbles. What is the probability of drawing a blue or green marble?",
        "6) What is the sum of the roots of the quadratic equation 5x^2-3x+2=0?",
        "7) What is the y-intercept of the line passing through (2,3) and (4,7)?",
        "8) Which of the following functions represents exponential growth?",
        "9) Find the value of x in the geometric sequence: 2, 6, 18, x",
        "10) The average (mean) of five numbers is 20. If one of the numbers is 10, what is the average of the remaining four numbers?"
    };
    private String[][] MathAnswers4={
        {"A) x=3, y=1","B) x=2, y=3","C) x=1, x=5","D) x=2, y=2"},
        {"A) All real numbers","B) All real numbers except 0","C) All real numbers except 5","D) x ≥ 0"},
        {"A) (x-3)(x^2+3x+9)","B) (x-3)(x^2-3x+9)","C) (x+3)(x^2+3x+9)","D (x+3)(x^2-3x+9)"},
        {"A) y≥-9","B) y≥0","C) 0≥y","D) y≥−∞"},
        {"A) 4/12","B) 8/12","C) 5/12","D) 5/8"},
        {"A) 3","B) -3","C) 3/5","D) -3/5"},
        {"A) 1","B) 0","C) -1","D) 2"},
        {"A) y=2^x","B) y=x^2","C) y=√x","D) y=x^3"},
        {"A) 36","B) 54","C) 72","D) 81"},
        {"A) 22.5","B) 21","C) 25","D) 20"}
    };
    private String[] MathKey4={
        "a","c","a","b","b","c","c","a","b","a"
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
            for(int i=0;i<4;i++){
                System.out.println(MathAnswers1[thePlace][i]);
            }
            answer=posit.nextLine();
            if(answer.toLowerCase().equals(MathKey1[thePlace]))return "Correct";
            return "False";
        }
        if(theAvg==2){
            System.out.println(MathQuestions2[thePlace]);
            for(int i=0;i<4;i++){
                System.out.println(MathAnswers2[thePlace][i]);
            }
            answer=posit.nextLine();
            if(answer.toLowerCase().equals(MathKey2[thePlace]))return "Correct";
            return "False";
        }
        if(theAvg==3){
            System.out.println(MathQuestions3[thePlace]);
            for(int i=0;i<4;i++){
                System.out.println(MathAnswers3[thePlace][i]);
            }
            answer=posit.nextLine();
            if(answer.toLowerCase().equals(MathKey3[thePlace]))return "Correct";
            return "False";
        }
        if(theAvg==4){
            System.out.println(MathQuestions4[thePlace]);
            for(int i=0;i<4;i++){
                System.out.println(MathAnswers4[thePlace][i]);
            }
            answer=posit.nextLine();
            if(answer.toLowerCase().equals(MathKey4[thePlace]))return "Correct";
            return "False";
        }
        posit.close();
        return "";
        
    }
}