import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickSorterTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testQuickSort() {
		int[] sort = { 2, 3, 6, 7 };
		int[] test1 = { 6, 3, 2, 7 };
		QuickSorter.quickSort(test1, 0, 3);
		assertTrue(Arrays.equals(sort, test1));
	}

	@Test
	public void testPartition() {

	}

}
