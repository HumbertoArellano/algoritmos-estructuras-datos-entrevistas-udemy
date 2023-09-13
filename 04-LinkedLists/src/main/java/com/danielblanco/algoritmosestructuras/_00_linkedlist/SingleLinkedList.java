package com.danielblanco.algoritmosestructuras._00_linkedlist;

public class SingleLinkedList {
  public Node head; // Nodo auxiliar


  /*     head = null;
  
     Agregar un elemento al final 
     Si la cabezera en donde se encuentra el nodo es null
     Crear un nuevo nodo con el valor que le estoy dando como parametro
     y lo devuelves.
  */
  public void appendToTail(int value) { // 
    if (head == null) {
      head = new Node(value);  
      return;                  
    }
    
      /*
        Si el nodo es diferente de null.
        Entonces Se crea un variable de nodo auxiliar que guarde el head actual.

        Relizamos una busqueda para verificar si el siguiente nodo no es null
          Avanzamos al siguiente nodo.

          Si el siguiente nodo es null, salimos del bucle y al nodo siguiente
          le agregamos un nuevo nodo con el valor que pasamos como parametro.
      */
    
    Node current = head;
    while (current.next != null) {
      current = current.next;
    }
    current.next = new Node(value);
  }

  public void deleteNode(int value) {
    if (head == null) return;

    if (head.value == value) {
      head = head.next;
      return;
    }

    // 4-3-1
    Node current = head;
    while (current.next != null) {
      if (current.next.value == value) {
        current.next = current.next.next;
        return;
      }
      current = current.next;
    }
  }

  public void print() {
    if (head == null) {
      System.out.println("END");
      return;
    }
    Node current = head;
    while (current.next != null) {
      System.out.print(current.value + " -> ");
      current = current.next;
    }
    System.out.println(current.value + " -> END");
  }
}
