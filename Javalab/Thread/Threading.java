import java.util.Random;
class RandomThread extends Thread{
	public void run(){
	Random r = new Random();
		for(int i=0; i<25; i++){
			int n = r.nextInt(100);
			if(n%2 == 0)
			{
				new even(n).start();
			}
			else{
				new odd(n).start();
			}
		}
	}
}
class even extends Thread{
	private int num;       
	public even(int num){
	this.num = num;
	}
	public void run(){
		System.out.println(num*num);
	}
}
class odd extends Thread{
	private int num;
	public odd(int num){
	this.num = num;
	}
	public void run(){
		this.num = num;
		System.out.println(num*num*num);
	}
}
class Threading{
	public static void main(String args[]){
		RandomThread r = new RandomThread();
		r.start();
	}
}