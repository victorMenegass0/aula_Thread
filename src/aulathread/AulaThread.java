
package aulathread;

import aulathread.tarefas.Thread1;
import aulathread.tarefas.Thread3;
import aulathread.tarefas.ThreadExe2;


public class AulaThread {

    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        // t1.start();
        ThreadExe2 t2 = new ThreadExe2();
        t2.start();
        Thread3 t3 = new Thread3();
    }
    
}
