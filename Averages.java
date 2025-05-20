public class Averages{
    private int currentPlace;
    private int currentRight;
    private double avg;
    public Averages(int place,int right){
        //initializes the current number of questions completed & the total questions answered correctly
        currentPlace=place;
        currentRight=right;
    }
    public void currentAvg(){
        //takes number right and divides by total to get average questions right
        avg=(double)currentRight/currentPlace;
        
    }
    public int returnDiff(){
        if(avg<.25)return 1;
        if(avg>=.25&&avg<.5)return 2;
        if(avg>=.5&&avg<.75)return 3;
        return 4;
    }
}