package linkList;

public class Node<G> {

    private G element;
    private Node<G> past;
    private Node<G> next;


    public Node(G element , Node<G> past , Node<G> next){
        this.element = element;
        this.next = next;
        this.past = past;
    }


    public Node(G element){
        this.setElement(element);
    }


    public void setElement(G element){
        this.element = element;
    }

    public G getElement(){
        return this.element;
    }


    public void setPast(Node<G> past){
        this.past = past;
    }

    public Node<G> getPast(){
        return this.past;
    }


    public void setNext(Node<G> next){
        this.next = next;
    }

    public Node<G> getNext(){
        return this.next;
    }
}
