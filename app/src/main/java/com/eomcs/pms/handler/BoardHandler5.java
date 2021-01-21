package com.eomcs.pms.handler;
import com.eomcs.pms.domain.Board;
import com.eomcs.util.Prompt;
public class BoardHandler5 {


  static final int SIZE = 100;
  static Board[] boards = new Board[SIZE];
  static int size = 0;

  public static void add() {
    System.out.println("[새 게시글]");
    Board b = new Board();

    b.no = Prompt.inputInt("글 번호? ");
    b.title = Prompt.inputString("제목? ");
    b.content = Prompt.inputString("내용? ");
    b.user = Prompt.inputString("작성자? ");
    b.now = new java.sql.Date(System.currentTimeMillis());


    System.out.println("게시글을 등록하셨습니다.");
    boards[size++] = b;
  }
  public static void list() {
    System.out.println("[게시글 목록]");
    for (int i = 0; i < size; i ++) {
      Board b = boards[i];
      System.out.printf("%d, %s, %s, %s, %d ,%d\n",
          b.no, 
          b.title, 
          b.user, 
          b.now, 
          b.viewerCount
          , b.like);
    }
  }





}
