import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicShopTest {

    MusicShop shop;
    Guitar fender;

    @Before
    public void before(){
        fender = new Guitar("Fender", 500.00, 0, "Oak", "brown");
        shop = new MusicShop();
    }

    @Test
    public void checkStockLevel(){
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void checkCanAddInstrument(){
        shop.addInstrumentToStock(this.fender);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void checkCanRemoveInstrumentFromStock(){
        shop.addInstrumentToStock(this.fender);
        shop.removeInstrumentFromStock("Fender");
        assertEquals(0, shop.stockCount());
    }
}
