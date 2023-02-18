
public class WordBT {
	
	public String data;
	public WordBT lchild;
	public WordBT rchild;
	public int freq;
	
	
	public WordBT(String data,int val) {
		lchild=rchild=null;
		this.data=data;
		freq=1;
	}

}
