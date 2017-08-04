public class ANode {

    private char data;
    private ANode[] children = new ANode[26];

    public ANode (char d) {
        data = d;
    }

    public String toString () {
        return "" + data;
    }

    public void setData (char c) {
        data = c;
    }

    public void setChild(int n, ANode node) {
        children[n] = node;
    }

    /*===========================*/
    public ANode getChild(int n) {
        return children[n];
    }

    public char getData () {
	return data;
    }

    public int getNumChildren () {
	int count = 0;
	for (int i = 0; i < children.length; i++){
	    if (children[i] != null)
		count++;
	}
	return count;
    }
}
