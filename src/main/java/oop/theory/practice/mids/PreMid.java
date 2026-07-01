package oop.theory.practice.mids;


class PreMid {
    public static void main(String[] args) {
        // There are total of eight primitive data types in Java
        // byte, short, int, long, double, float, boolean, char
        // Variable initialization
        int a = 10;
        int b = 2;

        // Implicit typecasting
//        double x = 10;
//        System.out.println(x);

        // Explicit typecasting
//        int y = (int) 10.0;
//        short z = (short) 10.0;

        // Relational operators
//        if (a < b || a > b || a <= b || a >= b || a != b || a == b) {
//            System.out.println("We are going in to the condition");
//        }

        // Two-way if statement
//        if (a < b) {
//            System.out.println("a is less than b");
//        }
//        else {
//            System.out.println("a is greater or equal to b");
//        }

        // Multiway if statement
//        if (a < b) {
//            System.out.println("condition 1");
//        }
//        else if (a > b) {
//            System.out.println("condition 2");
//        }
//        else if (a == b) {
//            System.out.println("condition 3");
//        }
//        else {
//            System.out.println("Default condition");
//        }

        // Logical operators
//        if (a < 10 && b > 100) {
//
//        }
//        else if (a < 10 || b > 100) {
//
//        }
//        else if (!true) {
//
//        }

        // Switch statement
//        switch (a) {
//            case 10:
//                System.out.println("a is equal to 10");
//                break;
//            case 20:
//                System.out.println("a is equal to 20");
//                break;
//            default:
//                System.out.println("this is a default condition");
//        }

        // Conditional operator
//        String answer = a > 10 ? "Hello world" : "No hello";
//        System.out.println(answer);

        // While loop
//        while (a < 100) {
//            System.out.println("My name is Bilal");
//            a++;
//        }

        // Sentinel loop using while
//        char exit = 'n';
//        Scanner scn = new Scanner(System.in);
//        while (exit != 'y') {
//            System.out.println("Welcome to menu");
//            System.out.println("Press y to exit: ");
//            exit = scn.next().charAt(0);
//        }

        // Do while loop
//        do {
//            System.out.println("My name is Bilal");
//            a++;
//        }while (a < 200);

        // Nested for loop
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                System.out.println("This line will run 10 x 10 = 100 times");
//            }
//        }

        // Nested while loop
//        a = 0;
//        b = 0;
//        while (a < 10) {
//            while (b < 10) {
//                System.out.println("This line will run 100 times in total");
//                b++;
//            }
//            a++;
//        }

        // Continue and break in loops
//        for (int i = 0; i < 10; i++) {
//            if (i == 5) {
//                break;
//            }
//            System.out.println("This loop will run only 6 times");
//        }
//
//        for (int i = 0; i < 10; i++) {
//            if (i == 5) {
//                continue;
//            }
//            System.out.println("This loop will skip 6th iteration so it will run 9 times");
//        }

        // Array
//        int[] myArr = {1,2,3,4};
//        for (int i = 0; i < myArr.length; i++) {
//            System.out.println("element: " + myArr[i]);
//        }

        // Random int array
//        int[] randomArr = new int[10];
//        for (int i = 0; i < randomArr.length; i++) {
//            randomArr[i] = (int) (Math.random() * 12); // Assigns random value between 0 and 11
//        }
//        System.out.println(Arrays.toString(randomArr));

        // Shuffling of an array
//        int[] myArr = {1,2,3,4,5};
//        for (int i = 0; i < myArr.length; i++) {
//            int j = (int) (Math.random() * myArr.length);
//            int temp = myArr[i];
//
//            myArr[i] = myArr[j];
//            myArr[j] = temp;
//        }
//        System.out.println(Arrays.toString(myArr));

        // Right shifting array elements
//        int[] myArr = {1,2,3,4,5};
//        int lastElement = myArr[myArr.length - 1];
//
//        for (int i = myArr.length - 1; i > 0; i--) {
//            myArr[i] = myArr[i-1];
//        }
//        myArr[0] = lastElement;
//
//        System.out.println(Arrays.toString(myArr));


        // Left shifting array elements
//        int[] myArr = {1,2,3,4,5};
//        int firstElement = myArr[0];
//
//        for (int i = 0; i < myArr.length -1; i++) {
//            myArr[i] = myArr[i+1];
//        }
//        myArr[myArr.length - 1] = firstElement;
//
//        System.out.println(Arrays.toString(myArr));

        // Copying arrays manually
//        int[] arrayA = {1,2,3,4,5};
//        int[] arrayB = new int[arrayA.length];
//        for (int i = 0; i < arrayA.length; i++) {
//            arrayB[i] = arrayA[i];
//        }
//        System.out.println("Array A: " + Arrays.toString(arrayA));
//        System.out.println("Array B: " + Arrays.toString(arrayB));

        // Copying array using built-in function
//        int[] arrayA = {1,2,3,4,5};
//        int[] arrayB = Arrays.copyOf(arrayA, arrayA.length);
//        System.out.println("Array A: " + Arrays.toString(arrayA));
//        System.out.println("Array B: " + Arrays.toString(arrayB));

        // Array copy another built-in function
//        int[] arrayA = {1,2,3,4,5};
//        int[] arrayB = new int[arrayA.length];
//        System.arraycopy(arrayA, 0, arrayB, 0, arrayA.length);
//
//        System.out.println("Array A: " + Arrays.toString(arrayA));
//        System.out.println("Array B: " + Arrays.toString(arrayB));

        // Searching in array
//        int[] myArr = {7, 8, 9, 10, 11};
//        int find = 3;
//        int found = -1;
//        for (int i = 0; i < myArr.length; i++) {
//            if (myArr[i] == find) {
//                found = i;
//                break;
//            }
//        }
//        if (found != -1) {
//            System.out.println("Element found at index: " + found);
//        }
//        else {
//            System.out.println("Element not found");
//        }

        // Sorting of an array using bubble sort algorithm
//        int[] myArr = {7, 5, 3, 10, 1, 2};
//        boolean sorting = true;
//
//        System.out.println("Before sorting: " + Arrays.toString(myArr));
//
//        while (sorting) {
//            sorting = false;
//
//            for (int i = 0; i < myArr.length - 1; i++) {
//                if (myArr[i] > myArr[i+1]) {
//                    int temp = myArr[i];
//                    myArr[i] = myArr[i+1];
//                    myArr[i+1] = temp;
//
//                    sorting = true;
//                }
//            }
//        }
//
//        System.out.println("After sorting: " + Arrays.toString(myArr));

        // Variable length argument
//        System.out.println("Avg of 1,2,4: " + avg(1,2,4));
//        System.out.println("Avg of 1,2,4,10: " + avg(1,2,4,10));

        // Command line arguments (a basic calculator)
//        int operandA = Integer.parseInt(args[0]);
//        char operator = args[1].charAt(0);
//        int operandB = Integer.parseInt(args[2]);
//        double ans;
//
//        switch (operator) {
//            case '+':
//                ans = operandA + operandB;
//                break;
//            case '-':
//                ans = operandA - operandB;
//                break;
//            case '/':
//                ans = (double) operandA / operandB;
//                break;
//            case '*':
//                ans = operandA * operandB;
//                break;
//
//            default:
//                ans = 0;
//        }
//
//        System.out.println("Command line argument: " + operandA + operator + operandB + " = " + ans);

        // String comparison
//        String wordA = "Bilal";
//        String wordB = "Harry";
//
//        if (wordA.equals(wordB)) {
//            System.out.println("WordA was equal to WordB");
//        }
//        else if (wordA.equalsIgnoreCase(wordB)) {
//            System.out.println("WordA was equal to WordB");
//        }
//        else {
//            System.out.println("words didn't matched");
//        }

        // String methods
//        String str = "This is an example sentence";
//        System.out.println("Lower case: " + str.toLowerCase());
//        System.out.println("Upper case: " + str.toUpperCase());

        // Finding a character in a string
//        String str = "This is an example sentence";
//        char find = 'e';
//        int found = -1;
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == find) {
//                found = i;
//                break;
//            }
//        }
//        if (found != -1) {
//            System.out.println("The character found at index: " + found);
//        }
//        else {
//            System.out.println("Character not found");
//        }

        // Substring example
//        String str = "This is an example sentence";
//        String partOfIt = str.substring(5, 15);
//        System.out.println("Full string: " + str);
//        System.out.println("Part of it using substring: " + partOfIt);

        // Declaring and assigning object EXAMPLE#1
//        Scanner scanner;                    // Declaration
//        scanner = new Scanner(System.in);   // Initialization

        // Declaring and assigning object EXAMPLE#2
//        String str;                               // Declaration
//        str = new String("This is an example");   // Initialization

        // Calling static method due to we are in static method of main
//        System.out.println("Adder method for 1,2: " + add(1,2));
    }

    // Introduction to method
    static int add(int a, int b) {
        int ans = a + b;
        return ans;
    }

    // Variable length argument
    static double avg(int ...values) {
        double sum = 0;
        int count = 0;
        double avg;

        for (int i = 0; i < values.length; i++) {
            sum += values[i];
            count++;
        }

        avg = sum / count;
        return avg;
    }
}