public class MyRunnable implements Runnable{
    public void run()
    {
        for(int i=0; i<5; i++)
        {
            System.out.println( i + ":" + Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
        Thread [] T = new Thread [5];
        for(int i=0; i<5; i++)
        {
            T[i] = new Thread(new MyRunnable());
            T[i].start();
        }
    }
}
// public static void main(String[] args) {
    //     Thread [] T = new Thread [5];
    //     for(Thread t: T)
    //     {
    //         t = new Thread(
    //         new Runnable(){
    //             public void run() {
    //                 for(int i=0; i<5; i++)
    //                 {
    //                     System.out.println( i + ":" + Thread.currentThread().getName());
    //                 }
    //             }
    //         }
    //     );
    //     t.start();
    //     }
    // }