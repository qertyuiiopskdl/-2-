import java.util.Scanner;
public class class01{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    for(int times=0; times<3; times++) {
        System.out.println("輸入密碼測試:");
        System.out.println("請輸入密碼:");
        String pwd1 = sc.next();
        System.out.println("請再一次輸入密碼:");
        String pwd2 = sc.next();
        if(pwd1.equals(pwd2)) {
          System.out.println("密碼正確");
          return;
        }
        else if(pwd1 != pwd2) {
        	System.out.println("密碼與第一次輸入不同");
        }
    }
    System.out.println("輸入三次錯誤！程式停止！");
  }
}