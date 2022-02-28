package SushiShop;


import java.util.Random;

/**
 * Sushi class is where each piece of sushi is identified
 */
public class Sushi implements Comparable<Sushi> {
    public int number;
    public int weight;
    public int price;
    //generates random number object
    Random rand = new Random();

    public Sushi(int number){
        // the number that is associated with the piece of sushi
        this.number = number;
        //generates how much the sushi weighs (20 - 100 grams)
        this.weight = rand.nextInt(80)+20;
        //generated how much the sushi costs ( $10 - $40)
        this.price = rand.nextInt(30) +10;
    }


    public int getNumber() {
        return number;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "{" +
                "number=" + number +
                ", weight=" + weight + " grams" +
                ", $" + price +
                "}";
    }

    @Override
    public int compareTo(Sushi other) {
        return weight - other.weight ;
    }
}
