import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class ReorderTest {

    @Test
    public void testOrders_Empty() {
        List actual = Reorder.orders(new ArrayList<Integer>());
        List<List> expect = new ArrayList<List>();
        expect.add(new ArrayList());
        assertEquals(expect, actual);
    }

    @Test
    public void testOrders_1() {
        List actual = Reorder.orders(Arrays.asList(1));
        assertEquals(Arrays.asList(Arrays.asList(1)), actual);
    }

    @Test
    public void testOrders_12() {
        List actual = Reorder.orders(Arrays.asList(1,2));
        List<List> expect = Arrays.asList(Arrays.asList(1,2),
            Arrays.asList(2,1));
        assertEquals(expect, actual);
    }
    
    @Test
    public void testOrders_22() {
        List actual = Reorder.orders(Arrays.asList(2,2));
        List<List> expect = Arrays.asList(Arrays.asList(2,2));
        assertEquals(expect, actual);        
    }

    @Test
    public void testOrders_122() {
        List actual = Reorder.orders(Arrays.asList(1,2,2));
        List<List> expect = Arrays.asList(Arrays.asList(1,2,2),
          Arrays.asList(2,1,2),Arrays.asList(2,2,1));
        assertEquals(expect, actual);        
    }







}