package ru.netology.services;

public class RestMonthService {
    int calcRestMonth(int income, int expenses) {
        int rest = 0;
        int threshold = 0;
        for (int month = 0; month < 12; month++) {
            if (threshold < 20_000) {
                threshold = threshold + income - expenses;
            } else {
                rest++;
                threshold = threshold - expenses;
                threshold = threshold / 3;
            }

        }
        return rest;}
}