// java program for thread creation by extendign thread class

class MultithreadingDemo extends Thread{
	public void run(){
		try{
			System.out.println("Thread " + Thread.currentThread().getId() + " is running.");
		}
		catch(Exception e){
			System.out.println("Exception is caught");
		}
	}
}

class Multithread{
	public static void main(String[] args) {
		int n = 60;
		for(int i = 0; i < n ; i++){
			MultithreadingDemo object = new MultithreadingDemo();
			object.start();
		}
	}
}