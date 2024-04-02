public class Goods {
    private String name;// назва товару
    private short count;// кількість товару
    private double price;// ціна товару
}

public static double getSum(int count, double price) { // функція підрахунку суми
        return count*price;   // повертає результат обчислення
}
public static void main(String[] args) {
    System.out.println(getSum(5,20.5)); // виводить результат функції з введенними значеннями
    }


