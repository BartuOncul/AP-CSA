public class ChessBoard
{
    public static void main(String[] args)
    {
        String[][] chess = new String [8][8];
        
        chess[0] = new String[]{"Rook", "Knight", "Bishop", "Queen", "King", "Bishop", "Knight", "Rook"};
        chess[1] = new String[]{"Pawn", "Pawn", "Pawn", "Pawn", "Pawn", "Pawn", "Pawn", "Pawn"};
        
        for(int i=2; i<6; i++)
        {
            for(int j=0; j<8; j++)
            {
                chess[i][j] = "-";
            }
        }
        chess[6] = new String[]{"Pawn", "Pawn", "Pawn", "Pawn", "Pawn", "Pawn", "Pawn", "Pawn"};
        chess[7] = new String[]{"Rook", "Knight", "Bishop", "Queen", "King", "Bishop", "Knight", "Rook"};
        
        

        
        print(chess);
        

    }
    
    //Do not make alterations to this method!
    public static void print(String[][] array)
    {
        for(String[] row: array)
        {
            for(String thing: row)
            {
                System.out.print(thing + "\t");
            }
            System.out.println();
        }
    }
}
