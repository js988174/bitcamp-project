package com.eomcs.pms.handler;

import java.sql.Date;
import com.eomcs.pms.domain.Board;
import com.eomcs.util.Prompt;

public class BoardHandler {


  node head;
  node lastBox;
  int size = 0;



  public void add() {
    System.out.println("[게시글 등록]");

    Board b = new Board();

    b.no = Prompt.inputInt("번호? ");
    b.title = Prompt.inputString("제목? ");
    b.content = Prompt.inputString("내용? ");
    b.writer = Prompt.inputString("작성자? ");
    b.registeredDate = new Date(System.currentTimeMillis());

    node box = new node(b);

    if (lastBox == null) { // 연결 리스트의 첫 항목이라면,
      lastBox.next = box; 

      head = box;   

    } else { // 연결리스트에 이미 항목이 있다면,
      lastBox.next = box;// 마지막 상자가 다음 상자를 새 상자를 가르키게 한다.
      box.prev = lastBox;// 새 상자의 이전 상자로서 현재 마지막 상자를 가르키게 한다.
      lastBox = box; // 새 상자가 마지막 상자가 되게 한다.
    }

    System.out.println("게시글을 등록하였습니다.");
  }

  public void list() {
    System.out.println("[게시글 목록]");

    node cursor = head;


    while (cursor != null) {
      Board b = cursor.board;


      // 번호, 제목, 등록일, 작성자, 조회수, 좋아요
      System.out.printf("%d, %s, %s, %s, %d, %d\n", 
          b.no, 
          b.title, 
          b.registeredDate, 
          b.writer, 
          b.viewCount,
          b.like);

      cursor = cursor.next;
    }
  }

  public void detail() {
    System.out.println("[게시글 상세보기]");

    int no = Prompt.inputInt("번호? ");

    Board board = findByNo(no);
    if (board == null) {
      System.out.println("해당 번호의 게시글이 없습니다.");
      return;
    }

    board.viewCount++;
    System.out.printf("제목: %s\n", board.title);
    System.out.printf("내용: %s\n", board.content);
    System.out.printf("작성자: %s\n", board.writer);
    System.out.printf("등록일: %s\n", board.registeredDate);
    System.out.printf("조회수: %d\n", board.viewCount);

  }

  public void update() {
    System.out.println("[게시글 변경]");

    int no = Prompt.inputInt("번호? ");

    Board board = findByNo(no);
    if (board == null) {
      System.out.println("해당 번호의 게시글이 없습니다.");
      return;
    }

    String title = Prompt.inputString(String.format("제목(%s)? ", board.title));
    String content = Prompt.inputString(String.format("내용(%s)? ", board.content));

    String input = Prompt.inputString("정말 변경하시겠습니까?(y/N) ");

    if (input.equalsIgnoreCase("Y")) {
      board.title = title;
      board.content = content;
      System.out.println("게시글을 변경하였습니다.");

    } else {
      System.out.println("게시글 변경을 취소하였습니다.");
    }
  }

  public void delete() {
    System.out.println("[게시글 삭제]");

    int no = Prompt.inputInt("번호? ");

    Board board = findByNo(no);
    if (board == null) {
      System.out.println("해당 번호의 게시글이 없습니다.");
      return;
    }

    String input = Prompt.inputString("정말 삭제하시겠습니까?(y/N) ");

    if (input.equalsIgnoreCase("Y")) {
      node cursor = head;
      while (cursor != null) {
        if (cursor.board == board ) {
          if (head == lastBox) {
            head = lastBox = null;
            break;
          }
          if (cursor == head) {
            head = cursor.next;
            cursor.prev = null;
          }else {
            cursor.prev.next = cursor.next;
            if (cursor.next != null) {
              cursor.next .prev = cursor.prev;
            }
          }if (cursor == lastBox) {       

            lastBox = cursor.prev;
          }


          break;
        }
        cursor = cursor.next;
      }

      System.out.println("게시글을 삭제하였습니다.");

    } else {
      System.out.println("게시글 삭제를 취소하였습니다.");
    }

  }
  // 게시글 번호에 해당하는 인스턴스를 배열에서 찾아 그 인덱스를 리턴한다. 
  int indexOf(int boardNo) {
    for (int i = 0; i < this.size; i++) {
      Board board = this.boards[i];
      if (board.no == boardNo) {
        return i;
      }
    }
    return -1;
  }

  // 게시글 번호에 해당하는 인스턴스를 찾아 리턴한다.
  Board findByNo(int boardNo) {
    node cursor = head;
    while (cursor != null) {
      Board b = cursor.board;
      if (b.no == boardNo) {
        return b;
      }
      cursor = cursor.next;
    }
    return null;
  }

  static class node {
    Board board;
    node next;
    node prev;

    node(Board b) {
      this.board = b;
    }
  }
}






