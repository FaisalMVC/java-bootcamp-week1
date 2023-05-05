import java.util.Scanner;
/*
*
* @author Faisal Alharbi
* */
public class Project1 {
    public static void main(String[] args) {
        String[][] tictactoe = new String[3][3];
        Scanner input = new Scanner(System.in);
        int position = 0;
        boarder(tictactoe);
        while(!check(tictactoe)){
            System.out.println("Select a position : (1-9)");
            position = input.nextInt();
            while(!add(tictactoe,position,"X")){
                System.out.println("Invalid position please try again, Select a position : (1-9)");
                position = input.nextInt();
            }
            boarder(tictactoe);
            if(check(tictactoe)){
                break;
            }

            do{
                position = (int)(Math.random()*10);
            }while(!add(tictactoe,position,"O"));
            boarder(tictactoe);
            if(check(tictactoe)){
                break;
            }
        }

    }
    public static boolean check(String[][] tictactoe){
        String whoWins="noOne";
        String resultOfHorizontal = horizontal(tictactoe);
        String resultOfDiagonal = diagonal(tictactoe);
        String resultOfVertical = vertical(tictactoe);
        if(!resultOfHorizontal.equalsIgnoreCase("noOne")) {
            if(resultOfHorizontal.equalsIgnoreCase("X"))
                System.out.println("You won congratulations (: ");
            else
                System.out.println("The computer won ):, good game ");

            return true;

        }else if(!resultOfDiagonal.equalsIgnoreCase("noOne") ){
            if(resultOfDiagonal.equalsIgnoreCase("X"))
                System.out.println("You won congratulations (: ");
            else
                System.out.println("The computer won ):, good game ");
            return true;

        } else if(!resultOfVertical.equalsIgnoreCase("noOne")){
            if(resultOfVertical.equalsIgnoreCase("X"))
                System.out.println("You won congratulations (: ");
            else
                System.out.println("The computer won ):, good game ");
            return true;
        }


        for(int i =0 ; i < tictactoe.length ; i++){
            for(int j =0 ; j < tictactoe[i].length ; j++){
                if(tictactoe[i][j] == null){
                    return false;
                }
            }
        }
        System.out.println("There is no winner ");
        return true;

    }

    public static String horizontal(String[][] tictactoe){
        String whoWins="noOne";
        boolean isThereAWinner = true;
        for(int i =0 ; i < tictactoe.length ; i++){
            String test = tictactoe[i][0]; //00
            for(int j = 0 ; j < tictactoe[i].length; j++){
                if(tictactoe[i][j] == null || !tictactoe[i][j].equalsIgnoreCase(test)) { //20
                  //  System.out.println("Here in line 79 and i ="+i+" and j="+j);
                    isThereAWinner = false;
                    break;
                }else if(j ==2){
                    isThereAWinner = true;
                    break;
                }

            }
            if(isThereAWinner){
                whoWins = test;
                break;
            }
        }
        return whoWins;
    }

    public static String vertical (String[][] tictactoe){
        String whoWins="noOne";
        boolean isThereAWinner = true;
        for(int i =0 ; i < tictactoe.length ; i++){
            String test = tictactoe[0][i];
            for(int j = 0 ; j < tictactoe[i].length; j++){
                if(tictactoe[j][i] == null || !tictactoe[j][i].equalsIgnoreCase(test)) {
                    isThereAWinner = false;
                    break;
                }else if(j == 2){
                    isThereAWinner = true;
                    break;
                }
            }
            if(isThereAWinner){
                whoWins = test;
                break;
            }
        }
        return whoWins;
    }
    public static String diagonal (String[][] tictactoe){
        String whoWins="noOne";
        boolean isThereAWinner = true;
        String test = tictactoe[1][1];
        for(int i =0 , j=0; i < tictactoe.length ; i++,j++){
            if(tictactoe[i][j] == null || !tictactoe[i][j].equalsIgnoreCase(test)) {
                isThereAWinner = false;
                break;
            }
        }

        if(isThereAWinner){
           whoWins = test;
        }else if(tictactoe[0][2] != null && tictactoe[2][0] != null){
            if(tictactoe[0][2].equalsIgnoreCase(test) && tictactoe[2][0].equalsIgnoreCase(test)){
                whoWins = test;
            }
        }
        return whoWins;
    }

    public static void boarder(String[][] tictactoe){
        System.out.println("\n\n");
        for(int i =0 ; i<tictactoe.length; i++){
            for(int j =0 ; j<tictactoe[i].length; j++){
                if(tictactoe[i][j] != null){
                    if(j == 2){
                        System.out.print(" "+tictactoe[i][j]);
                    }else {
                        System.out.print("  " + tictactoe[i][j] + "  |");
                    }
                }else if(j != 2){
                    System.out.print("     |");
                }
            }
            if(i !=2)
                 System.out.println("\n --------------");
        }
        System.out.println("\n");
    }
    public static boolean add(String[][] tictactoe, int position, String letter){

        switch(position){
            case 1:
                if(tictactoe[0][0] != null){
                    if(!letter.equalsIgnoreCase("O"))
                        System.out.println("This position already occupied");
                    return false;
                }else{
                    tictactoe[0][0] = letter;
                    return true;
                }
            case 2:
                if(tictactoe[0][1] != null){
                    if(!letter.equalsIgnoreCase("O"))
                        System.out.println("This position already occupied");
                    return false;
                }else{
                    tictactoe[0][1] = letter;
                    return true;
                }
            case 3:
                if(tictactoe[0][2] != null){
                    if(!letter.equalsIgnoreCase("O"))
                        System.out.println("This position already occupied");
                    return false;
                }else{
                    tictactoe[0][2] = letter;
                    return true;
                }
            case 4:
                if(tictactoe[1][0] != null){
                    if(!letter.equalsIgnoreCase("O"))
                        System.out.println("This position already occupied");
                    return false;
                }else{
                    tictactoe[1][0] = letter;
                    return true;
                }
            case 5:
                if(tictactoe[1][1] != null){
                    if(!letter.equalsIgnoreCase("O"))
                        System.out.println("This position already occupied");
                    return false;
                }else{
                    tictactoe[1][1] = letter;
                    return true;
                }
            case 6:
                if(tictactoe[1][2] != null){
                    if(!letter.equalsIgnoreCase("O"))
                        System.out.println("This position already occupied");
                    return false;
                }else{
                    tictactoe[1][2] = letter;
                    return true;
                }
            case 7:
                if(tictactoe[2][0] != null){
                    if(!letter.equalsIgnoreCase("O"))
                        System.out.println("This position already occupied");
                    return false;
                }else{
                    tictactoe[2][0] = letter;
                    return true;
                }
            case 8:
                if(tictactoe[2][1] != null){
                    if(!letter.equalsIgnoreCase("O"))
                        System.out.println("This position already occupied");
                    return false;
                }else{
                    tictactoe[2][1] = letter;
                    return true;
                }
            case 9:
                if(tictactoe[2][2] != null){
                    if(!letter.equalsIgnoreCase("O"))
                        System.out.println("This position already occupied");
                    return false;
                }else{
                    tictactoe[2][2] = letter;
                    return true;
                }
        }
        return false;

    }
}


                // 0 1 2
                // 3 4 5
                // 6 7 8