package aulathread.tarefas;


    public class ThreadExe2 extends Thread{
    public ThreadExe2 (){

    }
    public void run(){
        for (int i = 1; i <= 20; i++) {
            System.out.println("Processo 2 – em execução");
            
            try {
                this.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println("Processo 2 - Finalizado");
    }
}

