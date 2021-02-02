package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Member;

public class MemberList {

  Node first;
  Node last;
  int size = 0;

  void add(Member m) {
    Node node = new Node(m);

    if (last == null) {
      last = node;
      first = node;
    } else {
      last.next = node;
      node.prev = last;
      last = node;
    }
    size ++;
  }
  Member[] toArray() {
    Member[] arr = new Member[this.size];
    for (int i = 0; i < this.size; i++) {
      arr[i] = this.members[i];
    }
    return arr;
  }

  Member get(int memberNo) {
    int i = indexOf(memberNo);
    if (i == -1)
      return null;
    return members[i];
  }

  void delete(int memberNo) {
    int index = indexOf(memberNo);

    if (index == -1)
      return;

    // 배열에서 뒷 번호의 항목을 앞으로 한 칸씩 당긴다. 
    for (int x = index + 1; x < this.size; x++) {
      this.members[x-1] = this.members[x];
    }
    this.members[--this.size] = null; // 앞으로 당긴 후 맨 뒤의 항목은 null로 설정한다.
  }

  public boolean exist(String name) {
    for (int i = 0; i < this.size; i++) {
      if (name.equals(this.members[i].name)) {
        return true;
      }
    }
    return false;
  }

  int indexOf(int memberNo) {
    for (int i = 0; i < this.size; i++) {
      Member member = this.members[i];
      if (member.no == memberNo) {
        return i;
      }
    }
    return -1;
  }
  static class Node{
    Member member;
    Node next;
    Node prev;

    Node(Member m) {
      this.member = m;
    }
  }
}
