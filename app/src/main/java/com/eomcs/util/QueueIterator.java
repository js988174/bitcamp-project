package com.eomcs.util;

public class QueueIterator extends AbstractIterator{
  Queue queue;

  public QueueIterator(Queue queue) throws CloneNotSupportedException{

    queue = queue.clone();
  }
  @Override
  public boolean hasNext() {
    return queue.size() > 0;
  }

  @Override
  public Object next() {
    return queue.poll();
  }
}
