package com.company;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class InputUtils {

    private static Scanner scanner = new Scanner(System.in);
    public static final String DATE_FORMAT = "dd/MM/yyyy";
    public static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern(DATE_FORMAT);
    public static final String TIME_FORMAT = "HH:mm";
    public static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern(TIME_FORMAT);

    public static ZoneId askZone(String message) {
        System.out.print(message + " (Region/City): ");
        var strZone = scanner.next();
        return ZoneId.of(strZone);
    }

    public static LocalDate askDate(String message) {
        System.out.print(message + " (" + DATE_FORMAT + "): ");
        var strDate = scanner.next();
        return  LocalDate.parse(strDate, DATE_FORMATTER);
    }

    public static LocalTime askTime(String message) {
        System.out.print(message + " (" + TIME_FORMAT + "): ");
        var strTime = scanner.next();
        return  LocalTime.parse(strTime, TIME_FORMATTER);
    }

}
