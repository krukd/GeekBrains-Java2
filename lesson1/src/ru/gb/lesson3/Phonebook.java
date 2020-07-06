package ru.gb.lesson3;

import java.util.HashMap;
import java.util.HashSet;

public class Phonebook {
    HashMap<String, HashSet<String>> hashMap;

    public Phonebook() {
        this.hashMap = new HashMap<>();
    }

    public void add(String lastName, String phone) {
        HashSet<String> book = hashMap.getOrDefault(lastName, new HashSet<>());
        book.add(phone);
        hashMap.put(lastName, book);
    }

    public void get(String lastName) {
        System.out.println("Contact " + lastName + " / Phone number " + hashMap.getOrDefault(lastName, new HashSet<>()));
    }
}
