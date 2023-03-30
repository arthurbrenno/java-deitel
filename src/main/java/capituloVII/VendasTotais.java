package capituloVII;

public class VendasTotais {
    
    private static final int salesPeople = 4;
    private static final int products = 5;
    private static double[][] sales = new double[salesPeople][products];
    
    public static void main(String[] args) {
        sales[0][0] = 2.6;
        sales[1][0] = 2.7;
        displayTableFormat();
    }
    
    private static void toSlip() {
        for (int i = 0; i < sales.length; i++) {
            for(int j = 0; j < sales[i].length; j++) {
                System.out.printf("Vendor %d%nProduct:%d%nTotal: %.2f%n%n", i + 1, j + 1, sales[i][j]);
            }
        }
    }

    private static void toSlip(int vendor) {
        for(int product = 0; product < sales[vendor - 1].length; product++) {
            System.out.printf("Vendor %d%nProduct:%d%nTotal: $%.2f%n%n", vendor, product + 1, sales[vendor - 1][product]);
        }
    }

    private static void displayTableFormat() {
        for (int vendorIndex = 0; vendorIndex < sales.length; vendorIndex++) {
            System.out.printf("%12sVendor %2d", " ", vendorIndex + 1);
        }
        System.out.println();
        for (int i = 0; i < products; i++) {
            System.out.printf("Product %d: ", i + 1);
            for (int j = 0; j < salesPeople; j++) {
                System.out.printf("%10.2f  ", sales[j][i]);
            }
            System.out.println();
        }
        
    }
}
