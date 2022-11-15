package org.ss.enumerations;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class SaisonTest {

    private Saison SaisonUnderTest;

    @Test
    public void TestValueOfLibelleWhenIsNotFound()
    {
        // Arrange : initier les valeurs
        String libelle = "Ptp";

        // Action/Agir : consiste a tester une méthode
        Saison result = Saison.valueOfLibelle(libelle);

        // Assert : vérifie qu'une condition est vraie et signale une erreur dans le cas contraire
        assertNull(result);
    }

    @Test
    public void TestValueOfLibelleWithoutAccent()
    {
        String libelle = "Ete";
        Saison result = Saison.valueOfLibelle(libelle);
        assertNull(result);
    }

    @Test
    public void TestValueOfLibelleEqual()
    {
        String libelle = "Automne";
        Saison result = Saison.valueOfLibelle(libelle);
        assertEquals("Automne",result.getLibelle());
    }
}
