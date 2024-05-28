package Classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Guest {
    private String name;
    private String surname;
    private LocalDate birthDate;

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public Guest(String name, String surname, String birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = parseDate(birthDate);
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    private LocalDate parseDate(String date) {
        return LocalDate.parse(date, FORMATTER);
    }

    @Override
    public String toString() {
        String formattedBirthDate = birthDate.format(FORMATTER);
        return "Name: " + name
                + "\nSurname: " + surname
                + "\nBirth date: " + formattedBirthDate
                + "\n";
    }
}
