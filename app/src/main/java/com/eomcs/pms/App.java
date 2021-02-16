package com.eomcs.pms;

import com.eomcs.pms.handler.BoardHandler;
import com.eomcs.pms.handler.MemberHandler;
import com.eomcs.pms.handler.ProjectHandler;
import com.eomcs.pms.handler.TaskHandler;
<<<<<<< HEAD
import com.eomcs.util.AbstractIterator;
import com.eomcs.util.Prompt;
import com.eomcs.util.Queue;
import com.eomcs.util.QueueIterator;
=======
import com.eomcs.util.Iterator;
import com.eomcs.util.Prompt;
import com.eomcs.util.Queue;
>>>>>>> 079888418047efecdc59d01ffb2b0f38dabf15f3
import com.eomcs.util.Stack;
import com.eomcs.util.StackIterator;

public class App {

  // 사용자가 입력한 명령을 저장할 컬렉션 객체 준비
  static Stack commandStack = new Stack();
  static Queue commandQueue = new Queue();
<<<<<<< HEAD

  public static void main(String[] args) throws CloneNotSupportedException{
=======


  public static void main(String[] args) throws CloneNotSupportedException {
>>>>>>> 079888418047efecdc59d01ffb2b0f38dabf15f3

    BoardHandler boardHandler = new BoardHandler();
    MemberHandler memberHandler = new MemberHandler();
    ProjectHandler projectHandler = new ProjectHandler(memberHandler);
    TaskHandler taskHandler = new TaskHandler(memberHandler);

    loop:
      while (true) {
        String command = com.eomcs.util.Prompt.inputString("명령> ");

<<<<<<< HEAD
        if (command.length() == 0)
          continue;

=======
        if (command.length() == 0) // 사용자가 빈 문자열을 입력하면 다시 입력하도록 요구한다.
          continue;

        // 사용자가 입력한 명령을 보관해둔다.
>>>>>>> 079888418047efecdc59d01ffb2b0f38dabf15f3
        commandStack.push(command);
        commandQueue.offer(command);

        switch (command) {
          case "/member/add":
            memberHandler.add();
            break;
          case "/member/list":
            memberHandler.list();
            break;
          case "/member/detail":
            memberHandler.detail();
            break;  
          case "/member/update":
            memberHandler.update();
            break; 
          case "/member/delete":
            memberHandler.delete();
            break;
          case "/project/add":
            projectHandler.add();
            break;
          case "/project/list":
            projectHandler.list();
            break;
          case "/project/detail": 
            projectHandler.detail();
            break;  
          case "/project/update":
            projectHandler.update();
            break; 
          case "/project/delete":
            projectHandler.delete();
            break;
          case "/task/add":
            taskHandler.add();
            break;
          case "/task/list":
            taskHandler.list();
            break;
          case "/task/detail": 
            taskHandler.detail();
            break;  
          case "/task/update":
            taskHandler.update();
            break; 
          case "/task/delete":
            taskHandler.delete();
            break;
          case "/board/add":
            boardHandler.add();
            break;
          case "/board/list":
            boardHandler.list();
            break;
          case "/board/detail":
            boardHandler.detail();
            break;  
          case "/board/update":
            boardHandler.update();
            break; 
          case "/board/delete":
            boardHandler.delete();
            break;
<<<<<<< HEAD
          case "history" :
            printCommandHistory(new StackIterator(commandStack.clone()));
            break;
          case "history2" :
            printCommandHistory(new QueueIterator(commandQueue.clone()));
=======
          case "history":
            printCommandHistory(commandStack.iterator());
            break;
          case "history2": 
            printCommandHistory(commandStack.iterator());
>>>>>>> 079888418047efecdc59d01ffb2b0f38dabf15f3
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

<<<<<<< HEAD

  static void printCommandHistory(AbstractIterator iterator) {
=======
  static void printCommandHistory(Iterator iterator) {
>>>>>>> 079888418047efecdc59d01ffb2b0f38dabf15f3
    int count = 0;
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
      if ((++count % 5) == 0) {
        String input = Prompt.inputString(": ");
        if (input.equalsIgnoreCase("q")) {
          break;
        }
      }
    }
  }
}
