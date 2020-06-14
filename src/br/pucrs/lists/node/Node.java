package br.pucrs.lists.node;

public class Node<T> {
    private T value;
    private Node<T> nextNode;

    public Node(T value) {
        this(value, null);
    }

    public Node(T value, Node<T> nextNode) {
        this.value = value;
        this.nextNode = nextNode;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode){
        this.nextNode = nextNode;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", nextNode=" + nextNode +
                '}';
    }
}
