import java.util.Scanner;
public class HistoryQuestion{
    //records the current average
    private int theAvg;
    //records the current position
    private int thePlace;
    public HistoryQuestion(int avg,int num){
        theAvg=avg;
        thePlace=num;
    }
    //the questions for avg=1
    private String[] HistoryQuestions1={
        "1) Who was the first President of the United States?",
        "2) In which year did World War II end?",
        "3) What ancient civilization built the pyramids of Giza?",
        "4) Who wrote the Declaration of Independence?",
        "5) What empire was ruled by Julius Caesar?",
        "6) What was the main cause of the American Civil War?",
        "7) What event started World War I?",
        "8) What was the Cold War?",
        "9) Which famous wall divided Berlin during the Cold War?",
        "10) Who was the British Prime Minister during most of WWII?"
    };
    //the possible answers for avg=1. This is a 2D array because there are 4 possible answers for each question
    private String[][] HistoryAnswers1={
        {"A) Thomas Jefferson","B) Abraham Lincoln","C) George Washington","D) John Adams"},
        {"A) 1939","B) 1943","C) 1945","D) 1950"},
        {"A) Romans","B) Greeks","C) Babylonians","D) Egyptians"},
        {"A) Alexander Hamilton","B) Benjamin Franklin","C) Thomas Jefferson","D) John Hancock"},
        {"A) Greek Empire","B) Roman Empire","C) Ottoman Empire","D) Persian Empire"},
        {"A) Taxation","B) Westward Expansion","C) Slavery","D) Foreign Invasion"},
        {"A) Invasion of Poland","B) Sinking of Lusitania","C) Assassination of Archduke Franz Ferdinand","D) Attack on Pearl Harbor"},
        {"A) A military battle","B) An economic war","C) A period of political tension","D) A civil war in Russia"},
        {"A) Great Wall of China","B) Iron Curtain","C) Berlin Wall","D) Wall of Democracy"},
        {"A) Neville Chamberlain","B) Margaret Thatcher","C) Winston Churchill","D) Tony Blair"}
    };
    //the correct answers for avg=1
    private String[] HistoryKey1={
        "c","c","d","c",
        "b","c","c",
        "c","c","c"
    };
    //the questions for avg=2
    private String[] HistoryQuestions2={
        "1) What was the primary purpose of the Marshall Plan?",
        "2) Which battle is considered the turning point of the American Revolutionary War?",
        "3) What was the significance of the Magna Carta?",
        "4) Which civilization created the first known code of laws?",
        "5) The French Revolution began in which year?",
        "6) Who was the leader of the Soviet Union during the Cuban Missile Crisis?",
        "7) The Iron Curtain was a term popularized by which leader?",
        "8) Which U.S. president issued the Emancipation Proclamation?",
        "9) What caused the Great Depression?",
        "10) The Treaty of Versailles ended which war?"
    };
    //the possible answers for avg=2. This is a 2D array because there are 4 possible answers for each question
    private String[][] HistoryAnswers2={
        {"A) To fund U.S. military operations in Asia","B) To rebuild European economies after WWII","C) To establish NATO","D) To divide Germany"},
        {"A) Battle of Bunker Hill","B) Battle of Saratoga","C) Battle of Yorktown","D) Battle of Lexington"},
        {"A) It ended World War I","B) It limited the power of the English monarch","C) It started the English Civil War","D) It abolished feudalism"},
        {"A) Egyptians","B) Greeks","C) Babylonians","D) Romans"},
        {"A) 1776","B) 1789","C) 1804","D) 1815"},
        {"A) Stalin","B) Khrushchev","C) Lenin","D) Brezhnev"},
        {"A) Roosevelt","B) Stalin","C) Churchill","D) Truman"},
        {"A) George Washington","B) Thomas Jefferson","C) Abraham Lincoln","D) Andrew Jackson"},
        {"A) World War I","B) Dust Bowl","C) Stock Market Crash of 1929","D) Oil Crisis"},
        {"A) World War I","B) World War II","C) Napoleonic Wars","D) Crimean War"}
    };
    //the correct answers for avg=2
    private String[] HistoryKey2={
        "b","b","b",
        "c","b","b","c","c","c","b"
    };
    //the questions for avg=3
    private String[] HistoryQuestions3={
        "1) What year did the Berlin Wall fall?",
        "2) Who was the first emperor of a unified China?",
        "3) What document ended the absolute monarchy in England?",
        "4) What sparked the beginning of the Protestant Reformation?",
        "5) Who was the U.S. president during the majority of the Great Depression?",
        "6) What was the main goal of the United Nations at its founding?",
        "7) Who led the Haitian Revolution?",
        "8) What major conflict was ended by the Treaty of Ghent?",
        "9) What ancient empire was known for its road system and use of quipus?",
        "10) The Meiji Restoration was a period of modernization in which country?"
    };
    //the possible answers for avg=3. This is a 2D array because there are 4 possible answers for each question
    private String[][] HistoryAnswers3={
        {"A) 1985","B) 1987","C) 1989","D) 1991"},
        {"A) Confucius","B) Qin Shi Huang","C) Wu Zetian","D) Sun Yat-sen"},
        {"A) Magna Carta","B) English Bill of Rights","C) Habeas Corpus Act","D) Petition of Right"},
        {"A) Council of Trent","B) 95 Theses by Martin Luther","C) English Civil War","D) Spanish Inquisition"},
        {"A) Woodrow Wilson","B) Calvin Coolidge","C) Franklin D. Roosevelt","D) Herbert Hoover"},
        {"A) Promote free trade","B) End colonialism","C) Maintain international peace","D) Support communism"},
        {"A) Jean-Jacques Dessalines","B) Toussaint Louverture","C) Simon Bolivar","D) Henry Christophe"},
        {"A) War of 1812","B) American Revolution","C) Civil War","D) Spanish-American War"},
        {"A) Aztec","B) Maya","C) Inca","D) Olmec"},
        {"A) China","B) Korea","C) Vietnam","D) Japan"}
    };
    //the correct answers for avg=3
    private String[] HistoryKey3={
        "c","b","a","b","c","c","b","a","c","d"
    };
    //the questions for avg=4
    private String[] HistoryQuestions4={
        "1) What was the main consequence of the Congress of Vienna (1815)?",
        "2) What ideology did Karl Marx and Friedrich Engels promote in The Communist Manifesto?",
        "3) The Opium Wars were fought between which two countries?",
        "4) What major shift did the Neolithic Revolution bring about?",
        "5) What was the outcome of the Russo-Japanese War (1904–1905)?",
        "6) Which empire was known for its millet system, allowing religious minorities a degree of autonomy?",
        "7) Which treaty formally ended the Thirty Years' War in 1648?",
        "8) What was the significance of the Battle of Hastings (1066)?",
        "9) What was the purpose of the Berlin Conference (1884–85)?",
        "10) What was a major result of the Glorious Revolution of 1688?"
    };
    //the possible answers for avg=4. This is a 2D array because there are 4 possible answers for each question
    private String[][] HistoryAnswers4={
        {"A) It ended the Napoleonic Wars and restored monarchies","B) It established the League of Nations","C) It began German unification","D) It abolished slavery in Europe"},
        {"A) Capitalism","B) Imperialism","C) Communism","D) Anarchism"},
        {"A) China and Japan","B) Britain and China","C) China and France","D) Britain and India"},
        {"A) Industrial labor","B) Sedentary agriculture","C) Iron weapon use","D) Writing systems"},
        {"A) Russia annexed Manchuria","B) Japan defeated a major European power","C) It started World War I","D) It ended Japanese imperial ambitions"},
        {"A) Roman Empire","B) Byzantine Empire","C) Ottoman Empire","D) British Empire"},
        {"A) Treaty of Versailles","B) Peace of Augsburg","C) Treaty of Tordesillas","D) Peace of Westphalia"},
        {"A) It ended Viking rule in England","B) It marked the beginning of Norman rule in England","C) It unified England and Scotland","D) It ended the Hundred Years’ War"},
        {"A) To divide Africa among European powers","B) To establish peace after WWI","C) To discuss Cold War alliances","D) To form the League of Nations"},
        {"A) The return of absolute monarchy in England","B) The signing of the Magna Carta","C) The establishment of a constitutional monarchy","D) The start of the English Civil War"}
    };
    //the answers for avg=4
    private String[] HistoryKey4={
        "a","c","b","b","b","c","d","b","a","c"
    };
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
            //checks to see if the students answer is equal to the correct answer
            if(answer.toLowerCase().equals(HistoryKey4[thePlace]))return "Correct";
            return "False";
        }
        posit.close();
        return "";
        
    }
}