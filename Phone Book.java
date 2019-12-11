import java.util.*;

class Input
{
    String p_num,s_num;
    public Input(String p_num,String s_num)
    {
        this.p_num = p_num;
        this.s_num = s_num;
    }

}

public class Main
{
    
    public static HashMap<String,Input> hm = new HashMap<>();
    public static void main(String args[])
    {
        Main main=new Main();
        Scanner sc = new Scanner(System.in);
        String cond="";
        do
        {
            System.out.println("Enter Name: ");
            String name = sc.next();
            System.out.println("Enter Primary Number: ");
            String p_num = sc.next();
            System.out.println("Enter Secondary Number: ");
            String s_num = sc.next();
            System.out.println("Type 'stop' to stop!");
            cond = sc.next();
            hm.put(name,new Input(p_num,s_num));
        }while(!cond.equals("stop"));
        
        int ch=0;
        do
        {
            System.out.println("1.Display\n2.Search\n3.Exit");
             ch = sc.nextInt();
            switch(ch)
            {
                case 1: main.display();
                      break;
                case 2: main.search();
                        break;
                default: System.out.println("Invalid choice");
            }
        }while(ch==3);
        
    }

    void display()
    {
        Iterator ir = hm.entrySet().iterator();
        while(ir.hasNext())
        {
            Map.Entry<String,Input> temp = (Map.Entry) ir.next();
            String nm = temp.getKey();
            Input ph = temp.getValue();
            System.out.println("Name : "+nm+"\tPrimary Number : "+ph.p_num+"\tSecondary Number: "+ph.s_num);
            
        }
    }
    
    void search()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Search key");
        String key=sc.next();
        Iterator ir=hm.entrySet().iterator();
        while(ir.hasNext())
        {
            Map.Entry<String,Input> temp=(Map.Entry) ir.next();
            String nm=temp.getKey();
            Input ph=temp.getValue();
            if(nm.contains(key))
            {
                System.out.println("Name : "+nm+"\tPrimary Number : "+ph.p_num+"\tSecondary Number: "+ph.s_num);
            }
            else
            {
                System.out.println("No record exists");
            }
            
        }
        
    }

}
