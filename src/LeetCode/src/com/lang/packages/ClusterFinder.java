package com.lang.packages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClusterFinder
{
    public static void main(String args[]) {
        //System.out.println("hello world");
        List<List<Integer>> grid = new ArrayList<List<Integer>>();

//        List<Integer> temp = Arrays.asList(1,1,0,0);
//        grid.add(temp);
//        temp = Arrays.asList(0,0,1,0);
//        grid.add(temp);
//        temp = Arrays.asList(0,0,0,0);
//        grid.add(temp);
//        temp = Arrays.asList(1,0,1,1);
//        grid.add(temp);
//        temp = Arrays.asList(1,1,1,1);
//        grid.add(temp);

        List<Integer> temp = Arrays.asList(1,0,0,0,0,0,0);
        grid.add(temp);
        temp = Arrays.asList(0,1,0,0,0,0,0);
        grid.add(temp);
        temp = Arrays.asList(0,0,1,0,0,0,0);
        grid.add(temp);
        temp = Arrays.asList(0,0,0,1,0,0,0);
        grid.add(temp);
        temp = Arrays.asList(0,0,0,0,1,0,0);
        grid.add(temp);
        temp = Arrays.asList(0,0,0,0,0,1,0);
        grid.add(temp);
        temp = Arrays.asList(0,0,0,0,0,0,1);
        grid.add(temp);
        System.out.println("Result: " + getNumOfClusters(7,7, grid));
    }

    public static int getNumOfClusters(int rows, int cols, List<List<Integer>> grid) {
        int[][] gridArray= new int[rows][cols];
        int i=0;
        int j=0;
        for(List<Integer> l: grid) {
            for(int val: l){
                gridArray[i][j] = val;
                j++;
            }
            j=0;
            i++;
        }

        int cluser=0;
        boolean scanned = false;
        int x=0, y=0;
        for(;x<gridArray.length;x++){
            for(y=0;y<gridArray[0].length;y++){
                int r = scan(x,y,gridArray);
                if(r == 1) {
                    cluser++;
                }
            }
        }

        return cluser;
    }

    public static int scan(int x, int y, int[][] gridArray) {
        if (gridArray[x][y] == 1) {
            gridArray[x][y] = -1;
            if(x>0){
                scan(x-1,y, gridArray);
            }
            if(x<gridArray.length-1){
                scan(x+1, y,gridArray);
            }
            if(y<gridArray[0].length-1){
                scan(x,y+1, gridArray);
            }
            if(y>0){
                scan(x,y-1, gridArray);
            }
            return 1;

        }else if (gridArray[x][y] == 0) {
            gridArray[x][y] = -1;
        }
        return -1;
    }
}
