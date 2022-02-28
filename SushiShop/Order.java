package SushiShop;


import java.util.Collections;
import java.util.Stack;

public class Order {
    private Stack<Sushi> bag;
    private int cost;

    public Order(){
        this.bag= new Stack<>();
        this.cost=0;
    }

    public int getCost() {
        return cost;
    }

    public int getBagSize(){
        return bag.size();
    }


    public void  addToBag(Sushi sushi){
        //add to bag
        bag.add(sushi);
        int i =0;
        //add to cost
        cost+=bag.get(bag.size()-1).getPrice();
        Collections.sort(bag);

            //System.out.println(bag.get(i).getPrice())

    }

    public void eatSushi(){

        Sushi eat_sushi = bag.remove(0);
        System.out.println("Eating Sushi" + eat_sushi + "...yum");
    }
}
