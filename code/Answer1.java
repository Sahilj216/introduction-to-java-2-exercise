public class Answer1 {

    public static void main(String[] args) {
        for (Houses h : Houses.values()) {
            System.out.println("Price of " + h.name() + " house is " + h.getPrice());
        }
    }

}

enum Houses {
    SMALL(500000), MEDIUM(800000), LARGE(900000), MANSION(10000000);

    private int price;

    Houses(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

