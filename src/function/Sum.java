package function;

import java.util.Arrays;

public class Sum {
  private int[] array;
  private int size;
  private int sum;

  public Sum() {
  }

  public Sum(int[] intArray) {
    this.array = intArray;
    this.size = intArray.length;
    this.sum = Arrays.stream(this.array).sum();
  }

  public int getSize() {
    return this.size;
  }

  public int getSum() {
    return this.sum;
  }

  public int getElement(int index) {
    if (this.array != null) {
      return this.size >= index ? this.array[index] : -9999999;
    }

    return -9999999;
  }
}
