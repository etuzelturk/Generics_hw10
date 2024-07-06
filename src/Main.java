public class Main {
    public static void main(String[] args) {

        //Part 1
        Test<String> stringTest = new Test<>("Test String");
        stringTest.printObj();
        Test<Integer> integerTest = new Test<>(1);
        integerTest.printObj();
        Test<Double> doubleTest = new Test<>(5.0);
        doubleTest.printObj();

        //Part 2
        String[] strArr = new String[] {"Test", "String"};
        System.out.println(ArraySearch.findElement(strArr,"Str","-1"));
        System.out.println(ArraySearch.findElement(strArr,"Test", "-1"));
        Integer[] intArr = new Integer[] {1, 2, 3};
        System.out.println(ArraySearch.findElement(intArr,1,-1));
        System.out.println(ArraySearch.findElement(intArr,5,-1));

    }
}