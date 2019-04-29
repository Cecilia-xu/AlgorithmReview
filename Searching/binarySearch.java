import java.util.Arrays;

public class binarySearch {

  public static int binarySearch(int key, int [] a) {
    int lo = 0;              //Note: find the key in range [lo,hi]
    int hi = a.length - 1;
    while (lo <= hi) {       //Note: range [lo,hi] -> lo=high make sense
    int mid = lo + (hi - lo) / 2;
    if (key < a[mid])      hi = mid - 1;      //Note: range [lo,hi] -> update hi = mid - 1
    else if (key > a[mid]) lo = mid + 1;      //Note: range [lo,hi] -> update lo = mid + 1
    else                   return mid;
    }
    return -1;                                //Note: case when key cannot be found! return -1!
  
  }
  
}
