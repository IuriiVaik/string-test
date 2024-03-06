package telran.string.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class StringTest {

    @Test
    @DisplayName("test of the method concat")
    void concatTest() {
        String hello = "Hello";

        assertEquals("Hello world!!!", hello.concat(" world").concat("!!!"));
    }

    @Test
    void containsTest() {
        String hello = "Hello";
        assertTrue(hello.contains("ell"));
        assertFalse(hello.contains("elo"));
    }
    @Test
    public void testCompareTo() {
        String str1 = "abc";
        String str2 = "def";
        assertTrue(str1.compareTo(str2) < 0);
    }

    @Test
    public void testCompareToIgnoreCase() {
        String str1 = "ABC";
        String str2 = "abc";
        assertEquals(0, str1.compareToIgnoreCase(str2));
    }

    @Test
    public void testConcat() {
        String str1 = "Hello";
        String str2 = " World";
        assertEquals("Hello World", str1.concat(str2));
    }

    @Test
    public void testStartWith() {
        String str = "Hello World";
        assertTrue(str.startsWith("Hello"));
    }

    @Test
    public void testEndWith() {
        String str = "Hello World";
        assertTrue(str.endsWith("World"));
    }

    @Test
    public void testEqualsIgnoreCase() {
        String str1 = "hello";
        String str2 = "HELLO";
        assertTrue(str1.equalsIgnoreCase(str2));
    }

    @Test
    public void testIndexOf() {
        String str = "Hello World";
        assertEquals(6, str.indexOf("World"));
    }

    @Test
    public void testLastIndexOf() {
        String str = "Hello World";
        assertEquals(6, str.lastIndexOf('W'));
    }
}