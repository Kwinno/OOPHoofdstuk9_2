package domein;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author lvu621
 */
public class VerplaatsingPerBusTramTest
{
    private VerplaatsingPerBusTram vpbt1, vpbt2;

    @Before
    public void before()
    {
        vpbt1 = new VerplaatsingPerBusTram
            ("Voskenslaan Gent", "Veldstraat Gent", 4.2, 1, false, true);
        vpbt2 = new VerplaatsingPerBusTram
            ("Station Dampoort Gent", "Blaarmeersen Gent", 7.7, 49, false, false);
    }

    @Test
    public void controleerLijnnrNaContructor()
    {
        Assert.assertEquals(1, vpbt1.getLijnnr());
    }
    
    @Test
    public void controleerSetterLijnNr()
    {
        vpbt2.setLijnnr(39);
        Assert.assertEquals(39, vpbt2.getLijnnr());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void controleerSetterFoutLijnNr()
    {
        vpbt2.setLijnnr(-2);
    }
    
    @Test
    public void controleerBusNaContructor()
    {
        Assert.assertFalse(vpbt2.isBus());
    }
    
    @Test
    public void controleerSetterBus()
    {
        vpbt2.setBus(true);
        Assert.assertTrue(vpbt2.isBus());
    }
    
        @Test
    public void controleerStadslijnNaContructor()
    {
        Assert.assertFalse(vpbt2.isStadslijn());
    }
    
    @Test
    public void controleerSetterStadslijn()
    {
        vpbt2.setStadslijn(true);
        Assert.assertTrue(vpbt2.isStadslijn());
    }
    
    @Test
    public void controleerBerekenPrijs(){
         Assert.assertEquals(2.56, vpbt1.berekenPrijs(), 0.001);
    }    
    
    @Test
    public void omzettenNaarString()
    {
        Assert.assertEquals("verplaatsing van Voskenslaan Gent naar Veldstraat Gent"
                + " met stadstram 1", vpbt1.toString());
    }
}