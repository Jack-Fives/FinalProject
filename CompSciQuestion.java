import java.util.Scanner;
public class CompSciQuestion{
    //see documentation in HistoryQuestion method for explanation
    private int theAvg;
    private int thePlace;
    private String[] CompSciQuestions1={
        "1) What is the correct way to start a Java program?",
        "2) Which of the following is a valid variable declaration in Java?",
        "3) What is the output of this code System.out.println(3 + 4 * 2);",
        "4) Which data type is used to store true/false values?",
        "5) What is the result of 10 % 3 in Java?",
        "6) Which of these is used to read user input from the console in Java?",
        "7) What keyword is used to define a class in Java?",
        "8) What is the correct syntax to create an object of a class called Car?",
        "9) What does the System.out.println() statement do?",
        "10) Which symbol is used for single-line comments in Java?"
    };
    private String[][] CompSciAnswers1={
        {"A) int main()","B) public static main(String[] args)","C) public static void main(String[] args)","D) static void main()"},
        {"A) int 2cool = 5;","B) int cool2 = 5;","C) int cool-2 = 5;","D) int 'cool' = 5;"},
        {"A) 14","B) 11","C) 10","D) 16"},
        {"A) int","B) char","C) boolean","D) String"},
        {"A) 3","B) 1","C) 0","D) 10"},
        {"A) ConsoleReader","B) Scanner","C) InputReader","D) System.input()"},
        {"A) define","B) object","C) class","D) structure"},
        {"A) Car = new Car();","B) Car myCar = Car();","C) Car myCar = new Car();","D) Car myCar();"},
        {"A) Takes input","B) Compiles the program","C) Prints output to the console","D) Saves a file"},
        {"A) <!-- -->","B) //","C) /* */","D) #"}
    };
    private String[] CompSciKey1={
        "c","b","b","c","b","b","c","c","c","b"
    };
    private String[] CompSciQuestions2={
        "1) What will this code output?:\nint x = 5;\n" + //
                        "if (x > 3) {\n" + //
                        "    System.out.print(\"A\");\n" + //
                        "} else {\n" + //
                        "    System.out.print(\"B\");\n" + //
                        "}\n" + //
                        "", 
        "2) Which of the following is a loop structure in Java?",
        "3) What is the value of result after this code?: \nint result = 0;\n" + //
                        "for (int i = 1; i <= 3; i++) {\n" + //
                        "    result += i;\n" + //
                        "}\n" + //
                        "",
        "4) What does this Java statement do?: \nString s = \"Hello\".toUpperCase();",
        "5) What is the output of the following code?: \nint x = 10;\n" + //
                        "while (x > 7) {\n" + //
                        "    x--;\n" + //
                        "}\n" + //
                        "System.out.println(x);\n" + //
                        "",
        "6) Which keyword is used to return a value from a method?",
        "7) Which of the following is a correct method declaration?",
        "8) What is the output of this code?",
        "9) What does break do inside a loop?",
        "10) Which of these is not a primitive data type in Java?"
    };
    private String[][] CompSciAnswers2={
        {"A) A","B) B","C) AB","D) Nothing"},
        {"A) repeat-until","B) loop","C) for","D) when"},
        {"A) 3","B) 6","C) 9","D) 1"},
        {"A) Converts string to lowercase","B) Converts string to uppercas","C) Removes whitespace","D) Appends \"toUpperCase\" to the string"},
        {"A) 10","B) 8","C) 7","D) 9"},
        {"A) return","B) output","C) exit","D) send"},
        {"A) function add() int","B) int add(int a, int b)","C) add(int a, int b) -> int","D) define add(int, int):"},
        {"A) 4","B) 5","C) 6","D) Error"},
        {"A) Skips the current iteration","B) Ends the loop immediately","C) Restarts the loop","D) Ignores the loop"},
        {"A) boolean","B) char","C) String","D) double"}
    };
    private String[] CompSciKey2={
        "a","c","b","b","c","a","b","b","b","c"
    };
    private String[] CompSciQuestions3={
        "1) What is the output of this code?: \nint[] nums = {1, 2, 3};\n" + //
                        "System.out.println(nums[1]);",
        "2) What is encapsulation in Java?",
        "3) What keyword is used to inherit a class in Java?",
        "4) What is the size of this array?: \nint[] values = new int[5];",
        "5) Which access modifier allows members to be accessed only within the same class?",
        "6) What is method overloading?",
        "7) What will this code print?: \nString[] colors = {\"red\", \"green\", \"blue\"};\n" + //
                        "System.out.println(colors.length);",
        "8) What is the purpose of a constructor?",
        "9) Which of the following is true about static methods?",
        "10) Which of these shows proper object instantiation?"
    };
    private String[][] CompSciAnswers3={
        {"A) 1","B) 2","C) 3","D) 0"},
        {"A) Hiding data using private access and providing access via methods","B) Dividing a program into functions","C) Using loops inside methods","D) Linking multiple classes together"},
        {"A) implement","B) extends","C) inherits","D) uses"},
        {"A) 4","B) 5","C) 0","D) Unknown"},
        {"A) public","B) protected","C) private","D) default"},
        {"A) Defining multiple methods with the same name but different parameters","B) Calling one method inside another","C) Using many methods in a program","D) Assigning multiple values to a variable"},
        {"A) 2","B) 3","C) 4","D) Error"},
        {"A) To destroy objects","B) To run background tasks","C) To initialize objects when they are created","D) To call static methods"},
        {"A) They can access instance variables directly","B) They belong to the class rather than an instance","C) They cannot be called without creating an object","D) They are private by default"},
        {"A) Person p();","B) new Person();","C) Person p = new Person();","D) Person => new Person();"}


    };
    private String[] CompSciKey3={
        "b","a","b","b","c","a","b","c","b","c"
    };
    private String[] CompSciQuestions4={
        "1) What is polymorphism in Java?",
        "2) What will this code print?:\ntry {\n" + //
                        "    int x = 5 / 0;\n" + //
                        "} catch (ArithmeticException e) {\n" + //
                        "    System.out.println(\"Error\");\n" + //
                        "}",
        "3) What does the final keyword do when used on a variable?",
        "4) Which of these best demonstrates method overriding?",
        "5) What is the correct way to create a subclass?",
        "6) What will be printed?: \nString s = null;\n" + //
                        "try {\n" + //
                        "    System.out.println(s.length());\n" + //
                        "} catch (NullPointerException e) {\n" + //
                        "    System.out.println(\"Null!\");\n" + //
                        "}",
        "7) What does super refer to in a subclass?",
        "8) Which interface is used for sorting objects in a collection?",
        "9) Which statement writes data to a file in Java?",
        "10) What is our purpose?"
    };
    private String[][] CompSciAnswers4={
        {"A) Having multiple constructors","B) Creating many objects","C) Using a superclass reference to refer to subclass objects","D) Inheriting multiple classes at once"},
        {"A) Nothing","B) Runtime error","C) Error","D) Error printed to file"},
        {"A) Allows it to be changed later","B) Makes it public","C) Prevents reassignment","D) Converts it to a string"},
        {"A) Writing multiple constructors","B) Same method name with different parameters in the same class","C) Subclass providing its own version of a superclass method","D) Creating many instances of a method"},
        {"A) class B derives A {}","B) class B inherits A {}","C) class B extends A {}","D) class B imports A {}"},
        {"A) null","B) 0","C) Error","D) Null!"},
        {"A) Its own class","B) The parent class","C) The Java superclass","D) The main method"},
        {"A) Runnable","B) Comparator","C) Scanner","D) List"},
        {"A) new FileWriter(\"file.txt\")","B) File.open(\"file.txt\")","C) Scanner.nextLine()","D) System.read(\"file.txt\")"},
        {"A) To amass wealth","B) To destroy our enemies","C) To summer","D) To create beauty"}
    };
    private String[] CompSciKey4={
        "c","c","c","c","c","d","b","b","a","d"
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
            for(int i=0;i<4;i++){
                System.out.println(CompSciAnswers1[thePlace][i]);
            }
            answer=posit.nextLine();
            if(answer.toLowerCase().equals(CompSciKey1[thePlace]))return "Correct";
            return "False";
        }
        if(theAvg==2){
            System.out.println(CompSciQuestions2[thePlace]);
            for(int i=0;i<4;i++){
                System.out.println(CompSciAnswers2[thePlace][i]);
            }
            answer=posit.nextLine();
            if(answer.toLowerCase().equals(CompSciKey2[thePlace]))return "Correct";
            return "False";
        }
        if(theAvg==3){
            System.out.println(CompSciQuestions3[thePlace]);
            for(int i=0;i<4;i++){
                System.out.println(CompSciAnswers3[thePlace][i]);
            }
            answer=posit.nextLine();
            if(answer.toLowerCase().equals(CompSciKey3[thePlace]))return "Correct";
            return "False";
        }
        if(theAvg==4){
            System.out.println(CompSciQuestions4[thePlace]);
            for(int i=0;i<4;i++){
                System.out.println(CompSciAnswers4[thePlace][i]);
            }
            answer=posit.nextLine();
            if(answer.toLowerCase().equals(CompSciKey4[thePlace]))return "Correct";
            return "False";
        }
        posit.close();
        return "";
        
    }
}