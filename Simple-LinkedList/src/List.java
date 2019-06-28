public class List {

    public Link CreateNode() {

        Link p = new Link();

        p.setData(0);
        p.setLink(null);

        return p;

    }

    public void AddNode(Link link, int val) {

        Link p, n;

        n = CreateNode();
        n.setData(val);

        p = link;

        while (p.getLink() != null) {
            p = p.getLink();
        }
        p.setLink(n);

    }

    public int CountNode(Link link) {

        Link p;
        int count = 0;

        p = link;

        while (p.getLink() != null) {
            p = p.getLink();
            ++count;
        }

        if (count == 0)
            count = -1;

        return count;

    }

    public int SearchNode(Link link, int data) {

        int count = 0;
        Link p;

        p = link;

        while (p.getLink() != null) {
            p = p.getLink();
            ++count;
            if (data == p.getData()) {
                return count;
            }

        }

        return -1;

    }

    public void NextInsertNode(Link link, int data, int val) {

        Link p, n;

        n = CreateNode();
        n.setData(val);

        p = link;

        while (n.getLink() == null) {

            p = p.getLink();

            if (data == p.getData()) {
                n.setLink(p.getLink());
                p.setLink(n);
                break;
            }

        }

    }

    public void PreviousInsertNode(Link link, int data, int val) {

        Link p, n, i;

        n = CreateNode();
        n.setData(val);

        p = link;

        while (n.getLink() == null) {

            i = p;
            p = p.getLink();

            if (data == p.getData()) {
                n.setLink(i.getLink());
                i.setLink(n);
                break;
            }

        }

    }

    public void DeleteNode(Link link, int data) {

        Link p, n;

        p = link;

        while (p.getLink() != null) {
            n = p;
            p = p.getLink();
            if (data == p.getData()) {
                n.setLink(p.getLink());
            }
        }

    }
   
    public void ReverseNode(Link link) {
       
        Link p, n, q;
       
        p = link.getLink();
        q = null;
       
       
        while(p!=null) {
           
            n = q;    // null 1 2
            q = p;    // 1 2 3
            p = p.getLink();    // 2 3 4
           
            q.setLink(n);
           
        }
       
        link.setLink(q);
       
    }

    public void SortNode(Link link) {
       
        Link p, q;
        int n=0;
       
        p = link;
        q = link;
       
       
        while(p.getLink()!=null) {
            p = p.getLink();
            while(q.getLink()!=null) {
                q = q.getLink();
                if(p.getData()<=q.getData()) {
                    n = p.getData();
                    p.setData(q.getData());
                    q.setData(n);
                }
            }
            q = link;
        }
       
       
    }
   
    public void PrintNode(Link link) {

        Link p;

        p = link;

        while (p.getLink() != null) {
            p = p.getLink();
            System.out.print(p.getData() + "\t");
        }

    }

}