package com.eomcs.util;

public class Queue extends List implements Cloneable{
  public boolean offer(Object e) {
    add(e);
    return true;
  }

  public Object poll() {
    return delete(0);
  }

  @Override
  public Queue clone() throws CloneNotSupportedException {
    Queue queue = new Queue();
    Object[] values = toArray();
    for (Object value : values) {
      queue.offer(value);
    }
    return queue;
  }
}
