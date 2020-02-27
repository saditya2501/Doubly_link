package doubly.link;
public class Node
{
    int data;
    Node previous;
    Node next;

    public Node(int data)
    {

        this.data = data;
        this.previous = null;
        this.next = null;

    }
    public int getData()
    {
        return data;
    }
    public void setData(int data)
    {
        this.data = data;
    }
    public Node getPrevious()
    {
          return previous;
    }
    public void setPrevious(Node previous)
    {
        this.previous = previous;
    }
    public Node getNext()
    {
        return next;
    }
    public void setNext(Node next)
    {
        this.next = next;
    }

}
