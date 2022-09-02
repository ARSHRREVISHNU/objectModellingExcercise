package GSTExample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GSTTest {

// Arrange
    Shop items = new Shop();

    @Test
    public void gstRateTotal(){

        //Act
        items.levisPant();
        items.addItems();
        items.johnPlayersShirt();//--gst eligible as its more than 2000
        items.addItems();
        items.satyaPaulSaree();
        items.addItems();
        items.levisPant();
        items.addItems();
        items.peterEnglandShirt();//--gst eligible as its more than 2000
        items.addItems();
        items.vanHeusenShirt();
        items.addItems();
        items.wranglerPant();//--gst eligible as its more than 2000
        items.addItems();
        items.nalliSarees();//--gst eligible as its more than 2000
        items.addItems();
        items.leePant();
        items.addItems();
        items.nalliSarees();//--gst eligible as its more than 2000
        items.addItems();
        items.leePant();
        items.addItems();

        int sumValue = items.returnTotalvalue();
        String itemNames = items.returnGSTItems();
        //Printing list of GST eligible items
        System.out.println(itemNames);

        //Printing the total Value of the gst items
        System.out.println(sumValue);
        //Assert
        Assert.assertEquals(sumValue, 19100);

    }


}
