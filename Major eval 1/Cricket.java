import java.io.*;
import java.util.*;

class CricketOverDetails{
    int overNumber;
    int runsScoredInTheOver;
    int wicketsFallenInTheOver;
    public CricketOverDetails(int overs,int runs,int wickets){
        overNumber = overs;
        runsScoredInTheOver = runs;
        this.wicketsFallenInTheOver = wickets;
    }
}

class CricketDataManager{
    int score;
    int wickets;
    int latestover = 0;
    
    public int getwickets(){
        return this.wickets;
    }
    List<CricketOverDetails> data = new ArrayList<CricketOverDetails>();
    public void updateScore(CricketOverDetails over){
        if(over.overNumber > 50 || over.overNumber < latestover){
            System.out.println("InvalidOVER");
            return;
        }
        // for(CricketOverDetails crick  : data){
        //     if(crick.overNumber == over.overNumber){
        //         System.out.println("InValid Over");
        //         return;
        //     }
        // }
        score = score + over.runsScoredInTheOver;
        wickets = wickets + over.wicketsFallenInTheOver;
        latestover = Math.max(latestover,over.overNumber);
        data.add(over);
        System.out.println("Added");
    }
    
    public double getCurrentRunRate(){
        return (double)score/(double)latestover;
    }
    
    public int getPredictedScore(){
        return (int)Math.floor(getCurrentRunRate()*50);
    }
    
    public void showScore(){
        if(data.size() == 0){
            System.out.println("MatchNotStarted");
            return;
        }
        System.out.println(score+"/"+latestover+"("+wickets+")");
    }
}

public class AppTester{
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        CricketDataManager app = new CricketDataManager();
        int exit = 0;
        while(true){
            char ch = scanner.next().charAt(0);
            switch(ch){
                case 'A':
                    int over = scanner.nextInt();
                    int runs = scanner.nextInt();
                    int wickets  = scanner.nextInt();
                    scanner.nextLine();
                    if(runs > 36){
                        System.out.println("InvalidRUNS");
                        break;
                    }
                    if(wickets+app.getwickets() > 10){
                        System.out.println("InvalidWICKETS");
                        break;
                    }
                    app.updateScore(new CricketOverDetails(over,runs,wickets));
                    break;
                case 'C':
                    app.showScore();
                    break;
                case 'R':
                    double rate = app.getCurrentRunRate();
                    StringBuilder sb = new StringBuilder();
                    sb.append(Math.round(rate*100));
                    sb.insert(sb.length()-2,'.');
                    System.out.println(sb.toString());
                  //  System.out.println(Math.round(rate*100)/100D);
                    break;
                case 'P':
                    int score = app.getPredictedScore();
                    System.out.println(score);
                    break;
                case 'q':
                    exit = 1;
                    break;
            }
            if(exit == 1)
                break;
        }
    }
}
