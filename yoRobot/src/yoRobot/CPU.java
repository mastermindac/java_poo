package yoRobot;

public class CPU extends Pieza{
	//Cache
	int cache;

	public CPU() {
		super("cpu3434");
		System.out.println("Nueva CPU");
		this.cache=4;
	}

	public int getCache() {
		return cache;
	}

	public void setCache(int cache) {
		this.cache = cache;
	}

}
