package com.day10;

public class History extends Student {
   int historyMarks;
    int civicsMarks;

    @Override
    float getPercentage() {
        int total=historyMarks+civicsMarks;
        return ((total*100)/100);
    }

    public History(String name, String address, int historyMarks, int civicsMarks) {
        super(name, address);
        this.historyMarks = historyMarks;
        this.civicsMarks = civicsMarks;
    }

    @Override
    public String toString() {
        return "History{" +
                "historyMarks=" + historyMarks +
                ", civicsMarks=" + civicsMarks +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +"percentage"+getPercentage()+
                '}';
    }
}
