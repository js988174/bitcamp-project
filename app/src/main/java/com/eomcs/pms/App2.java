/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.eomcs.pms;
import java.util.Scanner;
public class App2 {
  public static void main(String[] args) {
    System.out.println("작업");
    Scanner scanner = new Scanner(System.in);
    System.out.println("번호: ");
    int number = scanner.nextInt();
    scanner.nextLine();
    System.out.println("프로젝트: ");
    String pro = scanner.nextLine();
    System.out.println("내용: ");
    String content = scanner.nextLine();
    System.out.println("시작일: ");
    int st = scanner.nextInt();
    System.out.println("종료일: ");
    int sd = scanner.nextInt();
    scanner.nextLine();
    System.out.println("만든이: ");
    String name = scanner.nextLine();
    System.out.println("팀원: ");
    String teamname = scanner.nextLine();

    scanner.close();

    System.out.println("--------------------");
    System.out.printf("번호: %d\n" ,number);
    System.out.printf("프로젝트: %d\n" ,pro);
    System.out.printf("내용: %d\n" ,content);
    System.out.printf("시작일: %d\n" ,st);
    System.out.printf("종료일: %d\n" ,sd);
    System.out.printf("만든이: %d\n" ,name);
    System.out.printf("팀원: %d\n" ,teamname);
  }
}