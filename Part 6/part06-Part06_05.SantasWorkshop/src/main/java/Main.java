
public class Main {

    public static void main(String[] args) {
        Gift tandenborstel = new Gift("Tandenborstel", 1);
        Gift boek = new Gift("Bijbel", 5);

        System.out.println(boek);
        System.out.println(tandenborstel);

        Package pakket = new Package();

        pakket.addGift(tandenborstel);
        pakket.addGift(boek);

        System.out.println(pakket.totalWeight());

    }
}
