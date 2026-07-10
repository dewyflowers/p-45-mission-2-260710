public class Main {
    public static void main(String[] args) {
        int stock = 5;

        for (int orderNumber = 1; orderNumber < 11; ++orderNumber){
            if(stock > 0){
                --stock;
                System.out.printf("%d번 주문 성공, 남은 재고: %d\n", orderNumber, stock);
            }
            else{
                System.out.printf("%d번 주문 실패, 재고 없음\n", orderNumber);
            }
        }
    }
}