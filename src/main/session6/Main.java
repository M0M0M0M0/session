package main.session6;

public class Main {
    public static void main(String[] args) {
        try {
            int x = 10;
            int y = 2;
            if (y < 5) {
                //Chủ động phát ra ngoại lệ
                throw new ArithmeticException("Số quá bé");
            } else if (y < 8) {
                throw new ArithmeticException("Số chưa hợp lệ.");
            }
            int z;
            z = x / y;
            System.out.println("z=" + z);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Loi roi!");
        } finally {
            //luc nao cung chay qua+
        }
        try {
            readExcelFile();
        } catch (Exception e) {

        }

    }

    //bao hieu co ngoai le o ham
    public static void readExcelFile() throws Exception {
        //giả sử hàm này có thể có exception
    }
}
