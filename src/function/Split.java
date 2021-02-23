package function;

public class Split {
  private String[] result;

  public Split() {
  }

  public Split(String str, String regex) {
    this.result = str.split(regex);
  }

  public String[] getResult() {
    return this.result;
  }

  public String getPartOfResult(int index) {
    if (result != null && result.length >= index) {
      return this.result[index];
    }

    return null;
  }
}
