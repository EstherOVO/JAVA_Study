package library.lang;

public class ToString {
}

class Product {
    private String productName;
    private long price;
    private String category;


    Product(String productName, long price, String category) {
        this.productName = productName;
        this.price = price;
        this.category = category;
    }

//  마법사를 통해 필드 데이터 쉽게 생성 가능
    @Override
    public String toString() {
        return "상품명 : '" + productName + '\'' +
                " | 가격 : " + price +
                " | 카테고리 : '" + category + '\'';
    }
}
