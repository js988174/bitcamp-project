package com.eomcs.pms;

import java.util.Scanner;

public class App7 {
  /*헬스장 pt 회원 관리 
[ 회원 가입]
아이디 회원 번호 이름 전화 주소 생일 직업 성별 이메일 등록 기간 만료기간 
[관리자 모드]
[회원 조회]
아이디 회원 번호 이름 전화 주소 생일 직업 성별 이메일 등록 기간 만료기간 
[pt신청 회원]
pt 횟수 
pt전 bmi pt후 bmi 
자바 프로젝트 생성하기 
[회원 기간 늘리기] << 시간 되면 하기
[회원 삭제]
   * 
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final int MEMBER = 100;
    String[] id = new String[MEMBER];
    String[] number = new String[MEMBER];
    String[] name = new String[MEMBER];
    String[] phone = new String[MEMBER];
    String[] adress = new String[MEMBER];
    String[] birth = new String[MEMBER];
    String[] job = new String[MEMBER];
    String[] gender = new String[MEMBER];
    String[] email = new String[MEMBER];
    String[] speriod = new String[MEMBER];
    String[] fperiod = new String[MEMBER];

    int size = 0;

    while(true) {
      System.out.println("1. 신규 회원 2. 기존 회원 3. 관리자 모드");
      int command = scanner.nextInt();

      if(command == 1) {
        System.out.println("id");
        id[MEMBER] = scanner.nextLine();

        System.out.println("회원 번호: ");
        System.out.println("> ");
        number[MEMBER] = scanner.nextLine();

        System.out.println("회원 이름: ");
        System.out.println("> ");
        name[MEMBER] = scanner.nextLine();

        System.out.println("전호 번호: ");
        System.out.println("> ");
        phone[MEMBER] = scanner.nextLine();

        System.out.println("주소: ");
        System.out.println("> ");
        adress[MEMBER] = scanner.nextLine();

        System.out.println("생년 월일: ");
        System.out.println("> ");
        birth[MEMBER] = scanner.nextLine();

        System.out.println("직업: ");
        System.out.println("> ");
        job[MEMBER] = scanner.nextLine();
        gender[MEMBER] = scanner.nextLine();
        email[MEMBER] = scanner.nextLine();
        speriod[MEMBER] = scanner.nextLine();
        fperiod[MEMBER] = scanner.nextLine();
      }




      System.out.println("[회원 가입]");
    }

    scanner.close();
  }
}



