package powerpackage;


import org.junit.Test;

public class PowerTest {
    @Test
    public void one_raised_to_one_is_one() { assert powerFinder.findPow(1,1) == 1; }

    @Test
    public void two_raised_to_one_is_two() { assert powerFinder.findPow(2,1) == 2;}

    @Test
    public void two_raised_to_two_is_four() {
        assert powerFinder.findPow(2,2) == 4;
    }

    @Test
    public void three_raised_to_two_is_nine() { assert powerFinder.findPow(3,2) == 9; }
}
