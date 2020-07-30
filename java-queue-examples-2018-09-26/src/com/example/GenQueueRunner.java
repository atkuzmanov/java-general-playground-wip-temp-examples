package com.example;

/*
reference: https://www.tutorialspoint.com/javaexamples/data_queue.htm
 */

import sun.awt.image.ImageWatched;

import java.util.LinkedList;

class GenQueue<E> {
    private LinkedList<E> list = new LinkedList<E>();

    public void enqueue(E item) {
        list.addLast(item);
    }

    public E dequeue() {
        return list.poll();
    }

    public boolean hasItems() {
        return !list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public void addItems(GenQueue<? extends E> q) {
        while (q.hasItems()) {
            list.addLast(q.dequeue());
        }
    }
}

public class GenQueueRunner {
    public static void main(String[] args) {
        GenQueue<Employee> emplList = new GenQueue<Employee>();

        GenQueue<HourlyEmployee> hList = new GenQueue<HourlyEmployee>();
        hList.enqueue(new HourlyEmployee("T", "D", 1));
        hList.enqueue(new HourlyEmployee("G", "B", 2));
        hList.enqueue(new HourlyEmployee("F", "S", 3));

        emplList.addItems(hList);

        System.out.println("The employees names are: ");

        while (emplList.hasItems()) {
            Employee empl = emplList.dequeue();
//            System.out.println(empl.firstName + " " + empl.lastName);
            System.out.println(empl.toString());
        }
    }
}

class Employee {
    public String lastName;
    public String firstName;

    public Employee(String last, String first) {
        this.lastName = last;
        this.firstName = first;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}

class HourlyEmployee extends Employee {
    public double hourlyRate;

    public HourlyEmployee(String last, String first) {
        super(last, first);
    }

    public HourlyEmployee(String last, String first, double hRate) {
        super(last, first);
        this.hourlyRate = hRate;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " - hourly rate: $" + hourlyRate;
    }
}






