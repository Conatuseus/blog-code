package com.conatuseus.immutable;

public class ArrayObject {

    private final int[] array;

    public ArrayObject(final int[] array) {
        this.array = array.clone();
    }

    public int[] getArray() {
        return (array == null) ? null : array.clone();
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        ArrayObject arrayObject = new ArrayObject(array);

        for (int num : arrayObject.getArray()) {
            System.out.print(num + " ");
        }
        // 결과: 1 2 3

        System.out.println();
        array[0] = 999; // arrayObject의 배열 값은 변하지 않는다.

        for (int num : arrayObject.getArray()) {
            System.out.print(num + " ");
        }
        // 결과: 1 2 3
    }
}
