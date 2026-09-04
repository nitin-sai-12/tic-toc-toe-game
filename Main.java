import java.util.*;
public class Main{
    public static void displayBoard(char[][] board){
        System.out.println();
        System.out.println(" "+board[0][0]+" | "+board[0][1]+" | "+board[0][2]);
        System.out.println("-----------");
        System.out.println(" "+board[1][0]+" | "+board[1][1]+" | "+board[1][2]);
        System.out.println("-----------");
        System.out.println(" "+board[2][0]+" | "+board[2][1]+" | "+board[2][2]);
         System.out.println();
    }
    static boolean checkWinner(char[][] board,char player){
        //check rows
        for(int i=0;i<3;i++){
            if(board[i][0]==player && board[i][1]==player && board[i][2]==player){
                return true;
            }
        }
        //check columns
        for(int i=0;i<3;i++){
            if(board[0][i]==player && board[1][i]==player && board[2][i]==player){
                return true;
            }
        }
        //check diagonal
        if(board[0][0]==player && board[1][1]==player && board[2][2]==player){
            return true;
        }
        //check another diagonal
        if(board[0][2]==player && board[1][2]==player && board[2][0]==player){
            return true;
        }
        return false;
    }
    static boolean isfull(char[][] board){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[i][j]==' ')
                return false;
                
            }
        }
        return true;
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char[][] board={{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
        char currentplayer='x';
        System.out.println("===Tic Toc Toe===");
        while(true){
            displayBoard(board);
            System.out.println("Player "+currentplayer+"'s turn");
            System.out.println("Enter row(1-3):");
            int row=sc.nextInt();
            System.out.println("Enter coloumn(1-3):");
            int col=sc.nextInt();
            col--;
            row--;
            if(row<0|| row >2|| col>2|| col<0){
                System.out.println("Invalid position.Try again");
                continue;
            }
            if(board[row][col]!=' '){
                System.out.println("Positin already occupied!");
                continue;
            }
            board[row][col]=currentplayer;
            if(checkWinner(board,currentplayer))
            {
                displayBoard(board);
                System.out.println("Player "+currentplayer+" Wins!");
                break;
            }
            if(isfull(board)){
                displayBoard(board);
                System.out.println("Game Draws!");
                break;
            }
            //change Player
            if(currentplayer=='x')
            currentplayer='o';
            else 
            currentplayer='x';
        }
        
    }
}
