public class ArrayMinMax<T extends Comparable<T>> implements MinMax<T> {
    private T[] values;

    public ArrayMinMax(T[] values) {
        this.values = values;
    }

    @Override
    public T min() {
        T min = values[0];
        for (T value : values) {
            if (value.compareTo(min) < 0) {
                min = value;
            }
        }
        return min;
    }

    @Override
    public T max() {
        T max = values[0];
        for (T value : values) {
            if (value.compareTo(max) > 0) {
                max = value;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // Test with Integer
        Integer[] intArray = {3, 5, 1, 9, 7};
        ArrayMinMax<Integer> intMinMax = new ArrayMinMax<>(intArray);
        System.out.println("Integer Min: " + intMinMax.min());
        System.out.println("Integer Max: " + intMinMax.max());

        // Test with String
        String[] stringArray = {"apple", "banana", "pear", "orange"};
        ArrayMinMax<String> stringMinMax = new ArrayMinMax<>(stringArray);
        System.out.println("String Min: " + stringMinMax.min());
        System.out.println("String Max: " + stringMinMax.max());

        // Test with Character
        Character[] charArray = {'b', 'a', 'd', 'c'};
        ArrayMinMax<Character> charMinMax = new ArrayMinMax<>(charArray);
        System.out.println("Character Min: " + charMinMax.min());
        System.out.println("Character Max: " + charMinMax.max());

        // Test with Float
        Float[] floatArray = {3.2f, 5.5f, 1.8f, 9.0f, 7.4f};
        ArrayMinMax<Float> floatMinMax = new ArrayMinMax<>(floatArray);
        System.out.println("Float Min: " + floatMinMax.min());
        System.out.println("Float Max: " + floatMinMax.max());
    }
}
