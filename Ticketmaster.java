public class Ticketmaster {
    
    private Ride[] rides;

    public Ticketmaster(Ride[] rides) {
        this.rides = new Ride[rides.length];
        for (int i = 0; i < this.rides.length; i++) {
            this.rides[i] = new Ride(rides[i]);
        }
    }


    public Ride getRide(int index) {
        Ride copy = new Ride(this.rides[index]);
        return copy;
    }

    public void setRide(int index, Ride newRide) {
        Ride copy = new Ride(newRide);
        this.rides[index] = copy;
    }



    public void sellTicket(int index) {
        this.rides[index].ride();
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < this.rides.length; i++) {
            temp += "Location: " + i + "\n";
            String rideDescription = this.rides[i].toString();
            temp += rideDescription + "\n";
        }
        return temp;
    }
}
