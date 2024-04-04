public static class Goods {  // клас публічний, щоб до нього був всебічний доступ
    private String name;//змінна приватна, щоб зміни були застосовувані тільки тими, хто має доступ до цього класу
    // назва товару
    private short count;// змінна приватна, щоб зміни були застосовувані тільки тими, хто має доступ до цього класу
    // кількість товару
    private double price;// змінна приватна, щоб зміни були застосовувані тільки тими, хто має доступ до цього класу
    // ціна товару

    private Goods(String name, short count, double price) { //конструктор приватний,
        // щоб мати змогу контролювати процес створення об'єктів
        //конструктор класу Товари
        this.name = name;
        this.count = count;
        this.price = price;
    }
}

public static double getSum(short count, double price) { //всі можуть дізнатись суму
    // функція підрахунку суми
    return count * price;   // повертає результат обчислення
}

public static void main(String[] args) {
    Goods sofa = new Goods("Диван", (short) 5, 3250.5); //створення об'єкта Диван
    Goods table = new Goods("Стіл", (short) 10, 250); // створення об'єкта Стіл
    System.out.println(getSum((short) 5, 3250.5)); // виводить результат функції з введенними значеннями
}


