package FruitBowl;

import java.util.ArrayList;
import java.util.List;

public class Bowl {

    private List<Fruits> fruitsList;

    public Bowl() {
        fruitsList = new ArrayList<>();
    }

    public void addFruit(Fruits fruit){

            fruitsList.add(fruit);


    }

    public Bowl returnAppleBowl(){
        Bowl bowlOfApples = new Bowl();

        for (Fruits fruit: fruitsList) {
             if(fruit instanceof Apple){
                 bowlOfApples.addFruit(fruit);
             }

        }
        return bowlOfApples;
    }

    public Bowl returnOrangeBowl(){
        Bowl bowlOfOranges = new Bowl();
        for(Fruits fruit: fruitsList){
            if (fruit instanceof Orange){
                bowlOfOranges.addFruit(fruit);

            }
        }
        return bowlOfOranges;
    }

    public Bowl returnBananaBowl(){
        Bowl bowlOfBananas = new Bowl();
        for (Fruits fruit: fruitsList) {
             if(fruit instanceof Banana){
                 bowlOfBananas.addFruit(fruit);
             }

        }
        return bowlOfBananas;
    }

    public int getCount(){
        return fruitsList.size();
    }

}



