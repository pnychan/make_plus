import java.util.HashMap;
import java.util.Map;

public class Plus {
  void plus(int num, int range) {
    int ten = 0;
    int memory = num;
    
    Map<Integer, Integer> map = new HashMap<>();
    map.put(0, 1);
    map.put(1, 2);
    map.put(2, 3);
    map.put(3, 4);
    map.put(4, 5);
    map.put(5, 6);
    map.put(6, 7);
    map.put(7, 8);
    map.put(8, 9);
    map.put(9, 0);
    
    for (int i = 0; i < range; i++){
    num = map.get(num);
    if (num < memory) {
        ten = map.get(ten);
        memory = map.get(num);//num + 1
    }
    
  }
  if (ten != 0){
  System.out.printf("%d%d", ten, num);
  } else {
    System.out.println(num);
  }
}
  
  public static void main(String[] args) {
    Plus plus = new Plus();
    plus.plus(2, 21);
}
}
