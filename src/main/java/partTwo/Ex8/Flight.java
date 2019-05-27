
public class Flight {
    private Airplane airplane;
    private String departureAirportCode;
    private String destinationAirportCode;


    public Flight(Airplane airplane, String departureAirportCode, String destinationAirportCode) {
        this.airplane = airplane;
        this.departureAirportCode = departureAirportCode;
        this.destinationAirportCode = destinationAirportCode;
    }

    @Override
    public String toString() {
        return airplane.getId() + " (" + airplane.getCapacity() + " ppl)" + " (" + departureAirportCode + "-" + destinationAirportCode + ")";
    }
}
