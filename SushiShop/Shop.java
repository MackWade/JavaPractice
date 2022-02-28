package SushiShop;
import java.util.*;

public class Shop {
    private Sushi[]  sushiDisplay ;
    private  Set<Integer> inputOrder;
    //int maxItems;
    public Shop(int maxItems){
        sushiDisplay = new Sushi[maxItems];
        inputOrder = new HashSet<>();
    }

    //this function generates a display
    public void displayGenerator(){
        //Random rand = new Random();
        for(int i=0; i< sushiDisplay.length; i++){
            sushiDisplay[i] = new Sushi( i+1);
        }
    }

    public Sushi[] getSushiDisplay() {
        return sushiDisplay;
    }

    public void  takeOrder(){

        try {
            Scanner scan = new Scanner(System.in);

            System.out.println("The cashier takes your order");
            String[] orders = scan.nextLine().split(" ");
            for (int i = 0; i < orders.length; i++) {

                inputOrder.add(Integer.parseInt((orders[i])));

            }
        }catch (NumberFormatException e){

            System.out.println("invalid input");

        }
    }

    public void bagOrder(Order newOrder){
        Iterator<Integer> it = inputOrder.iterator();

        while (it.hasNext()) {
             newOrder.addToBag(sushiDisplay[it.next()-1]);


        }
        System.out.println("That will be $" + newOrder.getCost());

    }



    public Set<Integer> getInputOrder(){
        return inputOrder;
    }

    public static void main(String[] args) {

        Shop shop= new Shop(25);

        System.out.println("Welcome to Shinji's Sushi Shop!");

        //display is created
        shop.displayGenerator();
        System.out.println(Arrays.toString(shop.getSushiDisplay()));

        //get the order
        System.out.println("The cashier prepares your order.");
        shop.takeOrder();

        //get the cost
        Order newOrder = new Order();
        shop.bagOrder(newOrder);


        //eat your meal
        System.out.println("Back at your apartment, you take out your sushi and eat it");
        int first_bag= newOrder.getBagSize();
        for(int i= 0; i < first_bag ; i++){
            newOrder.eatSushi();
        }





//        Sushi yumYumRoll = new Sushi(8);
//        System.out.println(yumYumRoll);
    }
}
