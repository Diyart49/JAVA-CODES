//TO FIND UNIQUE ELEMENTS IN A MATRIX OF ORDER nXn
import java.util.*;
class UniqueEle{
  public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter row size");
    int a = sc.nextInt();
    System.out.println("Enter column size");
    int b=sc.nextInt();
    for (int i=0;i<a;i++){
      for (int j=0;j<b;j++){
        if (matrix[i][j]>max){
          max=matrix[i][j];
        }
      }
    }
    matrix[0][0]=max;
    for(i=0;i<a;i++){
      for (j=0;j<b;j++){
        if (matrix[i][j]>max){
          max=matrix[i][j];
        }
      }
    }
    int arr[]=new int[max]:
    for (i=0;i<a;i++){
      for (j=0;j<b;j++){
        arr(matrix[i][j])++;
      }
    }
    for (i=0;i-max;i++){
      if (arr[i]==1){
        System.out.print(i+" ");
      }
    }
  }
