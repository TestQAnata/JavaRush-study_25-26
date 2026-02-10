//package JavaSyntax.ModuleOne.Games.minesweeper;
//
//package com.javarush.games.minesweeper;
//
//import com.javarush.engine.cell.Color;
//import com.javarush.engine.cell.Game;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class MinesweeperGame extends Game {
//    private static final int SIDE = 9;
//    private static final String MINE = "\uD83D\uDCA3";
//    private static final String FLAG = "\uD83D\uDEA9";
//    private GameObject[][] gameField = new GameObject[SIDE][SIDE];
//    private int countMinesOnField;
//    private int countFlags;
//    private int countClosedTiles = SIDE * SIDE;
//    private int score;
//    private boolean isGameStopped;
//
//
//    @Override
//    public void initialize() {
//        setScreenSize(SIDE, SIDE);
//        createGame();
//    }
//
//    @Override
//    public void onMouseLeftClick(int x, int y){
//        if (isGameStopped == true){
//            restart();
//        }
//        else{
//            openTile(x, y);
//        }
//    }
//
//    @Override
//    public void onMouseRightClick(int x, int y){
//        markTile(x, y);
//    }
//
//    private void createGame() {
//
//        for (int y = 0; y < SIDE; y++) {
//            for (int x = 0; x < SIDE; x++) {
//                setCellValue(x, y, "");
//                boolean isMine = getRandomNumber(10) < 1;
//                if (isMine) {
//                    countMinesOnField++;
//                }
//                gameField[y][x] = new GameObject(x, y, isMine);
//                setCellColor(x, y, Color.ORANGE);
//            }
//        }
//        countFlags = countMinesOnField;
//        countMineNeighbors();
//    }
//
//    private List<GameObject> getNeighbors(GameObject gameObject) {
//        List<GameObject> result = new ArrayList<>();
//        for (int y = gameObject.y - 1; y <= gameObject.y + 1; y++) {
//            for (int x = gameObject.x - 1; x <= gameObject.x + 1; x++) {
//                if (y < 0 || y >= SIDE) {
//                    continue;
//                }
//                if (x < 0 || x >= SIDE) {
//                    continue;
//                }
//                if (gameField[y][x] == gameObject) {
//                    continue;
//                }
//                result.add(gameField[y][x]);
//            }
//        }
//        return result;
//    }
//
//    private void countMineNeighbors(){
//        for (int y = 0; y < SIDE; y++) {
//            for (int x = 0; x < SIDE; x++) {
//                if (gameField[y][x].isMine) {
//                    continue;
//                }
//                if (!gameField[y][x].isMine){
//                    List<GameObject> neighbors = getNeighbors(gameField[y][x]);
//
//                    int mineCount = 0;
//                    for(GameObject neighbor : neighbors){
//                        if (neighbor.isMine){
//                            mineCount++;
//                        }
//                    }
//                    gameField[y][x].countMineNeighbors = mineCount;
//                }
//            }
//        }
//    }
//
//    private void openTile(int x, int y){
//        if(x < 0 || x >= SIDE || y < 0 || y >= SIDE){
//            return;
//        }
//        if (isGameStopped){
//            return;
//        }
//        GameObject cell = gameField[y][x];
//        if (cell.isOpen){
//            return;
//        }
//        if (cell.isFlag){
//            return;
//        }
//
//        cell.isOpen = true;
//        countClosedTiles--;
//
//        if (cell.isMine) {
//            setCellValueEx(x, y, Color.RED, MINE, Color.BLACK, 75);
//            gameOver();
//            return;
//        }
//
//        else{
//            score += 5;
//            setScore(score);
//
//            if (countClosedTiles == countMinesOnField){
//                win();
//                return;
//            }
//
//            setCellColor(x, y, Color.GREEN);
//
//            if(cell.countMineNeighbors > 0){
//                setCellNumber(x, y, cell.countMineNeighbors);
//            }
//            else{
//                setCellValue(x, y, "");
//                List<GameObject> neighbors = getNeighbors(cell);
//                for (GameObject neighbor : neighbors) {
//                    openTile(neighbor.x, neighbor.y);
//                }
//            }
//        }
//    }
//
//    private void markTile (int x, int y){
//        if(x < 0 || x >= SIDE || y < 0 || y >= SIDE){
//            return;
//        }
//        if (isGameStopped){
//            return;
//        }
//        GameObject cell = gameField[y][x];
//        if (cell.isOpen){
//            return;
//        }
//
//        if (!cell.isFlag){
//            if(countFlags == 0){
//                return;
//            }
//            cell.isFlag = true;
//            countFlags--;
//            setCellValue(x, y, FLAG);
//            setCellColor(x, y, Color.YELLOW);
//        }
//        else{
//            cell.isFlag = false;
//            countFlags++;
//            setCellValue(x, y, "");
//            setCellColor(x, y, Color.ORANGE);
//        }
//    }
//
//    private void gameOver(){
//        isGameStopped = true;
//        showMessageDialog(Color.RED, "ИГРА ОКОНЧЕНА", Color.BLACK, 50);
//
//    }
//
//    private void win(){
//        isGameStopped = true;
//        showMessageDialog(Color.GREEN, "ПОБЕДА!", Color.BLACK, 50);
//    }
//
//    private void restart(){
//        isGameStopped = false;
//        countClosedTiles = SIDE * SIDE;
//        score = 0;
//        countMinesOnField = 0;
//        setScore(score);
//        createGame();
//    }
//}