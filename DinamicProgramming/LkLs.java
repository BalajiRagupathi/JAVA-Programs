

import java.util.*;

class Node{

    int data;
    Node next;
    
    public Node(int d){
    
        data = d;
        next = null;
    }
}

public class LkLs{
    
    Node head;
    Node last;

    
    public LkLs insert_first ( LkLs lka , int value ){
    
        Node n = new Node(value);
    
        if( lka.head == null ){
    
            lka.head = n;
            lka.last = n;
        }
        else{
    
            n.next = lka.head;
            lka.head = n;
        }
    
        return lka;
    }
    
    public LkLs insert (LkLs lka , int value ){
    
        Node n = new Node(value);
    
        if( lka.head == null ){

            lka.head = n;
            lka.last = n;
        }
        else{
    
            lka.last.next = n;
            lka.last = n;
        }
    
        return lka;
    }
    
    public void display(LkLs lka){
    
        Node curr = lka.head;
    
        while(curr.next != null){
    
            System.out.print(curr.data+" ");
    
            curr = curr.next;
        }
        System.out.print(curr.data);
        System.out.println();
    }
    
    public static LkLs remove(LkLs lka){
    
        if( lka.head != null ){
    
            Node curr = lka.head;
            Node prev = null;
    
            while(curr.next != null){
    
                prev = curr;
                curr = curr.next;
            }

            prev.next = null;
            lka.last = prev;
            lka.last.next = null;
    
        }
        else
            System.out.println("Empty List");
    
        return lka;
    }
    
    public LkLs remove_first(LkLs lka){
    
        if( lka.head != null ){
    
            if( lka.head.next != null )
                lka.head = lka.head.next;
            else
                lka.head = null;
        }
        else
            System.out.println("Empty List");
    
        return lka;
    }
    
    public LkLs remove_value_occurance(LkLs lka , int v,int flag){
    
        Node curr = lka.head;
        Node prev = lka.head;
    
        if( lka.head != null && lka.head.data == v ){
    
            if( lka.head.next != null )
                lka.head = lka.head.next;
            else
                lka.head = null;
        }
        else if( lka.head != null ){
    
            while(curr.next != null){
    
                prev = curr;
                curr = curr.next;
    
                if( curr.data == v ){
    
                    prev.next = null;
                    prev.next = curr.next;
                    curr = prev;
                    if( flag == 0 )
                        break;
                }
            }
        }
    
        return lka;
    }
    
    public static void main(String args[]){
    
        Scanner scanner = new Scanner(System.in);
    
        LkLs lk = new LkLs();
        LkLs lk1 = new LkLs();
    
        int ch = 0;
    
        do{
            System.out.println("1.Insert Last\n2.Display\n3Exit\n4.Insert First\n5.Remove last \n6.Remove First\n7.Remove value first occurance\n8.Remove all occurance of value\n9.New List\n10.Display New List\n11.Merge\nEnter your choice\n");
            ch = scanner.nextInt();
    
            if( ch == 1 ){
    
                System.out.println("Enter number of elements to be inserted");
                int size = scanner.nextInt();
    
                for(int i = 0 ; i < size ; i++){
    
                    int val = scanner.nextInt();
                    lk.insert(lk,val);
                }
            }
            else if( ch == 2 )
                lk.display(lk);
            else if( ch == 3 )
                System.out.println("End Session");
            else if( ch == 4 ){
    
                System.out.println("Enter number of elements to be inserted");
                int size = scanner.nextInt();
    
                for(int i = 0 ; i < size ; i++){
    
                    int val = scanner.nextInt();
                    lk.insert_first(lk,val);
                }
            }
            else if( ch == 5 )
                lk.remove(lk);
            else if( ch == 6 )
                lk.remove_first(lk);
            else if( ch == 7 ){
    
                int val = scanner.nextInt();
                lk.remove_value_occurance(lk,val,0);
            }
            else if( ch == 8 ){
    
                int val = scanner.nextInt();
                lk.remove_value_occurance(lk,val,1);
            }
            else if( ch == 9 ){
    
                lk1.insert(lk1,scanner.nextInt());
            }
            else if( ch == 10 )
                lk1.display(lk1);
            else if( ch == 11 ){
    
                System.out.println("merge");
                int fs = scanner.nextInt();
                int ss = scanner.nextInt();
    
                Node first = lk.head;
    
                while(fs != 1 && first.next != null){
    
                    first = first.next;
                    fs--;
                }
    
                Node sec = lk1.head;
    
                while(ss != 1 && sec.next != null){
    
                    sec = sec.next;
                    ss--;
                }
    
                sec.next = null;
                sec.next = first;
            }
            else if( ch == 12 ){
    
                Node first = lk.head;
                
                while( first.next != null ){
                    
                    Node sec = lk1.head;
                    while( sec.next != null ){
                        
                        if( first.next == sec.next ){
                            
                            Node n = first.next;
                            System.out.println("First list value "+first.data+" and second list value"+sec.next+" connected to same address pointing value"+n.data);
                            break;
                        }
						sec = sec.next;
                    }
					first = first.next;
                }
            }
            else if( ch < 1 || ch > 12 )
                System.out.println("Enter valid input");
        }while(ch != 3);
    }
}

// 1
// 3
// 5
// 6
// 12
// 2
// 4
// 5
// 5
// 6
// 12
// 11
// 13
// 2
// 5
// 2
// 6
// 2
// 7
// 6
// 2
// 8
// 5
// 2
// 9
// 1
// 9
// 2
// 9
// 3
// 10
// 11
// 2
// 2
// 2
// 10
// 12
// 3