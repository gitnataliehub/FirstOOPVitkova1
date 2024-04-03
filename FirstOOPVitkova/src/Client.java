public static class Client {
    private String name;
    private int id;
    private long phone;
    private long numberCard;

    public Client(String name, int id, long phone, long numberCard) { //конструктор класу Клієнт
        this.name = name;
        this.id = id;
        this.phone = phone;
        this.numberCard = numberCard;
    }
}

public static long getContact(long phone) {
    return phone;
}

public static void main(String[] args) {
    Client client = new Client("Володимир Линчук", 123, 380_15_144_51_15L, 4157_1515_5555_0125L);
    Client client1 = new Client("Іванна Мудрик", 124, 380_16_044_51_15L, 4158_1515_5555_0125L);
    System.out.println(getContact(1));
    System.out.println(getContact(client.phone));
}
