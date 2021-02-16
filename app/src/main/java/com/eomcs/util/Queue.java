package com.eomcs.util;

<<<<<<< HEAD
public class Queue extends List implements Cloneable{
  public boolean offer(Object e) {
    add(e);
=======
public class Queue extends List implements Cloneable {

  public boolean offer(Object e) {
    this.add(e);
>>>>>>> 079888418047efecdc59d01ffb2b0f38dabf15f3
    return true;
  }

  public Object poll() {
<<<<<<< HEAD
    return delete(0);
=======
    return this.delete(0);
>>>>>>> 079888418047efecdc59d01ffb2b0f38dabf15f3
  }

  @Override
  public Queue clone() throws CloneNotSupportedException {
    Queue queue = new Queue();
<<<<<<< HEAD
    Object[] values = toArray();
=======
    Object[] values = this.toArray();
>>>>>>> 079888418047efecdc59d01ffb2b0f38dabf15f3
    for (Object value : values) {
      queue.offer(value);
    }
    return queue;
  }
<<<<<<< HEAD
=======

  @Override
  public Iterator iterator() throws CloneNotSupportedException{  
    Queue queue = this.clone();

    return new Iterator() {

      @Override
      public boolean hasNext() {
        return queue.size() > 0;
      }

      @Override
      public Object next() {
        return queue.poll();
      }
    };
  }

>>>>>>> 079888418047efecdc59d01ffb2b0f38dabf15f3
}
