package br.pucrs.lists;

import br.pucrs.lists.node.Node;

public class ColecaoEncadeada {
    private Node<String> head;

    public ColecaoEncadeada(Node<String> value) {
        this.head = value;
    }

    public ColecaoEncadeada() {
        this(null);
    }

    public void addFirst(String item) {
        Node<String> chainedNode = head;
        this.head = new Node<>(item, chainedNode);
    }

    public void removeFirst() {
        if (head == null) throw new IllegalStateException("could not remove first from an empty list");
        head = head.getNextNode();
    }

    public void addLast(String item) {
        if (head == null) {
            head = new Node<>(item);
        } else {
            Node<String> node = head;
            while (node.getNextNode() != null) {
                node = node.getNextNode();
            }
            node.setNextNode(new Node<>(item));
        }
    }

    public void removeLast() {
        if (head == null) throw new IllegalStateException("could not remove last from an empty list");
        Node<String> node = head;
        while (node.getNextNode() != null && node.getNextNode().getNextNode() != null) {
            node = node.getNextNode();
        }
        node.setNextNode(null);
    }


    public String getAt(Integer position) {
        try {
            return findNode(position).getValue();
        } catch (IndexOutOfBoundsException ex) {
            throw new IndexOutOfBoundsException("Could not get element in position " + position);
        }
    }

    public void set(Integer position, String value) {
        findNode(position).setValue(value);
    }

    public void remove(Integer position) {
        if (head == null) throw new IllegalStateException("Could not remove from empty list");
        Node<String> node = findNode(position - 1);
        if (node.getNextNode() == null) {
            throw new IndexOutOfBoundsException("Could not reach item on position: " + position);
        } else {
            node.setNextNode(node.getNextNode().getNextNode());
        }
    }

    private Node<String> findNode(Integer position) {
        return findNode(head, position);
    }

    private Node<String> findNode(Node<String> node, Integer position) {
        if (position < 0 || node == null) throw new IndexOutOfBoundsException();
        if (position == 0) return node;
        return findNode(node.getNextNode(), position - 1);
    }

    @Override
    public String toString() {
        return "ColecaoEncadeada{" +
                "head=" + head +
                '}';
    }
}