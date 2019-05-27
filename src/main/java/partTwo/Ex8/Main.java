import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
        Scanner scanner = new Scanner(System.in);
        Airport airport = new Airport();
        airportPanel(scanner, airport);

    }

    public static void airportPanel(Scanner scanner, Airport airport){
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println();

        while(true){
            printAirportPanelCommands(scanner);
            String command = scanner.nextLine();

            if(command.equals("1")){
                addAirplaneCommand(scanner, airport);
            }else if(command.equals("2")){
                addFlightCommand(scanner, airport);
            }else{
               flightService(scanner, airport);
               break;
            }
        }
    }

    public static void addAirplaneCommand(Scanner scanner, Airport airport){
        System.out.print("Give plane ID: ");
        String id = scanner.nextLine();
        System.out.print("Give plane capacity: ");
        int capacity = Integer.parseInt(scanner.nextLine());

        airport.addPlane(new Airplane(id, capacity));
    }

    public static void addFlightCommand(Scanner scanner, Airport airport){
        System.out.print("Give plane ID: ");
        String id = scanner.nextLine();
        System.out.print("Give departure airport code: ");
        String departureCode = scanner.nextLine();
        System.out.print("Give destination airport code: ");
        String destinationCode = scanner.nextLine();

        if(airport.getPlane(id) != null){
            airport.addFlight(airport.getPlane(id), departureCode, destinationCode);
        }
    }

    public static void printAirportPanelCommands(Scanner scanner){
        System.out.println("Choose operation:");
        System.out.println("[1] Add airplane");
        System.out.println("[2] Add flight");
        System.out.println("[x] Exit");
        System.out.print(">");
    }

    public static void flightService(Scanner scanner, Airport airport){
        System.out.println("Flight service");
        System.out.println("------------");

        while(true){
            printFlightServiceCommands();
            String command = scanner.nextLine();

            if(command.equals("1")){
                airport.printPlanes();
            }else if(command.equals("2")){
                airport.printFlights();
            }else if(command.equals("3")){
                System.out.print("Give plane ID: ");
                String id = scanner.nextLine();
                System.out.println(airport.getPlane(id));
            }else{
                break;
            }
        }
    }

    public static void printFlightServiceCommands(){
        System.out.println("Choose operation:");
        System.out.println("[1] Print planes");
        System.out.println("[2] Print flights");
        System.out.println("[3] Print plane info");
        System.out.println("[x] Quit");
        System.out.print(">");
    }
}
