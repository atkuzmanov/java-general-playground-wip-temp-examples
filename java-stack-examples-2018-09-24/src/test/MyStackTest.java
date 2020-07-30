package test;

/*
  Reference: http://www.vogella.com/tutorials/JavaDatastructures/article.html
 */

import static org.junit.Assert.assertTrue;

import com.example.MyStackArray;
import com.example.MyStackList;
import org.junit.Before;
import org.junit.Test;

public class MyStackTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testStackArray() {
        MyStackArray<Integer> stackArray = new MyStackArray<Integer>();
        stackArray.push(1);
        stackArray.push(2);
        stackArray.push(3);
        stackArray.push(3);
        stackArray.push(4);
        assertTrue(4 == stackArray.pop());
        assertTrue(3 == stackArray.pop());
        assertTrue(3 == stackArray.pop());
        assertTrue(2 == stackArray.pop());
        assertTrue(1 == stackArray.pop());
    }

    @Test
    public void testStackList() {
        MyStackList<Integer> stackList = new MyStackList<Integer>();
        stackList.push(1);
        stackList.push(2);
        stackList.push(3);
        stackList.push(3);
        stackList.push(4);
        assertTrue(4 == stackList.pop());
        assertTrue(3 == stackList.pop());
        assertTrue(3 == stackList.pop());
        assertTrue(2 == stackList.pop());
        assertTrue(1 == stackList.pop());
    }
}
