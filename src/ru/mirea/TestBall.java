package ru.mirea;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(135, 246);
        System.out.println(b1);
        b1.move(79, 80);
        System.out.println(b1);
    }
}
