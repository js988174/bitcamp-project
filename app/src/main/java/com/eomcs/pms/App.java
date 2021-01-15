package com.eomcs.pms;
import java.sql.Date;
import java.util.Scanner;

// 1) 낱개의 변수를 사용하여 여러 회원 정보 처리하기
// 2) 조건문을 사용하여 입출력 제어하기
// - 필요한 만큼만 입력 받고 출력하고 싶다.
// 3) 배열을 사용하여 여러 개의 값을 다루기
// - 배열을 사용하면 간단하게 여러 개의 변수를 선언할 수 있다.
// 4) 반복문을 사용하여 여러 개의 값을 다루기
// - 반복문을 사용하면 같은 코드를 중복해서 작성할 필요가 없다.
// 5) 배열 개수를 변수에서 관리하기
// - 변수의 값만 바꾸면 배열 개수를 바로 변경할 수 있어 편하다.
// 6) 상수를 사용하여 초기 값을 변경하지 못하게 막기
// - 변수는 중간에 값을 바꿀 수 있기 때문에 값을 바꾸지 말아야 하는 경우
//   상수로 선언한다.
public class App {

  public static void main(String[] args) {
    System.out.println("[회원]");

    Scanner scanner = new Scanner(System.in);
    final int SIZE = 100;
    // 회원 등록
    String[] number = new String[SIZE];
    String[] name = new String[SIZE];
    String[] email = new String[SIZE];
    String[] ps = new String[SIZE];
    String[] pi = new String[SIZE];
    String[] ph = new String[SIZE];
    Date[] now = new Date[SIZE];
    int size = 0;
    final int SIZE1 = 100;
    String[] number1 = new String[SIZE];
    String[] name1 = new String[SIZE];
    String[] email1 = new String[SIZE];
    String[] ps1 = new String[SIZE];
    String[] pi1 = new String[SIZE];
    String[] ph1= new String[SIZE];
    Date[] now1 = new Date[SIZE];
    int size1 = 0;

    final int SIZE2 = 100;

    int[] number2 = new int[SIZE2];
    String[] content2 = new String[SIZE2];
    String[] deadline2 = new String[SIZE2];
    String[] name2 = new String[SIZE2];
    int[] status2 = new int[SIZE2];

    int size2 = 0;
    loop:  
      while(true) {
        System.out.println("명령> ");
        String command = scanner.nextLine();

        switch (command) {
          case "member/add/" :
            System.out.println("[회원 등록]");
            System.out.print("번호: ");
            number [size] = scanner.nextLine();

            System.out.print("이름: ");
            name [size] = scanner.nextLine();

            System.out.print("이메일: ");
            email [size] = scanner.nextLine();

            System.out.print("암호: ");
            ps [size] = scanner.nextLine();

            System.out.print("사진: ");
            pi [size] = scanner.nextLine();

            System.out.print("전화: ");
            ph [size] = scanner.nextLine();

            now [size] = new java.sql.Date(System.currentTimeMillis());
            size++;
            break;
          case "member/list/" : 
            System.out.println("[회원 목록]");
            for (int i = 0; i < SIZE; i++) {
              System.out.printf("%s, %s, %s, %s, %s, %s\n" ,number[i] , email[i] , ps[i], pi[i] , ph[i] ,now[i]);
              break;
            }
          case "project/add/" :
            System.out.println("[프로젝트 등록]");
            System.out.print("번호: ");
            number [size1] = scanner.nextLine();

            System.out.print("이름: ");
            name1 [size1] = scanner.nextLine();

            System.out.print("이메일: ");
            email1 [size1] = scanner.nextLine();

            System.out.print("암호: ");
            ps1 [size1] = scanner.nextLine();

            System.out.print("사진: ");
            pi1 [size1] = scanner.nextLine();

            System.out.print("전화: ");
            ph1 [size1] = scanner.nextLine();

            now [size1] = new java.sql.Date(System.currentTimeMillis());
            size1++;
            break;
          case "project/list/" : 
            System.out.println("[프로젝트 목록]");
            for (int i = 0; i < SIZE1; i++) {
              System.out.printf("%s, %s, %s, %s, %s, %s\n" ,number1[i] , email1[i] , ps1[i], pi1[i] , ph1[i] ,now1[i]);
              break;
            }
          case "task/add/" :
            System.out.println("[작업 등록]");

            System.out.print("번호? ");
            number[size2] = scanner.nextLine();

            System.out.print("내용? ");
            content2[size2] = scanner.nextLine();

            System.out.print("마감일? ");
            deadline2[size2] = scanner.nextLine();

            System.out.println("상태?");
            System.out.println("0: 신규");
            System.out.println("1: 진행중");
            System.out.println("2: 완료");
            System.out.print("> ");
            status2[size2] = Integer.valueOf(scanner.nextLine());

            System.out.print("담당자? ");
            name2[size2] = scanner.nextLine();

            size2++;
            break;
          case "/task/list":
            System.out.println("[작업 목록]");

            for (int i = 0; i < size2; i++) {
              String stateLabel = null;
              switch (status2[i]) {
                case 1:
                  stateLabel = "진행중";
                  break;
                case 2:
                  stateLabel = "완료";
                  break;
                default:
                  stateLabel = "신규";
              }

              System.out.printf("%d, %s, %s, %s, %s\n", 
                  number2[i], content2[i], deadline2[i], stateLabel, name2[i]);
            }
            break;
          case "quit" :
          case "exit" :
            System.out.println("안녕");
            break loop;
          default:
            System.out.println("실행할 수 없는 명령입니다.");
        }
      }
    scanner.close();
  }
}



