Tic Tac Toe Game

This application is the  famous Tic Tac Toe (Noughts and Crosses Game) over gRPC.

This application consists of just 2  gRPC endpoint

1. StartGame

input: 
{
    "side": "X" // the side which the player wants to play as; side = "X" or "O"
}

Output:
{
    "num": " 0   1   2 ",
    "A": "A    |    |    ",
    "AL": "  ------------",
    "B": "B    |    |    ",
    "BL": "  ------------",
    "C": "C    |    |    ",
    "result": "In progress"
}

2. MakeMove

input: 
{
    "row":"0",  // row and column where the
    "col":"2",  // player wants to mark
}

Output:
{
    "num": " 0   1   2 ",
    "A": "A  O | X  | X  ",
    "AL": "  ------------",
    "B": "B  O | X  |    ",
    "BL": "  ------------",
    "C": "C  X | O  |    ",
    "result": "X Wins"
}