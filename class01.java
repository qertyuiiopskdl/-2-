import java.util.Scanner;
public class class01{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    for(int times=0; times<3; times++) {
        System.out.println("��J�K�X����:");
        System.out.println("�п�J�K�X:");
        String pwd1 = sc.next();
        System.out.println("�ЦA�@����J�K�X:");
        String pwd2 = sc.next();
        if(pwd1.equals(pwd2)) {
          System.out.println("�K�X���T");
          return;
        }
        else if(pwd1 != pwd2) {
        	System.out.println("�K�X�P�Ĥ@����J���P");
        }
    }
    System.out.println("��J�T�����~�I�{������I");
  }
}