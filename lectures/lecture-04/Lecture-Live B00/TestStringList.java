import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.*;

public class TestStringList {

  @Test
  public void testAdd() {
    StringList slist = new ArrayStringList();
    slist.add("paul");
    slist.add("greg");

    assertEquals("paul", slist.get(0));
    assertEquals("greg", slist.get(1));
  }

  @Test
  public void testAddThenSize() {
    StringList slist = new ArrayStringList();
    slist.add("banana");
    slist.add("apple");

    assertEquals(2, slist.size());
  }

  @Test
  public void testInsert() {
	  StringList slist = new ArrayStringList();
	  slist.insert(0,  "cse11");
	  assertEquals("cse11", slist.get(0));
	  slist.insert(1,  "CSE12");
	  assertEquals("CSE12", slist.get(1));
	  slist.insert(2, "CSE30");
	  assertEquals("CSE30", slist.get(2));

  }
  
  @Test
  public void testRemove() {

  }

  @Test
  public void testAddMany() {
    StringList slist = new ArrayStringList();
    slist.add("a");
    slist.add("b");
    slist.add("c");
    slist.add("d");
    slist.add("e");

    assertEquals("e", slist.get(4));
    assertEquals("d", slist.get(3));
    assertEquals("c", slist.get(2));
    assertEquals("b", slist.get(1));
    assertEquals("a", slist.get(0));

  }


}

