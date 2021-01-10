package com.company;

import java.time.Duration;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        var datetimeFormatter = DateTimeFormatter.ofPattern("dd MMMM uuuu HH:mm VV");

        var departureZone = InputUtils.askZone("Enter timezone of departure");
        var departureDate = InputUtils.askDate("Enter date of departure");
        var departureTime = InputUtils.askTime("Enter time of departure");

        var departureZoneDateTime = ZonedDateTime.of(departureDate, departureTime, departureZone);
    //    System.out.println("Departure date/time/zone: " + datetimeFormatter.format(departureZoneDateTime));

        var destinationZone = InputUtils.askZone("Enter timezone of destination");
        var destinationDate = InputUtils.askDate("Enter date of destination");
        var destinationTime = InputUtils.askTime("Enter time of destination");

        var destinationZoneDateTime = ZonedDateTime.of(destinationDate, destinationTime, destinationZone);
    //    System.out.println("Destination date/time/zone: " + datetimeFormatter.format(destinationZoneDateTime));

        Duration duration = Duration.between(departureZoneDateTime, destinationZoneDateTime);
        System.out.println("Duration of your flight: " + duration.toHours() + " hours");

    }
}
