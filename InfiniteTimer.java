class InfiniteTimer extends Thread{
	public static void main(String[] args) {
		new InfiniteTimer().start();
	}
	@Override
	public void run(){
		int i=0;
		while(true){
			i++;
			System.out.print(i);
			try {
                  Thread.sleep(1000);
               } catch (InterruptedException e) {
                  e.printStackTrace();
               }
               System.out.print("\r");
		}
	}
}





