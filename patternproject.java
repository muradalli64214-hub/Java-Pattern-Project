import javax.swing.*;
public class patternproject
{
    void SquarePattern()
    {
        System.out.println("---------- Square Pattern ---------\n");
        int i, j;
        for ( i = 1 ; i <= 5 ; i++){
            for ( j = 1 ; j <= 5 ; j++){
                System.out.print("X ");
            }
            System.out.println();
        }
    }
    void Tringle()
    {
        System.out.println("---------- Tringle Pattern ----------");
        int i , j , k;
        for( i = 1 , k = 4 ;  i <= 5 ; i++ , k--){
            for( j = 1 ; j <= 5 ; j++){
                System.out.print((j<=k)?" ":"X ");
            }
            System.out.println();
        }
    }
    void LeftTringlePattern()
    {
          System.out.println("---------- Left Tringle Pattern ----------");
        int i , j;
        for( i = 1 ;  i <= 5 ; i++){
            for( j = 1 ; j <= i ; j++){
                System.out.print("X ");
            }
            System.out.println();
        }
    }
    void rightTringlePattern()
    {
        
        System.out.println("---------- Right Tringle Pattern ----------");
        int i , j , k;
        for( i = 1 , k = 4  ;  i <= 5 ; i++ , k--){
            for( j = 1 ; j <= 5 ; j++){
                System.out.print((j<=k)?"  ":"X ");
            }
            System.out.println();
        }
        
    }
    void InverseLeftTringlePattern()
    {
        
        System.out.println("---------- Inverse-Left Tringle Pattern ----------");
        int i , j , k;
        for( i = 1 , k = 5  ;  i <= 5 ; i++ , k--){
            for( j = 1 ; j <= 5 ; j++){
                System.out.print((j<=k)?"X ":"  ");
            }
            System.out.println();
        }
    }
    void InverseRightTringlePattern()
    {
       
        System.out.println("---------- Inverse-Right Tringle Pattern ----------");
        int i , j;
        for( i = 1  ;  i <= 5 ; i++){
            for( j = 1 ; j <= 5 ; j++){
                System.out.print((j<i)?"  ":"X ");
            }
            System.out.println();
        }
    }
    void EmptySquerPattern()
    {
        
         System.out.println("---------- Empty Squer Pattern ----------");
        int i , j ;
        for( i = 1 ;  i <= 5 ; i++){
            for( j = 1 ; j <= 5 ; j++){
                System.out.print(((i==1&&j<=5)||(j==1&&i<=5)||(i==5&&j<=5)||(j==5&&i<=5))?"X ":"  ");
            }
            System.out.println();
        }
    }
    void SquareFramewithCross()
    {
         
        System.out.println("---------- Square Frame with Cross ----------");
        int i , j ;
        for( i = 1 ;  i <= 9 ; i++){
            for( j = 1 ; j <= 9 ; j++){
                System.out.print(((i==1&&j<=9)||(j==1&&i<=9)||(i==9&&j<=9)||(j==9&&i<=9)||(i==j)||(i+j==10))?"X ":"  ");
            }
            System.out.println();
        }
    }
   void Boxwithcrosslines()
   {
          System.out.println("---------- Box with cross lines ----------");
        int i , j ;
        for( i = 1 ;  i <= 9 ; i++){
            for( j = 1 ; j <= 9 ; j++){
                System.out.print(((i==1&&j<=9)||(j==1&&i<=9)||(i==9&&j<=9)||(j==9&&i<=9)||(i==5||j==5))?"X ":"  ");
            }
            System.out.println();
        }
   }
   void BorderedXpattern()
   {
                System.out.println("---------- Bordered X pattern ----------");
        int i , j ;
        for( i = 1 ;  i <= 9 ; i++){
            for( j = 1 ; j <= 9 ; j++){
                System.out.print(((j==1&&i<=9)||(j==9&&i<=9)||(i==j)||(i+j==10))?"X ":"  ");
            }
            System.out.println();
        }
   }
   void XBarpattern()
   {
        System.out.println("---------- X-Bar pattern ----------");
        int i , j ;
        for( i = 1 ;  i <= 9 ; i++){
            for( j = 1 ; j <= 9 ; j++){
                System.out.print(((i==1&&j<=9)||(i==9&&j<=9)||(i==j)||(i+j==10))?"X ":"  ");
            }
            System.out.println();
        }
   }
   void Starinabox()
   {
                System.out.println("---------- Star in a box ----------");
        int i , j ;
        for( i = 1 ;  i <= 9 ; i++){
            for( j = 1 ; j <= 9 ; j++){
                System.out.print(((i==1&&j<=9)||(j==1&&i<=9)||(i==9&&j<=9)||(j==9&&i<=9)||(i+j==6)||(j-i==4)||(i-j==4)||(i+j==14))?"X ":"  ");
            }
            System.out.println();
        }
   }
   void Swastic()
   {
          System.out.println("---------- Swastic ----------");
        int i , j ;
        for( i = 1 ;  i <= 9 ; i++){
            for( j = 1 ; j <= 9 ; j++){
                System.out.print(((i==1&&j>=5)||(j==1&&i<=5)||(i==9&&j<=5)||(j==9&&i>=5)||(i==5||j==5))?"X ":"  ");
            }
            System.out.println();
        }
   }
   void KeyShape()
   {
        System.out.println("---------- Key Shape ----------");
        int i , j ;
        for( i = 1 ;  i <= 9 ; i++){
            for( j = 1 ; j <= 9 ; j++){
                System.out.print(((i==1&&j<=5)||(j==1&&i<=5)||(i==9&&j>=5)||(j==9&&i>=5)||(i==5&&j>=1)||(j==5&&i>=1))?"X ":"  ");
            }
            System.out.println();
        }
   }
   void MirroredHookcross()
   {
        System.out.println("---------- Mirrored Hook cross ----------");
        int i , j ;
        for( i = 1 ;  i <= 9 ; i++){
            for( j = 1 ; j <= 9 ; j++){
                System.out.print(((i==1&&j>=5)||(j==1&&i>=5)||(i==9&&j<=5)||(j==9&&i<=5)||(i==5&&j>=1)||(j==5&&i>=1))?"X ":"  ");
            }
            System.out.println();
        }
   }
   void HelloVpattern()
   {
          System.out.println("--------- Hello V pattern ---------");
         int i , j ,k ,l;
        for (i = 1 , l = 5 , k = 5 ; i <= 5 ; i++ , k-- ,l++){
            for (j = 1 ; j <= 9 ; j++){
                System.out.print((j<=5)?(j<=k)?"X ":"  ":(j>=l)?"X ":"  ");
            }
            System.out.println();
        }
   }
   void XStarpattern()
   {
        System.out.println("--------- X-Star pattern ---------");
       int i , j ;
        for( i = 1 ; i <= 9 ; i++){
        for ( j = 1 ; j <= 9 ; j++){
            System.out.print(((i+j==6)||(j-i==4)||(i-j==4)||(i+j==14))?"X ":"  ");
        }
        System.out.println();
       }
   }
   void KitePattern()
   {
        System.out.println("---------- Kite Pattern ---------\n");
         int i , j ;
         for(i = 1 ; i <= 16 ;i++)
         {
            for(j= 1  ; j <= 13 ; j++ )
            {
                System.out.print((i<=7)?((j+i==8)||(j-i==6)||(j==7&&i<=13)||(i==7&&j>=1))?"X ":"  ":(i<=16)?((i-j==6)||(i+j==20)||(j==7&&i<=13)||(i==16&&j>=5&&j<=9))?"X ":"  ":"  ");
            }
            System.out.println();
         }
   }
   void CubePattern()
   {
        System.out.println("---------- Cube Pattern ---------\n");
        int i, j;
        for ( i = 1 ; i <= 10 ; i++){
            for ( j = 1 ; j <= 10 ; j++){
                System.out.print((!(i==j&&i>=7))?((i==1&&j<=7)||(j==1&&i<=7)||(i==7&&j<=7)||(i<=7&&j==7))?"X ":(i>=4&&j>=4)?((i==4&&j>=4)||(i>=4&&j==4)||(i==10&&j>=4)||(i>=4&&j==10))?"X ":"  ":((i==j)||(i-j==7)||(j-i==6))?"X ":"  ":"X ");
            }
            System.out.println();
         }
   }
   void CubiedPattern()
   {
        System.out.println("---------- Cubied Pattern ---------\n");
         int i , j ;
         for(i = 1 ; i <= 15 ;i++)
         {
            for(j= 1  ; j <= 25 ; j++ )
            {
                System.out.print((i<=10)?(j<=20)?((i==1&&j>=1)||(j==1&&i>=1)||(j==20&&i>=1)||(i==10&&j>=1))?"X ":((i>=6&&j==5)||(i==6&&j>=5)||(i==j&&i<=6))?"X ":"  ":((i==6&&j<=25)||(j==25&&i>=6)||(j-i==20))?"X ":"  ":((j==5&&i<=15)||(j>=5&i==15)||(j==25&&i<=15)||(i-j==10)||(j-i==10))?"X ":"  ");
            }
            System.out.println();
         }
   }
    static void MainModule()
    {
        System.out.println("Pattern Generator");
        System.out.println("1. SquerPattern\t2.TringlePattern\t");
        System.out.println("3. Left Tringle Pattern\t4. right Tringle Pattern");
        System.out.println("5. Inverse-Left Tringle Pattern\t6.Inverse-Right Tringle Pattern");
        System.out.println("7. Empty Squer Pattern\t8. Square Frame with Cross");
        System.out.println("9. Box with cross lines\t10. Bordered X pattern ");
        System.out.println("11. X-Bar pattern\t12. Star in a box ");
        System.out.println("13. Swastic\t14.  Key Shape ");
        System.out.println("15. Mirrored Hook cross\t16. Hello V pattern ");
        System.out.println("17. X-Star pattern\t18. Kite Pattern");
        System.out.println("19. Cube Pattern\t20. Cubied Pattern");
        String c;
        System.out.println("Choose any one of them....");
        c = JOptionPane.showInputDialog("Enter Your Choice --- ");
        patternproject p = new patternproject();
        if (c.equals("1")){
            p.SquarePattern();
        }
        else if (c.equals("2")){
            p.Tringle();
        }
        else if (c.equals("3")){
            p.LeftTringlePattern();
        }
         else if (c.equals("4")){
            p.rightTringlePattern();
        }
         else if (c.equals("5")){
            p.InverseLeftTringlePattern();
        }
         else if (c.equals("6")){
            p.InverseRightTringlePattern();
        }
         else if (c.equals("7")){
            p.EmptySquerPattern();
        }
        else if (c.equals("8")){
            p.SquareFramewithCross();
        }
         else if (c.equals("9")){
            p.Boxwithcrosslines();
        }
         else if (c.equals("10")){
            p.BorderedXpattern();
        }
         else if (c.equals("11")){
            p.XBarpattern();
        }
         else if (c.equals("12")){
            p.Starinabox();
        }
         else if (c.equals("13")){
            p.Swastic();
        }
         else if (c.equals("14")){
            p.KeyShape();
        }
         else if (c.equals("15")){
            p.MirroredHookcross();
        }
         else if (c.equals("16")){
            p.HelloVpattern();
        }
         else if (c.equals("17")){
            p.XStarpattern();
        }
         else if (c.equals("18")){
            p.KitePattern();
        }
         else if (c.equals("19")){
            p.CubePattern();
        }
         else if (c.equals("20")){
            p.CubiedPattern();
        }
        System.out.println("\nDo you want to continue.. Press 1 else any key");
        c = JOptionPane.showInputDialog("Enter Your Choice --- ");
        if (c.equals("1")){
            MainModule();
        }
    }
    public static void main(String args[]){
        MainModule();
    }
}