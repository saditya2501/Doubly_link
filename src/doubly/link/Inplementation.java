package doubly.link;

public class Inplementation
{
    Node head;
    Node tail;

  public void insert(Node newnode)
  {
        if ( head == null )
        {
            head = newnode;
            tail = newnode;
            head.previous = null;
        }
        else
            {
            Node temp = head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            newnode.previous = temp;
            temp.next = newnode;
            tail = temp.next;
            }

    }
    public void displaythrough_LtoR()
    {
        if ( head == null)
        {
            System.out.println("No Element Found...");

        }
        else
            {
            Node temp = head;
            while ( temp != null)
            {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
    public void displaythrough_RtoL()
    {
        if ( tail == null)
        {
            System.out.println("No Element Found...");
        }
        else
            {
            Node temp = tail;
            while ( temp != null)
            {
                System.out.println(temp.data);
                temp = temp.previous;
            }
        }

    }
}
