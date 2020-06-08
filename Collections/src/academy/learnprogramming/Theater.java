package academy.learnprogramming;

import java.util.*;

public class Theater {

    private  final String theaterName;
    private Collection<Seat> seats = new LinkedHashSet<>();

    public Theater(String theaterName, int numRow, int seatsPerRow) {
        this.theaterName = theaterName;

        int lastRow = 'A' + (numRow -1);
        for(char row ='A'; row <= lastRow;row++){
            for(int seatNum = 1; seatNum<=seatsPerRow;seatNum++){
                Seat seat = new Seat(row + String.format("%02d",seatNum));
                seats.add(seat);
            }
        }
    }

    public String getTheaterName() {
        return theaterName;
    }

    public boolean reserveSeat(String seatNumber){
        Seat requestedSeat = null;
        for(Seat seat : seats){
            if(seat.getSeatNumber().equals(seatNumber)){
                requestedSeat = seat;
                break;
            }
        }
        if(requestedSeat ==  null){
            System.out.println("There is no reserved seat "+seatNumber);
            return false;
        }
        return requestedSeat.reserve();
    }

    public void getSeats(){
        for(Seat seat: seats){
            System.out.println(seat.getSeatNumber());
        }
    }

    private class Seat{
        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public boolean reserve(){
            if(!this.reserved){
                System.out.println("Seat" + seatNumber+" reserved");
                return true;
            }else{
                return false;
            }
        }

        public boolean cancel(){
            if(this.reserved){
                this.reserved = false;
                System.out.println("Reservation of Seat "+seatNumber+" cancelled");
                return true;
            }else{
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }
    }
}
