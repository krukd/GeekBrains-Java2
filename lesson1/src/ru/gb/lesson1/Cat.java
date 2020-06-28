package ru.gb.lesson1;

public class Cat implements Actions {
    private String name;
    private double runDistance;
    private double jumpHeight;

    public Cat(String name, int runDistance, int jumpHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    public double getRunDistance() {

        return runDistance;
    }

    public double getJumpHeight() {
        return jumpHeight;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        System.out.println("Run");
    }

    @Override
    public void jump() {

        System.out.println("jump");
    }
}
