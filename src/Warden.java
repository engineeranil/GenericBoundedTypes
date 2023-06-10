import java.util.Scanner;

public class Warden <T extends PropertiesOfWarden>{
    public Warden(T pa){
    }

    public void printMood(){
        System.out.println("HOW IS WARDENS MOOD?");
        System.out.println("1-HAPPY");
        System.out.println("2-SAD");
        System.out.println("3-ANGRY");
        Scanner sca = new Scanner(System.in) ;
        int wand = sca.nextInt();
        switch(wand){
            case 1:
                System.out.println("WARDEN IS HAPPY");
                break;
            case 2:
                System.out.println("WARDEN IS SAD");
                break;
            case 3 :
                System.out.println("WARDEN IS ANGRY");
                break;
            default:
                System.out.println("YOUR ANSWER IS THE WRONG");
        }
    }
}
