/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.eomcs.pms;
import java.util.Scanner;
public class App3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.printf("[%s]\n", "작업" );
    System.out.printf("프로젝트:  ");
    String pro = scanner.nextLine();
    System.out.printf("번호:  ");
    int number = scanner.nextInt();
    scanner.nextLine();
    System.out.printf("내용:  ");
    String content = scanner.nextLine();
    System.out.printf("완료일: ");
    int deadline = scanner.nextInt();
    System.out.println("상태: " );
    System.out.println("o: 신규");
    System.out.println("1: 진행중");
    System.out.println("2: 완료");
    int status = Integer.valueOf(scanner.nextInt());

    scanner.nextLine();
    System.out.printf("담당자: " );
    String name = scanner.nextLine();



    scanner.close();
    System.out.printf("프로젝트: %s\n" ,pro);
    System.out.printf("번호: %s\n" ,number);
    System.out.printf("내용: %s\n", content);
    System.out.printf("완료일: %s\n",deadline);

    switch (status) {
      case 1:
        System.out.println("진행중");
        break;
      case 2:
        System.out.println("완료");
        break;
      default:
        System.out.println("신규");

    }
    System.out.printf("담당자: %s\n",name);
  }
}