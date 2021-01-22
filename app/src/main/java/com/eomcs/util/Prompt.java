package com.eomcs.util;

import java.sql.Date;
import java.util.Scanner;


// 패키지 소속 클래스 = top level class
//  공개 다른 패키지 사용 가능
//  비공개 같은 패키지인 경우만 사용가능
public class Prompt {

 static Scanner keyboardScan = new Scanner(System.in);

 
 
 public static String inputString(String title) {
    System.out.print(title);
    return keyboardScan.nextLine();
  }

 public static int inputInt(String title) {
    return Integer.parseInt(inputString(title));
  }

 public static Date inputDate(String title) {
    return Date.valueOf(inputString(title));
  }

 public static void close() {
    keyboardScan.close();
  }
}
