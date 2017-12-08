package com.kodilla.good.patterns.FlightVer2;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Flight {

    private String flightNumber;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private String departureAirport;
    private String arrivalAirport;
    DateTimeFormatter dataTimeFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public Flight(String flightNumber, LocalDateTime departureTime, LocalDateTime arrivalTime, String departureAirport, String arrivalAirport) {
        this.flightNumber = flightNumber;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!flightNumber.equals(flight.flightNumber)) return false;
        if (!departureTime.equals(flight.departureTime)) return false;
        if (!arrivalTime.equals(flight.arrivalTime)) return false;
        if (!departureAirport.equals(flight.departureAirport)) return false;
        return arrivalAirport.equals(flight.arrivalAirport);
    }

    @Override
    public int hashCode() {
        int result = flightNumber.hashCode();
        result = 31 * result + departureTime.hashCode();
        result = 31 * result + arrivalTime.hashCode();
        result = 31 * result + departureAirport.hashCode();
        result = 31 * result + arrivalAirport.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", departureTime=" + departureTime.format(dataTimeFormat) +
                ", arrivalTime=" + arrivalTime.format(dataTimeFormat) +
                ", departureAirport='" + departureAirport + '\'' +
                ", arrivalAirport='" + arrivalAirport + '\'' +
                '}' + "\n";
    }
}