package JavaSyntax.JavaSyntax.ModuleOne.minesweeper;

import com.javarush.engine.cell.*;


public class MinesweeperGame extends Game {
    private static final int SIDE = 9; // Размер поля 9x9
    // Переменные состояния игры
    private GameObject[][] gameField;//Объявляем матрицу(двумерный массив) для хранения игровых объектов


    //Создаём метод
    private void createGame(){//здесь будем создавать игровое поле
        gameField = new GameObject[SIDE][SIDE];

        for (int y = 0; y < SIDE; y++){
            for (int x = 0; x < SIDE; x++){
                gameField[y][x] = new GameObject(x,y);

                setCellColor(x, y, Color.ORANGE);
            }
        }

    }

    @Override
    public void initialize() {
        // 1. Вызываем метод initialize() родительского класса
        super.initialize();

        // 2. Задаем размер игрового поля
        setScreenSize(SIDE, SIDE);

        //3.Вызываем метод для создания игры
        createGame();
    }

}
