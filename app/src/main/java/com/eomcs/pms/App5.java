/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.eomcs.pms;
import java.util.Scanner;
public class App5 {
  public static void main(String[] args) {
    System.out.println("[프로젝트]");
    Scanner scanner = new Scanner(System.in);
    final int SIZE = 100;


    int[] number = new int[SIZE];
    String[] pro = new String[SIZE];
    String[] content = new String[SIZE];
    String[] st = new String [SIZE];
    String[] sd = new String[SIZE];
    String[] name = new String[SIZE];
    String[] teamname = new String[SIZE];

    int count = 0;
    for (int i =0; i < SIZE; i++) {
      System.out.println("번호: ");
      number[i] = scanner.nextInt();

      scanner.nextLine();
      System.out.println("프로젝트명: ");
      pro[i] = scanner.nextLine();

      System.out.println("내용: ");
      content[i] = scanner.nextLine();

      System.out.println("시작일: ");
      st[i] = scanner.nextLine();

      System.out.println("종료일: ");
      sd[i] = scanner.nextLine();

      System.out.println("만든이: ");
      name[i] = scanner.nextLine();

      System.out.println("팀원: ");
      teamname[i] = scanner.nextLine();

      count++;
      System.out.println("");

      System.out.println("계속 입력하시겠습니까?(y/n) ");
      String str = scanner.nextLine();
      if (str.equalsIgnoreCase("n")) {
        break;
      }
      System.out.println("");
    }
    scanner.close();

    System.out.println("--------------------");
    for (int i = 0; i < count; i++) {
      System.out.printf("%d , %s , %s , %s , %s , %s " ,number[i] , pro[i] , content[i] , st[i] , sd[i] 
          ,name[i] , teamname[i]);

    }
  }
}
