package com.frei.tic_tac_toe;

import org.infinispan.manager.EmbeddedCacheManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class GameService {

    private static final Logger logger = LoggerFactory.getLogger(GameService.class);

    private String[][] board;
    private String playerSide;
    private String machineSide;

    @Autowired
    private EmbeddedCacheManager cacheManager;

    void startGame(String side){

        logger.info("starting the game");

        board = new String[3][3];  for(int row = 0; row<3; row++){
            for(int col = 0; col<3; col++){
                board[row][col] = " ";
            }
        }



        this.playerSide = side;

        if("X".equals(playerSide)){
            machineSide = "O";
        }else {
            machineSide = "X";
            moveAI();
        }



    }

    public void move(String row,String col){
        validateMove(row,col);

        if(hasMoves())
            board[Integer.parseInt(row)][Integer.parseInt(col)] = playerSide;
        if ("In progress".equals(checkWinner()) && hasMoves())
            moveAI();
    }

    public StartResponse showBoard(){
        StartResponse response = StartResponse.newBuilder().setNum(" 0   1   2 ")
                .setA("A  "+board[0][0]+" | "+board[0][1]+"  | "+board[0][2]+"  ")
                .setAL("  ------------")
                .setB("B  "+board[1][0]+" | "+board[1][1]+"  | "+board[1][2]+"  ")
                .setBL("  ------------")
                .setC("C  "+board[2][0]+" | "+board[2][1]+"  | "+board[2][2]+"  ")
                .setResult(checkWinner())
                .build();

        return response;
    }

    public String checkWinner()
    {
        for (int a = 0; a < 8; a++) {
            String line = null;

            switch (a) {
                case 0:
                    line = board[0][0] + board[0][1] + board[0][2];
                    break;
                case 1:
                    line = board[1][0] + board[1][1] + board[1][2];
                    break;
                case 2:
                    line = board[2][0] + board[2][1] + board[2][2];
                    break;
                case 3:
                    line = board[0][0] + board[1][0]  + board[2][0];
                    break;
                case 4:
                    line = board[0][1] + board[1][1] + board[2][1];
                    break;
                case 5:
                    line = board[0][2] + board[1][2] + board[2][2];
                    break;
                case 6:
                    line = board[0][0] + board[1][1] + board[2][2];
                    break;
                case 7:
                    line = board[0][2] + board[1][1] + board[2][0];
                    break;
            }
            //For X winner
            if (line.equals("XXX")) {
                return "X Wins";
            }

            // For O winner
            else if (line.equals("OOO")) {
                return "O Wins";
            }
        }


        return "In progress";
    }


    private void moveAI(){
        Random random = new Random();
        int row;
        int col;
        do{
            row = random.nextInt(3);
            col = random.nextInt(3);
            logger.info("in while loop");
            logger.info(board[row][col]);
        }
        while (!" ".equals(board[row][col]));

        board[row][col] = machineSide;
    }

    private boolean hasMoves(){
        for(int row = 0; row<3; row++){
            for(int col = 0; col<3; col++){
                if(" ".equals(board[row][col]))
                    return true;
            }
        }
        return false;
    }

    private void validateMove(String row, String col){
       int numRow = Integer.parseInt(row);
       int numCol = Integer.parseInt(col);

       if(numRow >= 0 && numRow < 3 && numCol >= 0 && numCol < 3 ){
           if(" ".equals(board[numRow][numCol])){
               return;
           }
       }
       throw new IllegalArgumentException("Illegal move, try again");
    }
}
