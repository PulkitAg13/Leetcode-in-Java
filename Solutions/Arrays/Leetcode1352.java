class ProductOfNumbers {

    ArrayList<Integer> products;
    int prod;

    // Constructor
    public ProductOfNumbers() {
        products = new ArrayList<>();
        prod = 1;
    }

    // Add a number
    public void add(int num) {

        if (num == 0) {
            products = new ArrayList<>();
            prod = 1;
        }
        else {
            prod = prod * num;
            products.add(prod);
        }
    }

    // Get product of last k numbers
    public int getProduct(int k) {

        int n = products.size();

        if (k > n) {
            return 0;
        }

        if (k == n) {
            return products.get(n - 1);
        }

        return products.get(n - 1) / products.get(n - k - 1);
    }
}


/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
