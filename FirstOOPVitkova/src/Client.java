public static class Client {// клас публічний, щоб до нього був всебічний доступ
    private String name;//змінна приватна, щоб зміни були застосовувані тільки тими, хто має доступ до цього класу
    //ім'я клієнта
    private int id;//змінна приватна, щоб зміни були застосовувані тільки тими, хто має доступ до цього класу
    //унікальний код клієнта
    private long phone;//змінна приватна, щоб зміни були застосовувані тільки тими, хто має доступ до цього класу
    //телефон
    private long numberCard;//змінна приватна, щоб зміни були застосовувані тільки тими, хто має доступ до цього класу
    // платіжна картка

    private Client(String name, int id, long phone, long numberCard) { //приватний конструктор,
        // щоб мати змогу контролювати процес створення об'єктів
        //конструктор класу Клієнт
        this.name = name;
        this.id = id;
        this.phone = phone;
        this.numberCard = numberCard;
    }
}

public static long getContact(long phone) {//доступ до телефона відкритий для інших
    //отримує контактну інформацію, телефон
    return phone;
}

public static void main(String[] args) {
    Client client = new Client("Володимир Линчук", 123, 380_15_144_51_15L, 4157_1515_5555_0125L);
    Client client1 = new Client("Іванна Мудрик", 124, 380_16_044_51_15L, 4158_1515_5555_0125L);
    System.out.println(getContact(1));
    System.out.println(getContact(client.phone));
}
