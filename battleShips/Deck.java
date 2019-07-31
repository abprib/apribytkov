package Lessons.battleShips;

class Deck{
  int x = 0;
  int y = 0;
  char condition = '.';
  void setCoordinate(int x, int y){
    this.x = x;
    this.y = y;
  }
  void setCondition(char condition){
    this.condition = condition;
  }
  int getX(){
    return this.x;
  }
  int getY(){
    return this.y;
  }

}