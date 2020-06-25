package bean;
import java.util.*;

public class Test implements java.io.Serializable {
	private HashMap mp;
    private int[] array;
	
	public HashMap getMp() {
		return mp;
	}

	public int[] getArray() {
		return array;
	}

	public void setMp(HashMap mp) {
		this.mp = mp;
	}

    public void setArray(int[] array) {
		this.array = array;
	}
}
