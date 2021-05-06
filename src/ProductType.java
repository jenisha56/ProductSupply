public class ProductType {

    public static void main(String[] args) {
        Product product = new Product();
        Integer option;
        do {
            System.out.println("\n0: Quit");
            System.out.println("1: Insert Product Type");
            System.out.println("2: Find Product Type");
            System.out.println("3: Remove Product Type");
            System.out.println("4: Display Product Type ");
            option = Input.getInteger("Input option: ");
            String name,code;
            Integer quantity;
            switch (option) {
                case 0:
                    System.out.println("Quitting program");
                    break;
                case 1:
                    name = Input.getString("Product Name: ");
                    code = Input.getString("Product Code: ");
                    quantity = Input.getInteger("Quantity In Stock: ");
                    product.insert(name,code,quantity);
                    break;
                case 2:
                    name= Input.getString("Product Name: ");
                    product.find(name);
                    break;
                case 3:
                    name= Input.getString("Product Name: ");
                    product.remove(name);
                    break;
                case 4:
                    product.display();
                    break;
                default:
                    System.out.println("invalid option");
            }
        } while (option != 0);
    }

}

