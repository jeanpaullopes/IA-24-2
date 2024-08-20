// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    int size = 180000;
    //int size = 100;
    int[] valores = new int[size];
    long time = Calendar.getInstance().getTimeInMillis();
    populate(valores);
    
    System.out.println("decorrido: " + (Calendar.getInstance().getTimeInMillis() - time)+"ms");
    System.out.println("para "+size+" valores");
    
    
  }
public static void populate(int[] arr) {
  Random rand = new Random();
  for (int i = 0; i < arr.length; i++) {
    arr[i] = rand.nextInt(100);
  }
}
  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}
