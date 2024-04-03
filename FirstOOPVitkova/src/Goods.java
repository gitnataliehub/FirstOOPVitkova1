public static class Goods {
    private String name;// назва товару
    private short count;// кількість товару
    private double price;// ціна товару

    public Goods(String name, short count, double price) { //конструктор класу Товари
        this.name = name;
        this.count = count;
        this.price = price;
    }
}

public static double getSum(short count, double price) { // функція підрахунку суми
    return count * price;   // повертає результат обчислення
}

public static void main(String[] args) {
    Goods sofa = new Goods("Диван", (short) 5, 3250.5); //створення об'єкта Диван
    Goods table = new Goods("Стіл", (short) 10, 250); // створення об'єкта Стіл
    System.out.println(getSum((short) 5, 3250.5)); // виводить результат функції з введенними значеннями
}


