import Module13.Module13.OperationsWithToys;
import Module13.Module13.Toy;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

/**
 * Created by Tetiana_Horbachova on 12/25/2015.
 */
public class SortToysTest {

    @Test(groups = "unit1")
    public void SortToys(){

        ArrayList<Toy> toys = new ArrayList<Toy>();
        ArrayList<Toy> result = new ArrayList<Toy>();
        ArrayList<Toy> expectdResult = new ArrayList<Toy>();

        expectdResult.add(new Toy ("Ball", "Small", 250, "white", 5, "gum elastic"));
        expectdResult.add(new Toy ("Cube", "Big", 150, "green", 4, "plastic"));
        expectdResult.add(new Toy ("Doll", "Medium", 350, "white", 7, "gum elastic"));

        toys.add(new Toy ("Cube", "Big", 150, "green", 4, "plastic"));
        toys.add(new Toy ("Doll", "Medium", 350, "white", 7, "gum elastic"));
        toys.add(new Toy ("Ball", "Small", 250, "white", 5, "gum elastic"));

        result = OperationsWithToys.sortToysByName(toys);
        Assert.assertTrue(expectdResult.get(0).getName().equals(result.get(0).getName()));
        Assert.assertTrue(expectdResult.get(1).getName().equals(result.get(1).getName()));
        Assert.assertTrue(expectdResult.get(2).getName().equals(result.get(2).getName()));
    }

    @Test(groups =  "unit1")
    public void ToysSortByColorTest(){
        ArrayList<Toy> toys = new ArrayList<Toy>();
        ArrayList<Toy> result = new ArrayList<Toy>();
        ArrayList<Toy> expectdResult = new ArrayList<Toy>();

        expectdResult.add(new Toy ("Cube", "Big", 150, "black", 4, "plastic"));
        expectdResult.add(new Toy ("Ball", "Small", 250, "green", 5, "gum elastic"));
        expectdResult.add(new Toy ("Doll", "Medium", 350, "white", 7, "gum elastic"));

        toys.add(new Toy ("Doll", "Medium", 350, "white", 7, "gum elastic"));
        toys.add(new Toy ("Cube", "Big", 150, "black", 4, "plastic"));
        toys.add(new Toy ("Ball", "Small", 250, "green", 5, "gum elastic"));

        result = OperationsWithToys.sortToysByColor(toys);

        Assert.assertTrue(expectdResult.get(0).getColor().equals(result.get(0).getColor()));
        Assert.assertTrue(expectdResult.get(1).getColor().equals(result.get(1).getColor()));
        Assert.assertTrue(expectdResult.get(2).getColor().equals(result.get(2).getColor()));
    }

    @Test(groups = "unit1")
    public void ToysSortEmptyListTest(){

        ArrayList<Toy> toys = new ArrayList<Toy>();
        ArrayList<Toy> result = new ArrayList<Toy>();

        result = OperationsWithToys.sortToysByName(toys);
        Assert.assertTrue(result.isEmpty());
    }

    @Test(enabled = false, groups = "unit3")
    public void testsetProperty() {
        System.out.println("This test will be ignored");
    }
}
