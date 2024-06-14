package weeklyQuiz.week2;

import java.util.Arrays;

public abstract class ShoppingMall {
    private Product[] products;

    public ShoppingMall(int size) {
        this.products = new Product[size];
    }

    //단일 제품 추가
    public void addProduct(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                System.out.println("=====상품 추가=====");
                System.out.println("\"" + product.getName() + "\" 상품을 추가하였습니다.");
                System.out.println();
                return;
            }
        }
        //배열이 꽉 찬 경우
        products = Arrays.copyOf(products, products.length * 2);
        addProduct(product);


    }

    //단일 제품 삭제
    public void removeProduct(Long id) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                if (products[i].getId() == id) {
                    products[i] = null;
                    System.out.println("=====상품 삭제=====");
                    System.out.println(id + "번 상품을 삭제하였습니다.");
                    System.out.println();
                    // 삭제된 인덱스 채우기
                    if (i != products.length - 1) {
                        for (int j = i + 1; j <= products.length - 1; j++) {
                            products[i] = products[j];
                            i++;
                        }
                    }
                    return;
                }
            }
        }
        throw new ProductNotFoundException();

    }

    //전체 제품 삭제
    public void removeProduct() {
        for (int i = 0; i < products.length; i++) {
            products[i] = null;
        }
        System.out.println("=====상품 삭제=====");
        System.out.println("전체 상품을 삭제하였습니다.");
        System.out.println();
    }

    //제품명으로 출력
    public void displayProducts(String name) {
        int count = 0;
        System.out.println("=====\"" + name + "\" 상품 출력=====");
        for (Product product : products) {
            if (product != null) {
                if (product.getName().equals(name)) {
                    System.out.print(product.toString());
                    System.out.println(", 주문 가능 여부: " + (checkOrderAvailability(product) ? "O" : "X"));
                    count++;
                }
            }
        }
        System.out.println();
        if (count == 0) throw new ProductNotFoundException();
    }

    //제품번호로 출력
    public void displayProducts(Long id) {
        System.out.println("=====" + id + "번 상품 출력=====");
        for (Product product : products) {
            if (product != null) {
                if (product.getId() == id) {
                    System.out.print(product.toString());
                    System.out.println(", 주문 가능 여부: " + (checkOrderAvailability(product) ? "O" : "X"));
                    System.out.println();
                    return;
                }
            }
        }
        throw new ProductNotFoundException();
    }

    //전체 제품 출력
    public void displayProducts() {
        int count = 0;
        System.out.println("=====전체 상품 출력=====");
        for (Product product : products) {
            if (product == null) continue;
            System.out.print(product.toString());
            System.out.println(", 주문 가능 여부: " + (checkOrderAvailability(product) ? "O" : "X"));
            count++;
        }
        if (count == 0) System.out.println("상품이 존재하지 않습니다.");
        System.out.println();
    }

    public abstract boolean checkOrderAvailability(Product product);
}
