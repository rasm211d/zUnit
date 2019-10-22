public abstract class TestSuite {

    private int passed;
    private int failed ;

    public void runTestSuite() {
        passed = 0;
        failed = 0;

        testList();

        System.out.println("Test passed: " + passed);
        System.out.println("Test failed: " + failed);
    }
    protected abstract void testList ();

    public void assertEquals(int expected, int actual) {
        if (expected == actual) {
            passed++;
        } else {
            failed++;
            System.out.println("Expected: " + expected + "\nActual: " + actual);
        }
    }
    public void assertEquals(String expected, String actual) {
        if (expected.equalsIgnoreCase(actual)) {
            passed++;
        } else {
            failed++;
            System.out.println("Expected: " + expected + "\nActual: " + actual);
        }

    }
    public void assertEquals(double expected, double actual) {
        if (expected == actual) {
            passed++;
        } else {
            failed++;
            System.out.println("Expected: " + expected + "\nActual: " + actual);
        }
    }
}
