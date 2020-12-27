package com.company.oop;

public class Date {
    private final int[] amountDay = {1, 31};
    private final int[] amountMonth = {1, 12};
    private final int[] amountYear = {1900, 9999};


    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day >= amountDay[0] && day <= amountDay[1])
            this.day = day;
        else throw new NumberFormatException("Error");

    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month >= amountMonth[0] && month <= amountMonth[1])
            this.month = month;
        else throw new NumberFormatException("Error");

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= amountYear[0] && year <= amountYear[1])
            this.year = year;
        else throw new NumberFormatException("Error");
    }

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
