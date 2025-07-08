package com.thealgorithms.hashing;

public class FindDuplicatesInArrayTest {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    public void testIdentifyDuplicates(Integer[] arr, List<Integer> expected) {
        assertEquals(expected, FindDuplicatesInArray.identifyDuplicates(arr));
    }

    public void provideTestCases(){
        return Stream.of(
            Arguments.of(new Integer[]{1, 2, 3, 4, 5, 6}, List.of()),
            Arguments.of(new Integer[]{1, 2, 3, 4, 5, 1}, List.of(1)),
            Arguments.of(new Integer[]{1, 2, 3, 4, 5, 1, 2}, List.of(1, 2)),
            Arguments.of(new Integer[]{1, 1, 1, 1}, List.of(1)),
            Arguments.of(new Integer[]{}, List.of())
        );
    }
}
