public class LogicalOp {
    private void wait(int seconds){
        System.out.print("Sleeping for: ");
        do{
            System.out.println(seconds);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            seconds--;
        } while(seconds > 0);

    }
}
