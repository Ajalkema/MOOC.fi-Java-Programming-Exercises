
import java.lang.Math;

public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares){
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared) {
        int thisPrice = this.squares * this.pricePerSquare;
        int comparedPrice = compared.squares * compared.pricePerSquare;

        return Math.abs(thisPrice - comparedPrice);
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int thisPrice = this.squares * this.pricePerSquare;
        int comparedPrice = compared.squares * compared.pricePerSquare;

        if (thisPrice > comparedPrice) {
            return true;
        }
        return false;
    }
}
