package OOPS;

public class Interface_one {

    public static void main(String[] args) {
            Queen q = new Queen();
            q.moves();

    }
}


interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
      public void moves()
      {
          System.out.println("Up ,Down, Left, Right, Diagonally any steps");
      }
}

class Rook implements ChessPlayer{
    public void moves()
    {
        System.out.println("Up. Down, Left, Right, Diagonally by one step");
    }
}