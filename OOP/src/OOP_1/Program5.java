package OOP_1;

public class Program5 {
    public static void main(String[] args) {
        PizzaOrder p = new PizzaOrder("Баварская", PizzaOrder.Size.BIG, true, "Новгородская 2А");
        p.order();
        p.order();
        PizzaOrder p2 = new PizzaOrder("Жар-птица", PizzaOrder.Size.MEDIUM, false, "Проспект победы д. 37");
        p2.order();
        p2.toString(p2);
        p.cancel();
    }
}

class PizzaOrder {
    String title;
    enum Size {
        SMALL, MEDIUM, BIG
    }
    Size pizzaSize;
    boolean sauce;
    String address;
    boolean ifOrderAccepted;
    PizzaOrder(String title, Size pizzaSize, boolean sauce, String address) {
        this.title = title;
        this.pizzaSize = pizzaSize;
        this.sauce = sauce;
        this.address = address;
    }
    private boolean alternateOutput = false;
    void order() {
        if (alternateOutput) {
            System.out.println("Заказ уже принят");
        } else {
            String s = "-";
            switch (pizzaSize) {
                case SMALL -> s = "Маленькая";
                case MEDIUM -> s = "Средняя";
                case BIG -> s = "Большая";
            }
            String c;
            if (sauce) {
                c = " с соусом";
            } else {
                c = " без соуса";
            }
            System.out.println("Заказ принят. " + s + " пицца " + '"' + title + '"' + c + " на адрес " + address);
            alternateOutput = true;
        }
    }
    void cancel() {
        System.out.println("Заказ отменён");
    }
    void setTitle(String t) {
        title = t;
    }
    void setPizzaSize(Size s) {
        pizzaSize = s;
    }
    void setSauce(boolean s) {
        sauce = s;
    }
    void setAddress(String s) {
        address = s;
    }
    String getTitle() {
        return title;
    }
    Size getPizzaSize() {
        return pizzaSize;
    }
    boolean getSauce() {
        return sauce;
    }
    String getAddress() {
        return address;
    }
    void toString(PizzaOrder p) {
        String s;
        if (sauce) {
            s = "да";
        } else {
            s = "нет";
        }
        System.out.println("Полная информация по этому заказу:");
        System.out.println("Название пиццы: " + title);
        System.out.println("Размер: " + pizzaSize);
        System.out.println("Нужен ли соус: " + s);
        System.out.println("Адресс доставки: " + address);
    }


}