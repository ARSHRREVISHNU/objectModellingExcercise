package GSTExample;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Shop {

    //private String item;
    //private int rate;
    private List<String> items;
    private List<Item> itemsList;
    private List<String> itemListBelow;
    private List<Integer> rateList;
    private List<Integer> rateListBelow;
    private HashMap<Item, Item> itemsDetails;
    private String it;
    private int rateValue;


    public Shop(){
        items = new ArrayList<>();
        rateList = new ArrayList<>();
        itemListBelow = new ArrayList<>();
        rateListBelow = new ArrayList<>();

    }
    public void levisPant(){
        LevisPants pant = new LevisPants();
        it = pant.itemName;
        rateValue = pant.rate;

    }
    public void wranglerPant(){
        WranglerPants wrangler = new WranglerPants();
        it = wrangler.itemName;
        rateValue = wrangler.rate;
    }
    public void leePant(){
        LeePant lee = new LeePant();
        it = lee.itemName;
        rateValue = lee.rate;

    }

    public void vanHeusenShirt(){
        VanHeusenShirt vanHeusen = new VanHeusenShirt();
        it = vanHeusen.itemName;
        rateValue = vanHeusen.rate;
    }

    public void peterEnglandShirt(){
        PeterEnglandShirt peterEngland = new PeterEnglandShirt();
        it = peterEngland.itemName;
        rateValue = peterEngland.rate;
    }

    public void johnPlayersShirt(){
        JohnPlayersShirt johnPlayers = new JohnPlayersShirt();
        it = johnPlayers.itemName;
        rateValue = johnPlayers.rate;
    }
    public void satyaPaulSaree(){
        SatyaPaulSaree satyaPaul = new SatyaPaulSaree();
        it = satyaPaul.itemName;
        rateValue = satyaPaul.rate;

}

    public void nalliSarees(){
        NalliSarees nalli = new NalliSarees();
        it = nalli.itemName;
        rateValue = nalli.rate;
}


    public void addItems(){


        if(rateValue<2000){
            itemListBelow.add(it);
           rateListBelow.add(rateValue);
        }
        else if(rateValue>2000){
            items.add(it);
            rateList.add(rateValue);
        }



    }

    public int returnTotalvalue(){
        int totalRate = rateList.stream().mapToInt(Integer::valueOf).sum();
        return totalRate;
    }
    public String returnGSTItems(){

        String delim = ", ";
        String totalItems = String.join(delim, items);
        System.out.println(items);
        return totalItems;

    }

}



