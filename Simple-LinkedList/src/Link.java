
public class Link {
	
	private int data;
	private Link link;
	
	public int getData() { return data; }
	public void setData(int data) { this.data = data; }
	
	public Link getLink() { return link; }
	public void setLink(Link link) { this.link = link; }
	
	@Override
	public String toString() {
		return "Link [data=" + data + ", link=" + link + "]";
	}
	
}
