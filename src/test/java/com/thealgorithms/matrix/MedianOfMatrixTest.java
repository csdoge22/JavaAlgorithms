package com.thealgorithms.matrix;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

public class MedianOfMatrixTest {

    @Test
    public void testMedianWithOddNumberOfElements() {
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(Arrays.asList(1, 3, 5));
        matrix.add(Arrays.asList(2, 4, 6));
        matrix.add(Arrays.asList(7, 8, 9));

        int result = MedianOfMatrix.median(matrix);

        assertEquals(5, result);
    }

    @Test
    public void testMedianWithEvenNumberOfElements() {
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(Arrays.asList(2, 4));
        matrix.add(Arrays.asList(1, 3));

        int result = MedianOfMatrix.median(matrix);

        assertEquals(2, result);
    }

    @Test
    public void testMedianSingleElement() {
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(List.of(1));

        assertEquals(1, MedianOfMatrix.median(matrix));
    }

    @Test
    void testEmptyMatrixThrowsException() {
        Iterable<List<Integer>> emptyMatrix = Collections.emptyList();
        assertThrows(IllegalArgumentException.class, () -> MedianOfMatrix.median(emptyMatrix), "Expected median() to throw, but it didn't");
    }
}
