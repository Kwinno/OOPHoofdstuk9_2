package domein;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author lvu621
 */
public class VerplaatsingTest
{
    private Verplaatsing v1, v2;

    @Before
    public void before()
    {
        v1 = new Verplaatsing("Gent", "Antwerpen", 60.5);
        v2 = new Verplaatsing("Antwerpen", "Brussel", 44.7);
    }

    @Test
    public void controleerVanNaContructor()
    {   
        Assert.assertEquals("Gent", v1.getVan());
    }
    
    @Test
    public void controleerNaarNaContructor()
    {   
        Assert.assertEquals("Antwerpen", v1.getNaar());
    }
    
    @Test
    public void controleerAantalKmNaContructor()
    {   
        Assert.assertEquals(60.5, v1.getAantalKm());
    }
    
    @Test
    public void controleerSetterVanJuisteWaarde()
    {
        v2.setVan("Brugge");
        Assert.assertEquals("Brugge", v2.getVan());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void controleerSetterVanFouteWaarde(){
        v2.setVan(null);
    }
    
    @Test
    public void controleerSetterNaarJuisteWaarde()
    {
        v2.setNaar("Kortrijk");
        Assert.assertEquals("Kortrijk", v2.getNaar());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void controleerSetterNaarFouteWaarde(){
        v2.setNaar("");
    }
    
    @Test
    public void controleerSetterAantalKmJuisteWaarde()
    {
        v2.setAantalKm(56);
        Assert.assertEquals(56.0, v2.getAantalKm());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void controleerSetterAantalKmFouteWaarde(){
        v2.setAantalKm(-56);
    }   
    
    @Test
    public void omzettenNaarString()
    {
        Assert.assertEquals("verplaatsing van Gent naar Antwerpen", v1.toString());
    } 
}