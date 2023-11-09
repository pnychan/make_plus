import java.util.HashMap;
import java.util.Map;

public class Minus {
  void minus(int num, int range) {
    int memory = num;
    int ten = 0;
    Map<Integer, Integer> map = new HashMap<>();
    map.put(1, 0);
    map.put(2, 1);
    map.put(3, 2);
    map.put(4, 3);
    map.put(5, 4);
    map.put(6, 5);
    map.put(7, 6);
    map.put(8, 7);
    map.put(9, 8);
    map.put(0, 9);
    
    for (int i = 0; i < range; i++){
    num = map.get(num);
    if (num > memory) {
        ten = map.get(ten);
        memory = map.get(num);//num - 1
    }
    
  }
  if (ten != 0){
  System.out.printf("%d%d", ten, num);
  } else {
    System.out.println(num);
  }
}
  
  public static void main(String[] args) {
    Minus minus = new Minus();
    minus.minus(3, 2);
}
}
