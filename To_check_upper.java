import java.util.*:
class CheckUpper{
public static void main(String args[]){
  Scanner sc=new Scanner (System.in);
  System.out.println("Enter.row-size");
  int a=sc.nextInt();
  System.out.println("Enter column size");
  int b=sc.nextInt();
  intcheck=1;
  if (a!=b){
  System.out.println("It should be Square Matrix");-
  return;
  int arr[][] = new int [a][b];
  for (int i=0;i<a;i++){
    for (int j=0;j<b;j++){
      arr[i][j]=sc.nextIntO);
    }
  }
  for (int i=1;i<a;i++){
    for (int j=0; j<i;j++){
      if (arr[i][j]!=0){
        System.out.println("No");
        check=0;
        return;
      }
    }
  }
if (check==1){
  System.out.println("Yes");
}
  }
}
