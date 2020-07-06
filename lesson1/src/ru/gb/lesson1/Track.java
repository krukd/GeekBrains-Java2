package ru.gb.lesson1;

public class Track extends Barrier {
    private double length;

    public Track(double length) {
        super();
        this.length = length;
    }

    @Override
    protected boolean moving(Human human) {
        if (human.getRunDistance() >= length) {
            System.out.println(human.getName() + " successfully ran distance");
        } else {
            System.out.println(human.getName() + " could not run the distance");
        }
        return false;
    }

    @Override
    protected boolean moving(Robot robot) {
        if (robot.getRunDistance() >= length) {
            System.out.println(robot.getName() + " successfully ran distance");
        } else {
            System.out.println(robot.getName() + " could not run the distance");
        }
        return false;
    }

    @Override
    protected boolean moving(Cat cat) {
        if (cat.getRunDistance() >= length) {
            System.out.println(cat.getName() + " successfully ran distance");
        } else {
            System.out.println(cat.getName() + " could not run the distance");
        }
        return false;
    }

}


