public class Averages{
    //tracks the total questions
    private int currentPlace;
    //tracks the total points
    private int currentRight;
    //the value of the actual average
    private double avg;
    //initializes the current number of questions completed & the total questions answered correctly
    public Averages(int place,int right){
        currentPlace=place;
        currentRight=right;
    }
    //takes number right and divides by total to get average questions right
    public void currentAvg(){
        avg=(double)currentRight/currentPlace;
        
    }
    //returns a number from 1 to 4 based on the averages. This is what level the next quiz will be at
    public int returnDiff(){
        if(avg<.25)return 1;
        if(avg>=.25&&avg<.5)return 2;
        if(avg>=.5&&avg<.75)return 3;
        return 4;
    }
}