package com.eomcs.pms;

import com.eomcs.pms.handler.BoardHandler;
import com.eomcs.pms.handler.MemberHandler;
import com.eomcs.pms.handler.ProjectHandler;
import com.eomcs.pms.handler.TaskHandler;
import com.eomcs.util.Prompt;


// 1) Prompt 클래스를 별도의 패키지로 분류한다
//    - com.eomcs.util 패키지 생성
//    - Prompt 클래스를 이 패키지로 옮긴다.
//    - Prompt 클래스를 다른 패키지의 클래스가 사용할 수 있도록 public 으로 공개한다.
//    - Prompt의 메서드를 다른 패키지의 클래스가 사용할 수 있도록 public 으로 공개한다.
// 2) 핸들러 클래스들을 별도의 패키지로 분류한다
//    - com.eomcs.pms.handler 패키지 생성
//    - XxxHandler 클래스를 이 패키지로 옮긴다.

//    - 핸들러 클래스를 다른 패키지의 클래스가 사용할 수 있도록 public 으로 공개한다.
//    - 핸들러의 메서드를 다른 패키지의 클래스가 사용할 수 있도록 public 으로 공개한다.

// 1) '/board/add' 명령 처리 추가
// 2) '/board/list' 명령 처리 추가
// 3) 두 번째 게시판 추가
// 4) 세 번째, 네 번째, 다섯 번째, 여섯 번째 게시판 추가

public class App{

  public static void main(String[] args) {

    BoardHandler boardlist = new BoardHandler();
    // 각 게시판 데이터를 저장할 메모리 준

    // 각 회원 목록 데이터를 저장할 메모리 준비
    MemberHandler memberList = new MemberHandler();
    // 각 프로젝트 목록 데이터를 저장할 메모리 준비
    // 생성자에서 MemberHandler 객체를 주입하라고 강요한다.
    // ProjectHandler 객체를 만들려면 반드시 주입해야 한다.
    ProjectHandler projectList = new ProjectHandler(memberList);
    projectList.memberList = memberList;
    // 각 작업 목록 데이터를 저장할 메모리 준비
    TaskHandler taskList = new TaskHandler(memberList);




    loop:
      while (true) {
        String command = com.eomcs.util.Prompt.inputString("명령> ");

        switch (command) {
          case "/member/add":
            memberList.add();
            break;
          case "/member/list":
            memberList.list();
            break;
          case "/project/add":
            projectList.add();
            break;
          case "/project/list":
            projectList.list();
            break;
          case "/task/add":
            taskList.add();
            break;
          case "/task/list":
            taskList.list();
            break;
          case "/board/add":
            boardlist.add(boardlist);
            break;        
          case "/board/list":
            boardlist.list(boardlist);
            break;
          case "/board/detail":
            boardlist.detail();
            break;       
          case "/board/update":
            boardlist.update();
            break;       
          case "/board/delete":
            boardlist.delete();
            break;       
          case "quit":
          case "exit":
            System.out.println("안녕!");
            break loop;
          default:
            System.out.println("실행할 수 없는 명령입니다.");
        }
        System.out.println(); // 이전 명령의 실행을 구분하기 위해 빈 줄 출력
      }

    Prompt.close();
  }
}
