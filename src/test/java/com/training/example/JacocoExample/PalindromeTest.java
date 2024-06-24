package com.training.example.JacocoExample;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTest {

	@Test
    public void whenEmptyString_thenAccept() {
        Palindrome palindromeTester = new Palindrome();
        assertTrue(palindromeTester.isPalindrome(""));
    }

    @Test
    public void whenSingleCharacter_thenAccept() {
        Palindrome palindromeTester = new Palindrome();
        assertTrue(palindromeTester.isPalindrome("a"));
    }

    @Test
    public void whenPalindromeWithOddLength_thenAccept() {
        Palindrome palindromeTester = new Palindrome();
        assertTrue(palindromeTester.isPalindrome("racecar"));
    }

    @Test
    public void whenPalindromeWithEvenLength_thenAccept() {
        Palindrome palindromeTester = new Palindrome();
        assertTrue(palindromeTester.isPalindrome("abba"));
    }

    @Test
    public void whenNotPalindrome_thenReject() {
        Palindrome palindromeTester = new Palindrome();
        assertFalse(palindromeTester.isPalindrome("hello"));
    }

    @Test
    public void whenPalindromeWithMixedCase_thenReject() {
        Palindrome palindromeTester = new Palindrome();
        assertFalse(palindromeTester.isPalindrome("RaceCar"));
    }

    @Test
    public void whenPalindromeWithSpaces_thenReject() {
        Palindrome palindromeTester = new Palindrome();
        assertFalse(palindromeTester.isPalindrome("A man a plan a canal Panama"));
    }

    @Test
    public void whenPalindromeWithSpecialCharacters_thenAccept() {
        Palindrome palindromeTester = new Palindrome();
        assertTrue(palindromeTester.isPalindrome("a!a"));
    }

    @Test
    public void whenNotPalindromeWithSpecialCharacters_thenReject() {
        Palindrome palindromeTester = new Palindrome();
        assertTrue(palindromeTester.isPalindrome("abba"));
    }

    @Test
    public void whenNumericPalindrome_thenAccept() {
        Palindrome palindromeTester = new Palindrome();
        assertTrue(palindromeTester.isPalindrome("12321"));
    }

    @Test
    public void whenNotNumericPalindrome_thenReject() {
        Palindrome palindromeTester = new Palindrome();
        assertFalse(palindromeTester.isPalindrome("12345"));
    }

    @Test
    public void whenMixedAlphanumericPalindrome_thenAccept() {
        Palindrome palindromeTester = new Palindrome();
        assertTrue(palindromeTester.isPalindrome("1a2b2a1"));
    }

    @Test
    public void whenMixedAlphanumericNotPalindrome_thenReject() {
        Palindrome palindromeTester = new Palindrome();
        assertFalse(palindromeTester.isPalindrome("1a2b3a1"));
    }
}
