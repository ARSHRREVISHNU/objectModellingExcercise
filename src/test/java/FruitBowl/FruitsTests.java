package FruitBowl;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FruitsTests {

    @Test
    public void shouldSegregateApples(){
        // Arrange
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Banana banana1 = new Banana();
        Banana banana2 = new Banana();
        Banana banana3 = new Banana();

        Bowl mixedFruitBowl = new Bowl();
        mixedFruitBowl.addFruit(apple1);
        mixedFruitBowl.addFruit(apple2);
        mixedFruitBowl.addFruit(apple3);
        mixedFruitBowl.addFruit(orange1);
        mixedFruitBowl.addFruit(orange2);
        mixedFruitBowl.addFruit(orange3);
        mixedFruitBowl.addFruit(banana1);
        mixedFruitBowl.addFruit(banana2);
        mixedFruitBowl.addFruit(banana3);

        //Act
        Bowl applesBowl = mixedFruitBowl.returnAppleBowl();

        //Assert
        Assert.assertEquals(applesBowl.getCount(), 3);
    }

}
