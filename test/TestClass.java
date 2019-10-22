public class TestClass extends TestSuite {
    protected void testList() {
        testThis();
        testThat();
        testassertEquals();
    }

    public void testThis() {
        int result = 5;
        assertEquals(5, result);
    }
    public void testThat() {

        assertEquals(3,7);
    }
    public void testassertEquals() {

        assertEquals(("hej"), "HeJ");        //Tester for strings, denne test er ikke case sensitiv
        assertEquals(2.0, 2.0);    //Tester for doubles
        assertEquals(2,2);          //Tester for ints
    }





}
