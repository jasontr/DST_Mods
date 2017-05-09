import java.util.Scanner;

class eightQ {
  int[][] xy = new int[8][2];

  public void main(String[] args){
    String sc = new Scanner(System.in);
    int x0 = sc.nextInt();
    int y0 = sc.nextInt();
    xy[0][] = {x0, y0};
  }

  public boolean judge(int x, int y){
    for (int i = 0; i <= y; i++) {
      x_ = Math.abs(xy[i][0] - x);
      y_ = Math.abs(xy[i][1] - y);
      if (x_ != 0 && y_ != 0 && x_ != y_) {
        return true;
      } else {
        return false;
      }
    }
  }

  public boolean search(int f) {
    boolean flag = false;
    for(int i = 0; i < 8; i++){
      if(judge(f, i)) {
        if(search(f+1)){
          flag = true;
          xy[f][0] = i;
          xy[f][1] = f;
          break;
        }
      }
    }
    return flag;
  }
}
