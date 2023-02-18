import java.util.LinkedList;
import java.util.Queue;



public class IntBST {
	
	private WordBT root=null;	
	private int size;
	
	private static WordBT[] letterPositions= new WordBT['z'+1];
	
 public void init()
{
	char ch;
	for (ch = 'a' ; ch <= 'z' ; ch++ )
		this.initAdd(ch+"");
}
 
 public void finalize()
 {
 	char ch;
 	for (ch = 'a' ; ch <= 'z' ; ch++ )
 		if(letterPositions[ch].freq==1)
 		//	this.remove(ch+"");
 		//else
 			letterPositions[ch].freq-=1;		}
 

 public void initAdd(String newEntry) {
		WordBT root=null;
		WordBT nb = new WordBT(newEntry,1);		
		letterPositions[newEntry.charAt(0)]=nb;
		
		if(root==null) {
			root = nb;
			return;	
		}		
		Queue<WordBT> q = new LinkedList<WordBT>();
		WordBT temp= root;
	    q.add(temp);

	    while (!q.isEmpty()) {
	        temp = q.peek();
	        q.remove();

	        if (temp.lchild == null) {
	            temp.lchild = nb;
	            break;
	        }
	        else
	            q.add(temp.lchild);

	        if (temp.rchild == null) {
	            temp.rchild = nb;
	            break;
	        }
	        else
	            q.add(temp.rchild);
	    }
		}
		



public static void add(String newEntry) {
	WordBT nb = new WordBT(newEntry,1);//TODO update freq		

	WordBT root = letterPositions[newEntry.charAt(0)];

	if ( root == null ) {
	  root = nb;
	  return;
	}
	WordBT walk= root;   // Start at the root.
	while (true) {
		
		int comparison = nb.data.compareTo(walk.data); // <0(negative) nd alfabetik olarak önce //=0 nd eþit(ayný string) //>0 nd alfabetik olarak sonra
		
		if(comparison==0)
		{
			walk.freq++;
			break;
		}
		
		/*
	  if ( newEntry.equals(walk.data) ) {
	      return;
	  }*/
		
		
	  if ( comparison < 0 ) {
	
	     if ( walk.lchild == null ) {
	    	 walk.lchild = nb;
	        return;  
	     }
	     else
	    	 walk = walk.lchild;
	  }
	  else {
	     if ( walk.rchild == null ) {
	    	 walk.rchild = nb;
	        return; 
	     }
	     else
	    	 walk = walk.rchild;
	   }
	} 
	}  
		
	
public boolean remove(String anEntry) { 
	WordBT walk= root;
	
	
	if( anEntry.equals(root.data))
	{
		root = root.lchild;
		return false;
		
	}
	while(walk!=null) {
		if(anEntry.equals(walk.data)) {
			break;
		}
		
	walk=walk.lchild;	
	}
	if(walk!=null) {
		walk=walk.rchild;
	}
		return false;
}

	
	
}