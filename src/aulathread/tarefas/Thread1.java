
package aulathread.tarefas;

public class Thread1 extends Thread{
    public Thread1(){
        
    }
    public void run() {
        int fator = 10;
        for (int i = fator; i > 1; i--) {
            System.out.println(fator+" X "+(i-1)+" = "+(fator *= (i-1)));
            
            try {
                this.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println("Processo 1 – Fatorial de 10 Finalizado – valor final:" + fator);
    }
}