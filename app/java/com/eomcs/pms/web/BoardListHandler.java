package com.eomcs.pms.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import com.eomcs.pms.domain.Board;
import com.eomcs.pms.service.BoardService;

@WebServlet("/board/list")
public class BoardListHandler implements Servlet {


  @Override
  public void init(ServletConfig config) throws ServletException {


  }

  @Override
  public ServletConfig getServletConfig() {

    return null;
  }

  @Override
  public void service(ServletRequest request, ServletResponse response)
      throws ServletException, IOException {
    // 클라이언트가 /board/list를 요청하면 톰캣 서버가 이 메서드를 호출한다.

    BoardService boardService = (BoardService) request.getServletContext().getAttribute("boardSerivce");

    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();

    out.println("[게시글 목록]");

    try {
      List<Board> boards = boardService.list();

      for (Board b : boards) {
        out.printf("%d, %s, %s, %s, %d\n", 
            b.getNo(), 
            b.getTitle(), 
            b.getWriter().getName(),
            b.getRegisteredDate(),
            b.getViewCount());
      }
    } catch (Exception e) {
      StringWriter strWriter = new StringWriter();
      PrintWriter printWriter = new PrintWriter(strWriter);
      e.printStackTrace(printWriter);

      out.println(strWriter.toString());
    }
  }
  @Override
  public String getServletInfo() {

    return null;
  }

  @Override
  public void destroy() {


  }
}






