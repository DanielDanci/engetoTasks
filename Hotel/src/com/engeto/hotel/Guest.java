package com.engeto.hotel;

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

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = parseDate(birthDate);
    }

    public String getBirthDate() {
        return birthDate.format(FORMATTER);
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
