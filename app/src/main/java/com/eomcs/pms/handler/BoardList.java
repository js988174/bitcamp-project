package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Board;

public class BoardList {

  private Node first;
  private Node last;
  private int size = 0;  


  public void add(Board b) {
    Node node = new Node(b);

    if (last == null) { // 연결 리스트의 첫 항목이라면,
      last = node;
      first = node;
    } else { // 연결리스트에 이미 항목이 있다면, 
      last.next = node; // 현재 마지막 상자의 다음 상자가 새 상자를 가리키게 한다.
      node.prev = last; // 새 상자에서 이전 상자로서 현재 마지막 상자를 가리키게 한다. 
      last = node; // 새 상자가 마지막 상자가 되게 한다.
    }

    this.size++;

  }

  public Board[] toArray() {
    // 현재까지 저장된 게시글 목록을 리턴하기 위해 새 배열을 준비 한다.
    Board[] arr = new Board[this.size];

    Node cursor =first;
    int i = 0;

    while (cursor != null) {        
      arr[i++] = cursor.board;
      cursor = cursor.next;
    }
    return arr;
  }

  public Board get(int boardNo) {
    Node cursor = first;
    while (cursor != null) {
      Board b = cursor.board;
      if (b.getNo() == boardNo) {
        return b;
      }
      cursor = cursor.next;
    }
    return null;
  }

  public void delete(int boardNo) {
    // 해당 번호의 게시글을 찾는다. 

    Board board = get(boardNo);

    if (board == null) {
      return;
    }
    Node cursor = first;
    while (cursor != null) {
      if (cursor.board == board) {
        if (first == last) {
          first = last = null;
          break;
        }
        if (cursor == first) {
          first = cursor.next;
          cursor.prev = null;
        } else {
          cursor.prev.next = cursor.next;
          if (cursor.next != null) {
            cursor.next.prev = cursor.prev;
          }
        }
        if (cursor == last) {
          last = cursor.prev;
        }
        this.size--;
        break;
      }
      cursor = cursor.next;
    }
  }

  static class Node {
    Board board;
    Node next;
    Node prev;

    Node(Board b) {
      this.board = b;
    }
  }

}


