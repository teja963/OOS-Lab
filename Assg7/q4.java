import java.util.*;
interface SortVotes{
    void ascendDisplay(ArrayList<result> my_list);
    void descendDisplay(ArrayList<result> my_list);
}
class ElectionPost implements SortVotes{
    String nameOfThePost;
    ArrayList<String> listOfCandidates = new ArrayList<String>();
    ArrayList<String> votesEntered = new ArrayList<String>();
    public void ascendDisplay(ArrayList<result> my_list) {
        Collections.sort(my_list, new original());
        for(result obj: my_list){
            System.out.println(obj.name+" - "+obj.votes);
        }
    }
    public void descendDisplay(ArrayList<result> my_list){
        Collections.sort(my_list, new reverse());
        for(result obj: my_list){
            System.out.println(obj.name+" - "+obj.votes);
        }
    }
}
class original implements Comparator<result>{
    public int compare(result r1, result r2){
        return r1.votes - r2.votes;
    }
}
class reverse implements Comparator<result>{
    public int compare(result r1, result r2){
        return r2.votes - r1.votes;
    }
}
class result{
    String name;
    int votes;
}
class q4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nameOfThePost = sc.nextLine();
        int numberOfCandidates = sc.nextInt();
        sc.nextLine();
        ElectionPost election_obj = new ElectionPost();
        ArrayList<result> my_list = new ArrayList<result>();
        for(int i = 0; i < numberOfCandidates; i++){
            String ip = sc.nextLine();
            election_obj.listOfCandidates.add(ip);
        }
        int numberOfVotes = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < numberOfVotes; i++){
            String ip = sc.nextLine();
            election_obj.votesEntered.add(ip);
        }
        for(String str: election_obj.listOfCandidates){
            int val = Collections.frequency(election_obj.votesEntered, str);
            result obj = new result();
            obj.name = str;
            obj.votes = val;
            my_list.add(obj);
        }
        System.out.println();
        System.out.println(nameOfThePost);
        for(String str: election_obj.listOfCandidates){
            System.out.println(str);
        }
        election_obj.ascendDisplay(my_list);
        election_obj.descendDisplay(my_list);
    }
}
