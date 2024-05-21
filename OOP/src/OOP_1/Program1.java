package OOP_1;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Phone [] arrPhone = new Phone[3];
        Phone p0 = new Phone();
        arrPhone[0] = p0;
        Phone p1 = new Phone(109020, "huawei", 20);
        arrPhone[1] = p1;
        Phone p2 = new Phone(919123, "samsung");
        arrPhone[2] = p2;
        System.out.println(p0.getNumber());
        System.out.println(p1.getNumber());
        System.out.println(p2.getNumber());

        p1.receiveCall("Tom");
        p2.receiveCall("Sam", 908383);

        p0.toString(p0);
        p0.toString(p1);
        p1.toString(p2);

        p0.sendMessage(arrPhone);

    }
}

class Phone {
    int number;
    String model;
    int weight;
    void receiveCall(String name) {
        System.out.println("Звонит "+ name);
    }
    int getNumber() {
        return number;
    }

    Phone (int n, String m, int w) {
        this.number = n;
        this.model = m;
        this.weight = w;
    }

    Phone (int n, String m) {
        this.number = n;
        this.model = m;
    }

    Phone () {

    }

    void receiveCall(String name, int numberOfCaller) {
        System.out.print("Звонит: "+ name);
        System.out.println(" Номер звонящего: "+ number);
    }

    void sendMessage(Phone [] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i].number);
        }
    }

    void toString(Phone a) {
        System.out.print("Номер: "+ a.number);
        System.out.print(" Модель: "+ a.model);
        System.out.println(" Вес: "+ a.weight);
    }

}