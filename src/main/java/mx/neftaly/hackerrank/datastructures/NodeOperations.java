/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.neftaly.hackerrank.datastructures;

/**
 *
 * @author samas
 */
public class NodeOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Node nulo = new Node();
        OperatorNodo op = new OperatorNodo();
        op.Insert(nulo, 12);

    }

}

class OperatorNodo {

    Node Insert(Node head, int data) {
        //Vacio
        if (head == null) {
            Node newNode = new Node();
            newNode.data = data;
            newNode.next = null;
            return newNode;
        }

        if (head.next == null) {
            Node newNode = new Node();
            newNode.data = data;
            newNode.next = null;
            head.next = newNode;
            return head;
        }

        int flag = 1;
        Node nextNode = head.next;
        while (flag == 1) {
            //Llegue al final de la lista
            if (nextNode.next == null) {
                Node newNode = new Node();
                newNode.data = data;
                newNode.next = null;
                nextNode.next = newNode;
                flag = 0;
            } else {
                nextNode = nextNode.next;
            }

        }

        return head;
    }

    /**
     * TODO
     * @param head
     * @param data
     * @param position
     * @return 
     */
    Node InsertNth(Node head, int data, int position) {

        Node headCopy = head;
        Node before = head;
        Node after = head.next;
        for (int opp = 0; opp < position; opp++) {
            before = head.next;
            after = before.next;
        }

        Node newNode = new Node();
        newNode.data = data;
        newNode.next = after;

        before.next = newNode;

        return headCopy;

    }
}
