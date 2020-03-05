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
    
    static Node head;
    static Node last;
    
    public static LkLs insert_first ( LkLs lk , int value ){
        
        Node n = new Node(value);
        
        if( head == null ){
            
            head = n;
            last = n;
        }
        else{
            
            n.next = head;
            head = n;
        }
        
        return lk;
    }
    
    public static LkLs insert (LkLs lk , int value ){
        
        Node n = new Node(value);
        
        if( head == null ){
            
            head = n;
            last = n;
        }
        else{
            
            last.next = n;
            last = n;
        }
        
        return lk;
    }
    
    public static void display(LkLs lk){
        
        Node curr = head;
        
        while(curr.next != null){
            
            System.out.print(curr.data+" ");
            
            curr = curr.next;
        }
        System.out.print(curr.data);
        System.out.println();
    }
    
    public static LkLs remove(LkLs lk){
        
        if( head != null ){
            
            Node curr = head;
            Node prev = null;
            
            while(curr.next != null){
                
                prev = curr;
                curr = curr.next;
            }
            
            last = prev;
            last.next = null;
            
        }
        else
            System.out.println("Empty List");
            
        return lk;
    }
    
    public static LkLs remove_first(LkLs lk){
        
        if( head != null ){
            
            if( head.next != null )
                head = head.next;
            else
                head = null;
        }
        else
            System.out.println("Empty List");
            
        return lk;
    }
    
    public static LkLs remove_value_first_occurance(LkLs lk , int v){
        
        Node curr = head;
        Node prev = head;
        
        if( head != null && head.data == v ){
            
            if( head.next != null )
                head = head.next;
            else
                head = null;
        }
        else if( head != null ){
            
            while(curr.next != null){
                
                prev = curr;
                curr = curr.next;
                
                if( curr.data == v ){
                    
                    prev.next = curr.next;
                    break;
                }
            }
        }
        
        return lk;
    }
    
    public static LkLs remove_value_all_occurance(LkLs lk , int v){
        
        Node curr = head;
        Node prev = head;
        
        if( head != null && head.data == v ){
            
            if( head.next != null )
                head = head.next;
            else
                head = null;
        }
        else if( head != null ){
            
            while(curr.next != null){
                
                prev = curr;
                curr = curr.next;
                
                if( curr.data == v ){
                    
                    prev.next = curr.next;
                    curr = prev;
                }
            }
        }
        
        return lk;
    }
    
    public static void main(String args[]){
        
        Scanner scanner = new Scanner(System.in);
        
        LkLs lk = new LkLs();
        int ch = 0;
        
        do{
            System.out.println("1.Insert Last\n2.Display\n3Exit\n4.Insert First\n5.Remove last \n6.Remove First\n.7Remove value first occurance\n8.Remove all occurance of value\nEnter your choice\n");
            ch = scanner.nextInt();
            
            if( ch == 1 ){
                
                System.out.println("Enter number of elements to be inserted");
                int size = scanner.nextInt();
                
                for(int i = 0 ; i < size ; i++){    
                    
                    int val = scanner.nextInt();
                    lk = insert(lk,val);
                }
            }
            else if( ch == 2 )
                display(lk);
            else if( ch == 3 )
                System.out.println("End Session");
            else if( ch == 4 ){
                
                System.out.println("Enter number of elements to be inserted");
                int size = scanner.nextInt();
                
                for(int i = 0 ; i < size ; i++){
                    
                    int val = scanner.nextInt();
                    lk = insert_first(lk,val);
                }
            }
            else if( ch == 5 )
                lk = remove(lk);
            else if( ch == 6 )
                lk = remove_first(lk);
            else if( ch == 7 ){
                
                int val = scanner.nextInt();
                lk = remove_value_first_occurance(lk,val);
            }
            else if( ch == 8 ){
                
                int val = scanner.nextInt();
                lk = remove_value_all_occurance(lk,val);
            }
            else if( ch < 1 || ch > 8 )
                System.out.println("Enter valid input");
        }while(ch != 3);
    }
}