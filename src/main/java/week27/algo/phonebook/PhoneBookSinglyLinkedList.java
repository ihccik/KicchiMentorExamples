package week27.algo.phonebook;

import java.util.*;

public class PhoneBookSinglyLinkedList {

    private PhoneBookNode head;
    private PhoneBookNode tail;
    public int size;

    //Add this field finding the efficient way of findByFirstName method
    //Map<String, PhoneBookNode> nodesMap = new HashMap<>();

    /**
     * Time complexity: O(1) Space complexity: O(1).
     *
     * @return true or false according to whether the LinkedList has any elements or not.
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Time complexity: O(1) Space complexity: O(1).
     *
     * @return the number of elements in this linkedList.
     */
    public int size() {
        return size;
    }

    /**
     * Time complexity: O(n) Space complexity: 0(1) As constant extra space is used.
     */
    public void printPhoneBook() {
        PhoneBookNode current = head;
        int element = 1;
        while (current != null) {

            System.out.println(element + ". " + current.contact);
            current = current.next;
            element++;
        }
    }

    /**
     * Time complexity: O(1) Space complexity: 0(1) As constant extra space is used.
     *
     * @param contact for creating a node object with firstName, lastName, email and phoneNumber.
     */
    public void add(Contact contact) {
        PhoneBookNode newNode = new PhoneBookNode(contact);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    /**
     * Time complexity: O(n) Space complexity: 0(1) As constant extra space is used.
     *
     * @param firstName this parameter will give the first corresponding node in LinkedList.
     * @return the PhoneBookNode object that has parameterized firstName.
     */
    public PhoneBookNode findByFirstName(String firstName) {
        if (isEmpty()) {
            throw new NoSuchElementException("No record is available in phone book");
        }

        PhoneBookNode current = head;

        while (current != null) {
            if (current.contact.firstName.equals(firstName)) {
                return current;
            }
            current = current.next;
        }
        throw new NoSuchElementException("This first name " + firstName + " could not match with any records");
    }

    /* After the explanation of everything we can explain
     the O(1) time complexity for findByFirstName method.
     At the end, replace the addEfficient and findByFirstNameEfficient
     methods as the original methods of the class instead of the
     previous relevant methods.
     */

    /**
     * Time complexity: O(1) Space complexity: 0(1) As constant extra space is used.
     *
     * @param contact for creating a node object with firstName, lastName, email and phoneNumber.
     */
    /*public void addEfficient(Contact contact) {
        PhoneBookNode newNode = new PhoneBookNode(contact);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        nodesMap.put(contact.firstName, newNode);
    }*/

    /**
     * Time complexity: O(1)  With the help of the hash map structure,
     * we did decrease the search operation complexity to the O(1).
     *
     * Space complexity: 0(1) As constant extra space is used.
     *
     * @param firstName this parameter will give the first corresponding node in LinkedList.
     * @return the PhoneBookNode object that has parameterized firstName.
     */
    /*public PhoneBookNode findByFirstNameEfficient(String firstName) {
        if (isEmpty()) {
            throw new NoSuchElementException("No record is available in phone book");
        }
        PhoneBookNode phoneBookNode = nodesMap.get(firstName);

        if (phoneBookNode == null) {
            throw new NoSuchElementException("This first name " + firstName + " could not match with any records");
        }

        return phoneBookNode;
    }*/

    /**
     * Time complexity: O(n) Space complexity: 0(n) In the worst case all nodes might have same lastName.
     *
     * @param lastName this parameter will give the all nodes with this lastName in LinkedList.
     * @return list of PhoneBookNode with the parameterized lastName.
     */
    public List<PhoneBookNode> findAllByLastName(String lastName) {
        if (isEmpty()) {
            throw new NoSuchElementException("No record is available in phone book");
        }
        List<PhoneBookNode> list = new ArrayList<>();

        PhoneBookNode current = head;

        while (current != null) {
            if (current.contact.lastName.equals(lastName)) {
                list.add(current);
            }
            current = current.next;
        }
        if (list.isEmpty()) {
            throw new NoSuchElementException("This last name " + lastName + " could not match with any records");
        }

        return list;

    }

    /**
     * Time complexity: O(n) Space complexity: 0(1) As constant extra space is used.
     * This method will delete the all nodes that have the parameterized lastName.
     *
     * @param lastName will indicate the all nodes that will be deleted.
     */
    public void deleteAllMatchingLastName(String lastName) {
        if (isEmpty()) return;

        PhoneBookNode previous = head, current = head;

        while (current != null) {
            if (current.contact.lastName.equals(lastName)) {
                if (current == head) {
                    if (size == 1) {
                        head = tail = null;
                    } else {
                        head = current.next;
                    }
                } else if (current == tail) {
                    tail = previous;
                    tail.next = null;
                } else {
                    previous.next = current.next;
                    current = previous;
                }
                size--;
            }
            previous = current;
            current = current.next;
        }
    }

    /**
     * Time complexity: O(n) Space complexity: 0(n) We are creating a list for all nodes in the LinkedList.
     *
     * @return list of PhoneBookNode with all nodes.
     */
    public List<PhoneBookNode> findAll() {
        if (isEmpty()) return null;

        List<PhoneBookNode> list = new ArrayList<>();
        PhoneBookNode current = head;

        while (current != null) {
            list.add(current);
            current = current.next;
        }
        return list;
    }

    public void deleteFirstNode(){
        if (head == null)
            return;
        else {
            if (head == tail) {
                head = null;
                tail = null;
                size = 0;
            } else {
                head = head.next;
                size--;
            }
        }
    }

    public void deleteLastNode(){
        if (tail == null)
            return;
        else {
            if (head == tail) {
                head = null;
                tail = null;
                size = 0;
            } else {
                PhoneBookNode previousToTail = head;
                while (previousToTail.next != tail){
                    previousToTail = previousToTail.next;
                }
                tail = previousToTail;
                tail.next = null;
                size--;
            }
        }
    }
}
