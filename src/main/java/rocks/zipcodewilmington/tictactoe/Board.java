package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] board;
    public Board(Character[][] matrix) {
        this.board=matrix;
    }


    public Boolean isInFavorOfX() {

        //Check Vertically
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                if (j==2){
                    return true;
                }
                if(this.board[j][i]=='X'&&this.board[j+1][i]=='X')
                {
                    continue;
                }
                else{

                    break;
                }
            }

        }
        //Check Horizontal
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                if(j==2){
                    return true;
                }
                if(this.board[i][j]=='X'&&this.board[i][j+1]=='X') {
                    continue;
                }
                else{

                    break;
                }

            }

        }
        //check Diagnal
       if((this.board[0][0]=='X' && this.board[1][1]=='X' && this.board[2][2]=='X') || (this.board[2][0]=='X' && this.board[1][1]=='X' && this.board[0][2]=='X')){
           return true;
       }

       else{
           return false;
       }
    }

    public Boolean isInFavorOfO() {
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                if (j==2){
                    return true;
                }
                if(this.board[j][i]=='O'&&this.board[j+1][i]=='O')
                {
                    continue;
                }
                else{

                    break;
                }
            }
        }
        //Check Horizontal
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                if(j==2){
                    return true;
                }
                if(this.board[i][j]=='O'&&this.board[i][j+1]=='O') {
                    continue;
                }
                else{

                    break;
                }
            }
        }
        //check Diagnal
        if((this.board[0][0]=='O' && this.board[1][1]=='O' && this.board[2][2]=='O') || (this.board[2][0]=='O' && this.board[1][1]=='O' && this.board[0][2]=='O')){
            return true;
        }

        else{
            return false;
        }
    }

    public Boolean isTie() {
        if(isInFavorOfO()==isInFavorOfX()){
            return true;
        }
        return false;
    }

    public String getWinner() {
        char X = 'X';
        char O = 'O';
        String winner = "";
        if (isInFavorOfO()) {
            winner += O;
        } else if (isInFavorOfX()) {
            winner += X;
        }
        return winner;
    }

}
