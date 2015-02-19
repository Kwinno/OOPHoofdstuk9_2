package domein;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author lvu621
 */
public class VerplaatsingPerAutoTest
{ 
    private VerplaatsingPerAuto vpa1, vpa2;

    @Before
    public void before()
    {
        vpa1 = new VerplaatsingPerAuto("Gent", "Oudenaarde", 29.4, 1.591, 0.0538);
        vpa2 = new VerplaatsingPerAuto("Gent", "Eeklo", 23.8, 1.314, 0.0477);
    }

    @Test
    public void controleerBenzineprijsNaContructor()
    {   
        Assert.assertEquals(1.591, vpa1.getBenzineprijs());
    }
    
    @Test
    public void controleerVerbruikNaContructor()
    {   
        Assert.assertEquals(0.0538, vpa1.getVerbruik());
    }
    
    @Test
    public void controleerSetterVerbruik()
    {
        vpa2.setVerbruik(0.056);
        Assert.assertEquals(0.056, vpa2.getVerbruik());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void controleerSetterFoutVerbruik()
    {
        vpa2.setVerbruik(0.09);
    }
    
    @Test
    public void controleerSetterBenzinePrijs()
    {
        vpa2.setBenzineprijs(1.03);
        Assert.assertEquals(1.03, vpa2.getBenzineprijs());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void controleerSetterFouteBenzineprijs()
    {
        vpa2.setBenzineprijs(2.1);
    }
      
    @Test
    public void controleerBerekenPrijs()
    {
         Assert.assertEquals(5.033, vpa1.berekenPrijs(), 0.001);
    }    
    
    @Test
    public void omzettenNaarString()
    {
        Assert.assertEquals("verplaatsing van Gent naar Oudenaarde per auto", vpa1.toString());
    }
}