import Module13.Module13.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
/**
 * Created by Tetiana_Horbachova on 12/25/2015.
 */

public class CreateRoomTest {
    @Test(groups = "unit2")
    public void printEmptyRoomTest() {

        ArrayList<Room> rooms = new ArrayList<Room>();

        try {
            Room.printRoomToys(rooms);
            Room.printRoomToys(rooms);
        } catch ( EmptyToyException ex) {
            Assert.assertTrue(ex.getDetailsMessage().contains("Room is empty"));
        }
    }

    @Test(groups = "unit2")
    public void CreateRoomsTest() throws EmptyToyException {
        ArrayList<Room> rooms = new ArrayList<Room>();
        ArrayList<Toy> toys = new ArrayList<Toy>();
        ArrayList<Toy> expectedResult = new ArrayList<Toy>();

        expectedResult.add(new Ball("pingpong ball", "Small", 120, "White", 5, "plastic", "sport"));
        expectedResult.add(new Car("mersedes car", "Small", 500, "White", 4, "metal", true, 15));
        expectedResult.add(new Doll("doll sister", "Small", 250, "White", 3, "plastic", "grown up", true));
        expectedResult.add(new Ball("ball", "Big", 150, "Red", 5, "gum elastic", "sport"));
        expectedResult.add(new Cube("cube small", "Small", 25, "Green", 3, "plastic", 5));

        OperationsWithToys.setHardCodedData(toys);
        rooms.add(Room.createRoom(3, 5, 12000, toys));

        int expectedResultNumber = expectedResult.size();
        int actualResult = rooms.get(0).getToysNumber();

        Assert.assertEquals(expectedResultNumber, actualResult);
    }
}
