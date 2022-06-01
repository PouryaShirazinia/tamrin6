package linkList;

public class LinkList<G> {

    private Node<G> firstNode;
    private Node<G> lastNode;
    private int size = 0;


    public Node<G> getFirstNode(){
        return this.firstNode;
    }


    public void setLastNode(Node<G> lastNode){
        this.lastNode = lastNode;
    }

    public Node<G> getLastNode(){
        return this.lastNode;
    }

    public int getSize(){
        return this.size;
    }

    public void add(G element){
        Node<G> newNode = new Node<>(element);

        if (this.firstNode == null){
            this.firstNode = newNode;
            this.setLastNode(newNode);
        }else {
            lastNode.setNext(newNode);
            newNode.setPast(this.lastNode);
            this.setLastNode(newNode);
            this.size++;
        }
    }

    public Node<G> getNode(int k) {
        if (k <= this.size /2){
            Node<G> temp = this.firstNode;
            for (int i = 1; i < k; i++) {
                temp = temp.getNext();
            }
            return temp;
        } else {
            Node<G> temp = this.lastNode;
            for (int i = this.size; i > k; i--){
                temp = temp.getPast();
            }
            return temp;
        }
    }

    public G getElement(int k){
            return this.getNode(k).getElement();
    }


    public void addBetween(int becomePast , G element){
        Node<G> newNode = new Node<>(element);
        Node<G> becomingPast = this.getNode(becomePast);
        newNode.setPast(becomingPast);
        newNode.setNext(becomingPast.getNext());
        becomingPast.getNext().setPast(newNode);
        becomingPast.setNext(newNode);
        this.size++;
    }


    public void addFirst(G element){
        Node<G> newNode = new Node<>(element);
        newNode.setNext(this.firstNode);
        this.firstNode.setPast(newNode);
        this.firstNode = newNode;
        this.size++;
    }

    public Node<G> remove(int k){
        Node<G> removingOne = this.getNode(k);
        removingOne.getPast().setNext(removingOne.getNext());
        removingOne.getNext().setPast(removingOne.getPast());
        removingOne.setPast(null);
        removingOne.setNext(null);
        this.size--;
        return removingOne;
    }

    public void set(int k , G newElement){
        this.getNode(k).setElement(newElement);
    }

    public void swapNodes(int k , int m){
        Node<G> s1 = this.getNode(k);
        Node<G> s2 = this.getNode(m);
        Node<G> tempPast = s1.getPast();
        Node<G> tempNext = s1.getNext();
        s1.setPast(s2.getPast());
        s1.setNext(s2.getNext());
        s2.setPast(tempPast);
        s2.setNext(tempNext);
    }

    public Node<G> findLast(){
        if (this.firstNode != null){
            Node<G> tmp = this.firstNode;
            while (tmp.getNext() != null){
                tmp = tmp.getNext();
            }
            return tmp;
        }else {
            return null;
        }
    }
}
