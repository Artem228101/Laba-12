package com.company;
enum Season {
    SPRING(+10),AUTUMN(+15), SUMMER(+30) {
        public String getDescription() {
            return "Теплое время года";
        }
    },
    WINTER(-30);
    private double avgTmp;
    Season(double avgTmp) {
        this.avgTmp = avgTmp;
    }
    public double getAvgTmp() {
        return avgTmp;
    }
    public String getDescription() {
        return "Холодное время года";
    }
}
public class Main {
    public static void main(String[] args) {
        Season season = Season.SUMMER;
        System.out.println(season);
        print(Season.SUMMER);
        printAllValues();
    }
    public static void print(Season season) {
        switch (season) {
            case SPRING:
                System.out.print("Я люблю Весну!");
                break;
            case SUMMER:
                System.out.print("Я люблю Лето!");
                break;
            case AUTUMN:
                System.out.print("Я люблю Осень!");
                break;
            case WINTER:
                System.out.print("Я люблю Зиму!");
                break;
        }
    }
    public static void printAllValues(){
        for (Season a : Season.values()){
            System.out.println(a + "  " + a.getAvgTmp() + "  " + a.getDescription());
        }
    }
}