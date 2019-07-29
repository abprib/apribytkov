package Lessons.tipToeGame;

class Field{
    char[][] cells = new char[3][3];

    public void initField(){
        for(int x = 0; x < 3; x++)
            for(int y = 0; y < 3; y++){
                this.cells[x][y] = '.';
            }
    }
    public void drawField(){
        System.out.println(" 012");
        for(int x = 0; x < 3; x++){
            System.out.print(x);
            for(int y = 0; y < 3; y++){
                System.out.print(this.cells[x][y]);
            }
            System.out.println("");
        }
    }
    public void changeCell(int x, int y, char c){
        this.cells[x][y] = c;
    }
}