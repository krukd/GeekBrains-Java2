package ru.gb.lesson1;

public class Robot implements Actions {

    private String name;
    private double runDistance;
    private double jumpHeight;

    public Robot(String name, int runDistance, int jumpHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void jump() {
        System.out.println(name + " jump");
    }

    @Override
    public void run() {
        System.out.println(name + " run");
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
}
