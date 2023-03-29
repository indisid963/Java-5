package ru.netology.services;

public class RestMonthService {
    int calcRestMonth(int income, int expenses, int threshold) {
        int rest = 0;
        int money = 0;
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                money -= expenses;
                money /= 3;
                rest++;
            } else {
                money += income - expenses;
            }
        }
        return rest;
    }
}