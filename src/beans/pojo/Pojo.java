package beans.pojo;

import java.util.ArrayList;
import java.util.List;

public class Pojo {

	
	public  List<Integer> list =new ArrayList<Integer>();
	
	

/*	public void setList(int[] list) {
		Pojo.list = list;
	}
*/
	public String message;

	public  List<Integer> getList() {
		return list;
	}

	public  void setList(List<Integer> list) {
		this.list = list;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {

		this.message = message;
	}

}
