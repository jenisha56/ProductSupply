public class Product {
    private class LinkedListNode {
        String p_name,p_code;
        Integer p_quantity;
        LinkedListNode next;
    }


    private LinkedListNode head;
    private LinkedListNode temp;

    public void insert(String name,String code, Integer quantity){

        LinkedListNode newNode = new LinkedListNode();
        newNode.p_name = name;
        newNode.p_code = code;
        newNode.p_quantity = quantity;
        newNode.next = null;

        if(head == null) {
            head = newNode;
            System.out.println("Inserted Successfully");
        }
        else {
            temp = head;
            boolean check = false;
            if (temp.p_name.compareToIgnoreCase(name) == 0 ||temp.p_code.compareToIgnoreCase(code) == 0 ) {
                check = true;
            }
            while(temp.next!= null){
                if (temp.next.p_name.compareToIgnoreCase(name) == 0 || temp.next.p_code.compareToIgnoreCase(code) == 0) {
                    check = true;
                    break;
                }
                temp = temp.next;
            }


            if (!check) {
                temp.next = newNode;
                System.out.println("Inserted Successfully");
            }
            else
                System.out.println("Product already exists in the system");
        }
    }

    public void find(String name){
        temp =head;
        boolean check = false;
        if (head==null){
            System.out.println("No product in the system right now");
            check = true;
        }

        else {
            if (temp.p_name.compareToIgnoreCase(name) == 0) {
                System.out.println("\nProduct Available Here:");
                System.out.println("Product Name: "+temp.p_name+"\nProduct Code: "+temp.p_code+"\nQuantity In Stock: "+temp.p_quantity);
                check = true;
            }
            while(temp.next!= null) {
                if (temp.next.p_name.compareToIgnoreCase(name) == 0) {
                    System.out.println("\nProduct Available Here:");
                    System.out.println("Product Name: "+temp.next.p_name+"\nProduct Code: "+temp.next.p_code+"\nQuantity In Stock: "+temp.next.p_quantity);
                    check = true;
                    break;
                }
                temp = temp.next;
            }
        }
        if (!check)
            System.out.println("Product Type Not Available Here");

    }

    public void remove(String name) {
        temp = head;
        LinkedListNode previous = null;
        try {

            if (temp.p_name.compareToIgnoreCase(name) == 0) {
                head = temp.next;
                System.out.println("Product Remove Successfully");
            } else {
                while (temp.next != null) {
                    if (temp.next.p_name.compareToIgnoreCase(name) == 0) {
                        previous =temp;
                        temp = temp.next;
                        System.out.println("Product Remove Successfully");
                        break;
                    }
                    temp = temp.next;
                }
                previous.next = temp.next;
            }
        }
        catch(Exception e){
            System.out.println("Product not found");
        }
    }

    public void display(){
        LinkedListNode temp =head;
        if (head==null){
            System.out.println("No product available in the system right now");
        }
        else {
            while(temp!=null){
                System.out.println("\nProduct Name: "+temp.p_name+"\nProduct Code: "+temp.p_code+"\nQuantity In Stock: "+temp.p_quantity);
                temp = temp.next;
            }
        }
    }



}
