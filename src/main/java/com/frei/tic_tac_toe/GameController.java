package com.frei.tic_tac_toe;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

@GrpcService
public class GameController extends TictactoeServiceGrpc.TictactoeServiceImplBase{

    @Autowired
    GameService gameService;



    private static final Logger logger = LoggerFactory.getLogger(GameController.class);

    @Override
    public void startGame(StartRequest request, StreamObserver<StartResponse> responseObserver){

        gameService.startGame(request.getSide().toUpperCase());

        StartResponse response = gameService.showBoard();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void makeMove(MoveRequest request, StreamObserver<StartResponse> responseObserver){

        logger.info("Your move was col, "+ request.getCol() +" row: "+ request.getRow());

        gameService.move(request.getRow(),request.getCol());
        StartResponse response = gameService.showBoard();


        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }


}
