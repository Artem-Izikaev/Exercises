import java.util.Arrays;

public class Xbonacci {

  public double[] tribonacci(double[] s, int n) {
      return xbonacci (s, n, 3);
  }

  /* Calculates first @sequenceNumbersCount numbers in the Fibonacci sequence
  *    where @signatureNumbersCount is the count of numbers in sequence signature.
  *    Input array @signature contains values of signature.
  *    Adds leading zeroes in the signature if count of numbers in
  *    the input sequence signature is less than @signatureNumbersCount.
  *    Throws exception if @sequenceNumbersCount is less than 0.
  *    Throws exception if @signatureNumbersCount is less than 1.
  */
  private double[] xbonacci (double[] signature, int sequenceNumbersCount, int signatureNumbersCount) {    
    // Initialize array of required length for result sequence
    double[] xbonacciArray = initSequenceArray (signature, sequenceNumbersCount, signatureNumbersCount);

    // Calculate required count of numbers of sequence
    for (int i = signatureNumbersCount; i < sequenceNumbersCount; i++) {
      // Each next number of sequence is the summ of previous signatureNumbersCount values
      for (int j = 1; j <= signatureNumbersCount; j++) {
        xbonacciArray[i] = xbonacciArray[i] + xbonacciArray[i - j];
      }
    }
    return xbonacciArray;
  }
  
  /* Initializes an empty array for xbonacchi sequence with required by
  *    @sequenceNumbersCount length and copy the sequence signature in
  *    the new instance of array
  */  
  private double[] initSequenceArray (double[] signature, int sequenceNumbersCount, int signatureNumbersCount) {
    double[] initArray = new double[sequenceNumbersCount];
    /* If input signature value length is less than needed signature length,
    *   will leave first missing elements are filled by zeroes,
    *   e.g. if input signature value = [1] and signature length = 3,
    *   then initial array will begin [0,0,1,..]
    */    
    int startSequenceElement = signatureNumbersCount - signature.length;
    
    // Copy signature value in new array
    for (int i = startSequenceElement; i < Math.min (signatureNumbersCount,sequenceNumbersCount); i++) {
      initArray[i] = signature[i - startSequenceElement];
    }
    return initArray;
  }
}