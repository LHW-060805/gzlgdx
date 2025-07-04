package GUI.Day2;

import java.util.Random;

public class gamedata {
    public  static int rows=6;
    public  static int cols=6;
    public static int[][] data=new int[rows+2][cols+2];
    public  gamedata(){
        inidata();
        shuffledata();
    }
    public void inidata(){
        for (int i = 0; i < rows+1; i++) {
            for (int j = 0; j < cols+1; j++) {
                data[i][j]=i%rows+1;
            }
        }
    }
    public void shuffledata(){
        Random random=new Random();
        for (int i = 0; i < rows*cols; i++) {
            int row1=random.nextInt(rows)+1;
            int cols1=random.nextInt(cols)+1;
            int row2=random.nextInt(rows)+1;
            int cols2=random.nextInt(cols)+1;
            int temp=data[row1][cols1];
            data[row1][cols1]=data[row2][cols2];
            data[row2][cols2]=temp;
        }
    }
}
