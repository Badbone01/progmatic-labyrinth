package com.progmatic.labyrinthproject.Players;

import com.progmatic.labyrinthproject.enums.Direction;

import static com.progmatic.labyrinthproject.enums.Direction.*;

import com.progmatic.labyrinthproject.interfaces.Labyrinth;
import com.progmatic.labyrinthproject.interfaces.Player;


public class RandomPlayer implements Player {

    @Override
    public Direction nextMove(Labyrinth l) {
        if (l.hasPlayerFinished()) {
            return null;
        }


        Direction direction = null;


        switch ((int) (Math.random() * 4)) {
            case 0:
                direction = NORTH;
                break;
            case 1:
                direction = WEST;
                break;
            case 2:
                direction = SOUTH;
                break;
            case 3:
                direction = EAST;
                break;
        }
        if (l.possibleMoves().contains(direction)) {
            return direction;
        }

        return direction;
    }

}



