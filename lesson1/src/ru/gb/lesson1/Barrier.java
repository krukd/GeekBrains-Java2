package ru.gb.lesson1;

public abstract class Barrier {


    protected abstract boolean moving(Human human);

    protected abstract boolean moving(Robot robot);

    protected abstract boolean moving(Cat cat);

}
