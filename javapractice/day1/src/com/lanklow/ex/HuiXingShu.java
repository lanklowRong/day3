package com.lanklow.ex;

/**
 * @Author: rongfahua
 * @Date: 2022/11/01/13:42
 * @Description:
 */
import java.util.Scanner;

public class HuiXingShu {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[][]arr=new int[n][n];
        int cnt=0;
        int minX=0;
        int minY=0;
        int maxX=n-1;
        int maxY=n-1;
        while(minY<=maxY){
            for(int x=minX;x<=maxX;x++){
                arr[minY][x]=++cnt;
            }
            minY++;
            for(int y=minY;y<=maxY;y++){
                arr[y][maxX]=++cnt;
            }
            maxX--;
            for(int x=maxX;x>=minX;x--){
                arr[maxY][x]=++cnt;
            }
            maxY--;
            for(int y=maxY;y>=minY;y--){
                arr[y][minX]=++cnt;
            }
            minX++;
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}
