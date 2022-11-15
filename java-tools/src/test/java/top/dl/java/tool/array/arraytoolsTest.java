package top.dl.java.tool.array;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.Assert.*;

public class arraytoolsTest {

    @Test
    public void getmax() {
        int [] array =new int[]{1,2,3,4,5,6,7,8,9,10};
        assertEquals(10,arraytools.getmax(array));
    }

    @Test
    public void testsort(){
        int [] array =new int[]{5,3,4,8,10};
        int[] result =arraytools.sort(array);
        System.out.println(Arrays.toString(result));
    }
}


