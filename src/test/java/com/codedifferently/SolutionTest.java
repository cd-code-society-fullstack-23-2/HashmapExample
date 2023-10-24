package com.codedifferently;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void testCountWordsThatStartWithLetterWithValidInputs() {
        String[] words = {"apple", "banana", "ape", "avocado", "butter", "blue"};
        int count = solution.countWordsThatStartWithLetter('a', words);
        Assertions.assertEquals(3, count);
    }

    @Test
    void testCountWordsThatStartWithLetterWithNoMatches() {
        String[] words = {"cat", "dog", "elephant", "giraffe"};
        int count = solution.countWordsThatStartWithLetter('b', words);
        Assertions.assertEquals(0, count);
    }

    @Test
    void testCountWordsThatStartWithLetterWithEmptyArray() {
        String[] words = {};
        int count = solution.countWordsThatStartWithLetter('a', words);
        Assertions.assertEquals(0, count);
    }

    @Test
    void testCountWordsThatStartWithLetterWithNullArray() {
        int count = solution.countWordsThatStartWithLetter('a', null);
        Assertions.assertEquals(0, count);
    }
}
