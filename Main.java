import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] defaultCategories = new String[] {"Amusement Park Ride", "Premium"};

        Ride[] rides = new Ride[] {
            new Ride("Superman", 5, 2002, defaultCategories),
            new Ride("Titan's Run", 10, 2015, new String[] {"Aquatica", "Supervision"}),
            new Ride("Speedy's Way", 12, 2023, defaultCategories)
        };

        Ticketmaster ticketmaster = new Ticketmaster(rides);


        System.out.println("\n ****** JAVA TICKETMASTER! ****** \n");        
        System.out.println("Feel free to browse through our fantastic rides.\n");
        System.out.println(ticketmaster);
        System.out.println("Which car are you interested in? (0 - 3).\n");
        Scanner scan = new Scanner(System.in);
        int index = scan.nextInt();

        // sell car here... 
        ticketmaster.sellTicket(index);

        scan.close();

        // Ride rollercoaster = new Ride("Superman", 5, 2002, defaultCategories);
        // //rollercoaster.name = "Superman";
        // //rollercoaster.price = 5;
        // //rollercoaster.year = 2002;
        
        // Ride waterslide = new Ride("Titan's Run", 10, 2015, new String[] {"Aquatica", "Supervision"});
        // // waterslide.name = "Titan's run";
        // // waterslide.price = 10;
        // // waterslide.year = 2015;

        // Ride bumpercars = new Ride(waterslide);
        // bumpercars.setName("Speedy's Way");
        // bumpercars.setPrice(12);

        // rollercoaster.toString();
        // rollercoaster.ride();
        // waterslide.ride();
        // bumpercars.ride();
    
    
    // System.out.println("Welcome to the " + rollercoaster.getName() + "ride. " + "The cost of this ride is $" 
    // + rollercoaster.getPrice() + ". This premium ride was added to the park in " + rollercoaster.getYear() + ".");

    // System.out.println("Welcome to the " + waterslide.getName() + "ride. " + "The cost of this ride is $" 
    // + waterslide.getPrice() + ". This premium ride was added to the park in " + waterslide.getYear() + ".");

    // System.out.println("Welcome to the " + bumpercars.getName() + "ride. " + "The cost of this ride is $" 
    // + bumpercars.getPrice() + ". This premium ride was added to the park in " + bumpercars.getYear() + ".");
    
    
    }

}