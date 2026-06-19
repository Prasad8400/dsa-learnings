package DAY26;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

  public static boolean isValidSudoku(char[][] board) {

    Set<String> seen = new HashSet<>();

    for (int row = 0; row < 9; row++) {

      for (int col = 0; col < 9; col++) {

        char num = board[row][col];

        if (num == '.')
          continue;

        String rowCheck = num + " in row " + row;
        String colCheck = num + " in col " + col;
        String boxCheck = num + " in box " + row / 3 + "-" + col / 3;

        if (!seen.add(rowCheck) ||
            !seen.add(colCheck) ||
            !seen.add(boxCheck)) {

          return false;
        }
      }
    }

    return true;
  }

  public static void main(String[] args) {

    char[][] board = {
        { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
        { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
        { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
        { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
        { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
        { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
        { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
        { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
        { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
    };

    System.out.println(isValidSudoku(board));
  }
}
