/*
There are two ways of providing an instance of Thread with the code that will
run in the thread. One is to provide it with a Runnable object. The other is to
subclass Thread (since it implements Runnable), override its run method, and
provide the code in that. This example illustrates the first way, supplying a
Runnable object to the Thread.
*/

public final class HelloRunnable implements Runnable {

  public void run() {
    System.out.println("Hello from a thread passed a runnable!");
  }

  public static void main(String args[]) {
    /*
    To instantiate a new object and call a method on it in the same statement
    you wrap the invocation of new in a pair of pars
    */
    (new Thread( new HelloRunnable() )).start();
  }

}
/*
You don’t have to instantiate a new object instance and assign it to a variable
before passing it to a method or constructor. You can instead instantiate it in
the method call, and have no reference to it other than the formal parameter
name in the method or constructor. eg.

    public static void main(String args[]) {
    	(new Thread( new HelloRunnable() )).start();
    }

Above you see the example of a new runnable passed to the constructor of the
Thread class. The method calling the constructor (here, the main method) has no
reference to the new runnable being passed.

Note in the example that the calling method also does not have or get a
reference to the new thread (but it calls a method on it anyway!). And that to
instantiate a new object and call a method on it in the same statement you wrap
the invocation of new in a pair of pars too.
*/
