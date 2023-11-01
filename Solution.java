package AH6;
import java.util.LinkedList;
import java.util.List;

import javax.xml.transform.Source;

class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Solution {
  public static List<String> linkedListValues(Node<String> head) {
    List<String> strings = new LinkedList<>();
    Node<String> node = head;
    strings.add(head.val);
    while (node.next != null)
    {
      node = node.next;
      strings.add(node.val);
    }
    return strings;
  }

  public static void main(String[] args) {
    Node<String> a = new Node<>("a");
    Node<String> b = new Node<>("b");
    Node<String> c = new Node<>("c");
    Node<String> d = new Node<>("d");
    a.next = b;
    b.next = c;
    c.next = d;

    // a -> b -> c -> d

    Solution.linkedListValues(a);
    System.out.println(linkedListValues(a));
    // -> [ "a", "b", "c", "d" ]
  }
}
