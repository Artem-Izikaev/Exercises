import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.util.Random;
import java.util.Arrays;
import static org.junit.Assert.*;
import static java.util.Arrays.copyOf;

public class XbonacciTest {
  private Xbonacci variabonacci;
  
  @Before
  public void setUp() throws Exception {
    variabonacci = new Xbonacci();
  }

  @After
  public void tearDown() throws Exception {
    variabonacci = null;
  }
  
  private double precision = 1e-10;
  
  @Test
  public void basicTests() {
    assertArrayEquals(new double []{1,1,1,3,5,9,17,31,57,105}, variabonacci.tribonacci(new double []{1,1,1},10), precision);
    assertArrayEquals(new double []{0,0,1,1,2,4,7,13,24,44}, variabonacci.tribonacci(new double []{0,0,1},10), precision);
    assertArrayEquals(new double []{0,1,1,2,4,7,13,24,44,81}, variabonacci.tribonacci(new double []{0,1,1},10), precision);    
    assertArrayEquals(new double []{1,0,0,1,1,2,4,7,13,24}, variabonacci.tribonacci(new double []{1,0,0},10), precision);
    assertArrayEquals(new double []{0,0,0,0,0,0,0,0,0,0}, variabonacci.tribonacci(new double []{0,0,0},10), precision);
    assertArrayEquals(new double []{1,2,3,6,11,20,37,68,125,230}, variabonacci.tribonacci(new double []{1,2,3},10), precision);
    assertArrayEquals(new double []{3,2,1,6,9,16,31,56,103,190}, variabonacci.tribonacci(new double []{3,2,1},10), precision);
    assertArrayEquals(new double []{1}, variabonacci.tribonacci(new double []{1,1,1},1), precision);
    assertArrayEquals(new double []{}, variabonacci.tribonacci(new double []{300,200,100},0), precision);
    assertArrayEquals(new double []{0.5,0.5,0.5,1.5,2.5,4.5,8.5,15.5,28.5,52.5,96.5,177.5,326.5,600.5,1104.5,2031.5,3736.5,6872.5,12640.5,23249.5,42762.5,78652.5,144664.5,266079.5,489396.5,900140.5,1655616.5,3045153.5,5600910.5,10301680.5}, variabonacci.tribonacci(new double []{0.5,0.5,0.5},30), precision);

  }
  
  @Test
  public void randomTests() {
    double[] sign;
    int n;
    for(int i = 0; i < 40; i++) {
        sign = new double[]{randInt(0, 20), randInt(0, 20), randInt(0, 20)};
        n = randInt(0, 50);

        System.out.println("Testing for signature: " + Arrays.toString(sign) + " and n: " + n);
        assertArrayEquals("It should work with random inputs too", soluzionacci(sign, n), variabonacci.tribonacci(sign, n), precision);
        
    }
  }

  private double[] soluzionacci(double[] s, int n) {
    double[] res = new double[n];
    res = copyOf(s, n);
    
    for(int i = 3; i < n; i++)
      res[i] = res[i - 3] + res[i - 2] + res[i - 1];
    
    return res;
  }

  private int randInt(int aStart, int aEnd) {
    Random random = new Random();
    long range = (long)aEnd - (long)aStart + 1;
    long fraction = (long)(range * random.nextDouble());
    
    return (int)(fraction + aStart);    
  }    
}