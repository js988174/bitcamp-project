package com.eomcs.util;

public class Stack extends List implements Cloneable {

  public Object push(Object item) {
    // 수퍼 클래스 List의 메서드를 사용하여 항목을 추가한다.
    this.add(item);
    return item;
  }

  public Object pop() {
    // 수퍼 클래스 List의 메서드를 사용하여 항목을 꺼낸다.
    return this.delete(this.size() -1);

  }

  @Override
  public Stack clone() throws CloneNotSupportedException {
    // TODO Auto-generated method stub
    Stack stack = new Stack();
    for (int i = 0; i < size; i ++) {
      stack.push(get(i));
    }
    return (Stack) super.clone();
  }
}
