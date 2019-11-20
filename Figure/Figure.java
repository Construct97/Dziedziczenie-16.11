package com.company;

public class Figure  implements NumberOfSidesPrintable {
    private int _liczbaBokow;

    Figure(int numberOfSides){
        _liczbaBokow = numberOfSides;
    }
    public void printSidesNumber() {
        System.out.println("Liczba boków = " + _liczbaBokow);
    }

    public void Reset(){
        _liczbaBokow = 0;
    }
}