package CarExample;

import org.testng.annotations.Test;

public class CarTests {

@Test
public void carStartTest()
{
    new Car().start();
}

@Test
public void carStopTest(){
    new Car().stop();
    
}
}
