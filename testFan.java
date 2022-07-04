public class testFan {
  public static void main (String[] args) {
    fan firstFan = new fan();
    fan secondFan = new fan();
    
    firstFan.setSpeed(fan.FAST);
    firstFan.setRadius(10);
    firstFan.setColor("yellow");
    firstFan.setisOn(true);
    
    secondFan.setSpeed(fan.MEDIUM);
    secondFan.setRadius(5);
    secondFan.setColor("blue");
    secondFan.setisOn(false);
    
    System.out.println(firstFan);
    System.out.println(secondFan);
    
  }
}