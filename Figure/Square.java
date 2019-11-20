package com.company;

public class Square extends Figure implements Resetable {
    Square(int numberOfSides) {
        super(numberOfSides);

        System.out.println("Klasa kwadrat");
    }

    public void resetAllAttributes() {
        System.out.println("Czyscimy wszystko !");
        super.Reset();
    }
}