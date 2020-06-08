package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Theater threater = new Theater("Olympian",8,12);
        threater.getSeats();
        if(threater.reserveSeat("H11")){
            System.out.println("Please pay");
        }else{
            System.out.println("Sorry, seat is taken");
        }

    }
}
