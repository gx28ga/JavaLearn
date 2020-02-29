public class ArrayUtil {
  public void print(int[] arr) {
    for(int value: arr) {
      System.out.print(value + "\t");
    }
  }

  public int getIndex(int[] arr, int dest) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == dest) {
        return i;
      }
    }

    return -1;
  }
}
