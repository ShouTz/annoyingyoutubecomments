import java.util.ArrayList;

public class Generator {

	String msg;
	
	public Generator(String msg) {
		setMsg(msg);
		gen();
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		if (msg != null)
			this.msg = msg;
		else throw new IllegalArgumentException();
	}
	
	public void gen()
	{
		char[] msg_arr = new char[msg.length()];
		msg_arr = msg.toCharArray();
		ArrayList<String> msg_list= new ArrayList();
		msg_list.add(Character.toString(msg_arr[0]));
		for(int i = 1; i < msg_arr.length; i++)
		{
			printArray(i, msg_list);
			msg_list.add(Character.toString(msg_arr[i]));
		}
		System.out.println(msg_arr);
		for(int i = msg_arr.length -1; i >= 0; i--)
		{
			printArray(i, msg_list);
			msg_list.remove(i);
		}
	}
	
	private void printArray(int le, ArrayList<String> seq)
	{
		for(int i = 0; i < le; i++)
		{
			System.out.print(seq.get(i));
		}
		System.out.println();
	}
}
