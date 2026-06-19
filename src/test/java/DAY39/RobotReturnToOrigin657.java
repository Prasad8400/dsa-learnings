package DAY39;

public class RobotReturnToOrigin657 {
  /*
  
             U (0, 1)
                ↑
                |
  L (-1, 0) ← (0, 0) → R (1, 0)
                |
                ↓
             D (0, -1)
  
  */
  public static void main(String[] args) {

    String moves = "UDLR";

    int x = 0;
    int y = 0;

    for (int i = 0; i < moves.length(); i++) {
      char move = moves.charAt(i);

      if (move == 'U')
        y++;
      else if (move == 'D')
        y--;
      else if (move == 'R')
        x++;
      else if (move == 'L')
        x--;

    }

    // Returns true only if robot is back at (0,0)
    System.out.println(x == 0 && y == 0);
  }

}
