import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class ReorderTest {

    @Test
    public void testOrders_Empty() {
        List actual = Reorder.orders(new ArrayList<Integer>());
        List<List<Integer>> expect = new ArrayList<List<Integer>>();
        expect.add(new ArrayList<Integer>());
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

    @Test
    public void testOrders_123() {
        List actual = Reorder.orders(Arrays.asList(1,2,3));
        List<List> expect = Arrays.asList(
          Arrays.asList(1,2,3),Arrays.asList(2,1,3),Arrays.asList(2,3,1),
          Arrays.asList(1,3,2),Arrays.asList(3,1,2),Arrays.asList(3,2,1));
        assertEquals(expect, actual);        
    }

    @Test
    public void testOrders_212() {
        List actual = Reorder.orders(Arrays.asList(2,1,2));
        List<List> expect = Arrays.asList(Arrays.asList(2,1,2),
          Arrays.asList(1,2,2),Arrays.asList(2,2,1));
        assertEquals(expect, actual);        
    }

    @Test
    Public void testOrders_big() {
        List actual = Reorder.orders(Arrays.asList(1,2,3,4,5,6,7,8,9));
        assertEquals(362880, actual.size());
    }





}