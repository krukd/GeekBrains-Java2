package ru.gb.lesson1;

public class Wall extends Barrier {
    private double height;

    public Wall(double height) {
        super();
        this.height = height;
    }

    @Override
    protected boolean moving(Human human) {
        if (human.getJumpHeight() >= height) {
            System.out.println(human.getName() + " successfully jumped over the wall");
        } else {
            System.out.println(human.getName() + " could not jump over the wall");
        }
        return false;
    }

    @Override
    protected boolean moving(Robot robot) {
        if (robot.getJumpHeight() >= height) {
            System.out.println(robot.getName() + " successfully jumped over the wall");
        } else {
            System.out.println(robot.getName() + " could not jump over the wall");
        }
        return false;
    }

    @Override
    protected boolean moving(Cat cat) {
        if (cat.getJumpHeight() >= height) {
            System.out.println(cat.getName() + " successfully jumped over the wall");
        } else {
            System.out.println(cat.getName() + " could not jump over the wall");
        }
        return false;
    }
}

