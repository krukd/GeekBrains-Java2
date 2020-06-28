package ru.gb.lesson1;

import java.util.Objects;

// 1.Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти классы должны уметь бегать и
// прыгать (методы просто выводят информацию о действии в консоль).
//2. Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять соответствующие
// действия (бежать или прыгать), результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
//3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 30, 1);
        Human human = new Human("Vladimir", 50, 1);
        Robot robot = new Robot("Iron Man", 15, 2);
        Barrier[] barriers = new Barrier[2];
        barriers[0] = new Track(25);
        barriers[1] = new Wall(2);
        Actions[] participants = new Actions[3];
        participants[0] = cat;
        participants[1] = human;
        participants[2] = robot;
        for (int i = 0; i < barriers.length; i++) {
            for (int j = 0; j < participants.length; j++) {
                if (participants[j] instanceof Cat) {
                    barriers[i].moving(cat);
                }
                if (participants[j] instanceof Human) {
                    barriers[i].moving(human);
                }
                if (participants[j] instanceof Robot) {
                    barriers[i].moving(robot);
                }
            }
        }
    }

}
