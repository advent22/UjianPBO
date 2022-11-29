package com.mycompany.ujianpraktekobjek;
import java.util.Arrays;
public class ChildProduk implements InterfaceProduk{
    public int[][] numbers = {
        {1,2,3,4,5},
    {6,7,8,9,10}            
    };
    
    public void getNumbers(){
        for(int i = 0; i <  numbers.length; i++){
            for(int x = 0; x < numbers[i].length; x++){
            System.out.println(i + "");    
            }
        }
    }
    public static void main(String[]args){
        ChildProduk obj = new ChildProduk();
        obj.getNumbers();
    }
}
