package com.eomcs.pms;

import com.eomcs.pms.handler.BoardHandler;
import com.eomcs.pms.handler.MemberHandler;
import com.eomcs.pms.handler.ProjectHandler;
import com.eomcs.pms.handler.TaskHandler;
import com.eomcs.util.Prompt;

// 1) '/board/add' 명령 처리 추가
// 2) '/board/list' 명령 처리 추가
// 3) 두 번째 게시판 추가
// 4) 세 번째, 네 번째, 다섯 번째, 여섯 번째 게시판 추가
public class App {

  public static void main(String[] args) {

    BoardHandler boardlist = new BoardHandler();
    // 각 게시판 데이터를 저장할 메모리 준

    BoardHandler boardList1 = new BoardHandler();
    BoardHandler boardList2 = new BoardHandler();
    BoardHandler boardList3 = new BoardHandler();
    BoardHandler boardList4 = new BoardHandler();
    BoardHandler boardList5 = new BoardHandler();
    BoardHandler boardList6 = new BoardHandler();

    // 각 회원 목록 데이터를 저장할 메모리 준비
    MemberHandler memberList = new MemberHandler();
    // 각 프로젝트 목록 데이터를 저장할 메모리 준비
    ProjectHandler projectList = new ProjectHandler();
    // 각 작업 목록 데이터를 저장할 메모리 준비
    TaskHandler taskList = new TaskHandler();

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
            projectList.add(memberList);
            break;
          case "/project/list":
            projectList.list();
            break;
          case "/task/add":
            taskList.add(memberList);
            break;
          case "/task/list":
            taskList.list();
            break;
          case "/board/add":
            boardList1.add(boardList1);
            break;
          case "/board/list":
            boardList1.list(boardList1);
            break;
          case "/board2/add":
            boardList2.add(boardList2);
            break;
          case "/board2/list":
            boardList2.list(boardList2);
            break;
          case "/board3/add":
            boardList3.add(boardList3);
            break;
          case "/board3/list":
            boardList3.list(boardList3);
            break;
          case "/board4/add":
            boardList4.add(boardList4);
            break;
          case "/board4/list":
            boardList4.list(boardList4);
            break;
          case "/board5/add":
            boardList5.add(boardList5);
            break;
          case "/board5/list":
            boardList5.list(boardList5);
            break;
          case "/board6/add":
            boardList6.add(boardList6);
            break;
          case "/board6/list":
            boardList6.list(boardList6);
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
