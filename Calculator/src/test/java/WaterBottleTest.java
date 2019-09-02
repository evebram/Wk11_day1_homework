import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WaterBottleTest {

    WaterBottle bottle = new WaterBottle( 100, 10, 100, 0);

    @Test
    public void getVolume(){
        assertEquals(90, bottle.takeDrink());
    }

    @Test
    public void isBottleEmpty(){
        assertEquals( 0, bottle.emptyBottle());
    }

    @Test
    public void isBottleFull(){
        assertEquals(100, bottle.fillBottle());
    }

}
