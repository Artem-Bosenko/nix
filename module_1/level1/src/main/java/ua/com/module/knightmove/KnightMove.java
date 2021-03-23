package ua.com.module.knightmove;

public class KnightMove {

    public static boolean isKnightMoveReal(int positionX, int positionY, int predicatePositionX, int predicatePositionY) {

        if (((Math.abs(positionX - predicatePositionX) == 2) && (Math.abs(positionY - predicatePositionY) == 1)) ||
                ((Math.abs(positionX - predicatePositionX) == 1) && (Math.abs(positionY - predicatePositionY) == 2))) {
            System.out.println("Ход конём возможен");
            return true;
        } else {
            System.out.println("Невозможно выполнить ход. Возможные варианты хода:");
            System.out.println("A) [" + (positionX - 2) + ";" + (positionY - 1) + "]");
            System.out.println("B) [" + (positionX - 2) + ";" + (positionY + 1) + "]");
            System.out.println("C) [" + (positionX - 1) + ";" + (positionY + 2) + "]");
            System.out.println("D) [" + (positionX + 1) + ";" + (positionY + 2) + "]");
            System.out.println("E) [" + (positionX + 2) + ";" + (positionY + 1) + "]");
            System.out.println("F) [" + (positionX + 2) + ";" + (positionY - 1) + "]");
            System.out.println("G) [" + (positionX + 1) + ";" + (positionY - 2) + "]");
            System.out.println("H) [" + (positionX - 1) + ";" + (positionY - 2) + "]");
            return false;
        }


    }
}
