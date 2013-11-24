public class Stuff {
  private String valueOfStuff;
  
  public Stuff() {
    valueOfStuff = "unknown";
  }
  
  public changeValueOfStuff(String newStuff) {
    valueOfStuff = newStuff;
  }
  
  public String toString() {
    return valueOfStuff+" Bob!";
  }
}
