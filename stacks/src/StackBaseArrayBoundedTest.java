public class StackBaseArrayBoundedTest {
    public static void main(String[] args) {
        StackInterface1<String> test = new StackBaseArrayBounded<String>();
        test.push("trouble in the fields");
        test.push("love at the five and dime");
        test.push("once in a very blue moon");
        String s = test.top();
        if (s.equals("once in a very blue moon"))
            System.out.println("Test 34 passed");
        else
            System.out.println("Test 34 failed");
    }
}
