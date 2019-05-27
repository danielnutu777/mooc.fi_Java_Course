import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Airport {
    private ArrayList<Airplane> airplanes;
    private ArrayList<Flight> flights;

    public Airport() {
        airplanes = new ArrayList<Airplane>();
        flights = new ArrayList<Flight>();
    }

    public void addPlane(Airplane airplane){
        airplanes.add(airplane);
    }

    public Airplane getPlane(String id){
        for (Airplane a: airplanes) {
            if(a.getId().equals(id)){
                return a;
            }
        }
        return null;
    }

    public void addFlight(Airplane airplane, String departureCode, String destinationCode){
        flights.add(new Flight(airplane, departureCode, destinationCode));
    }

    public void printPlanes(){
        Collections.reverse(airplanes);
        for (Airplane a: airplanes) {
            System.out.println(a);
        }
    }

    public void printFlights(){
        Collections.reverse(flights);
        for (Flight f: flights) {
            System.out.println(f);
        }
    }
}
