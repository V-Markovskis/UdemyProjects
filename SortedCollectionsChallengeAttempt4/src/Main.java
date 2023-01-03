import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10,7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.50,2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62.0,10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50,200);
        stockList.addStock(temp);
        temp = new StockItem("cup", 0.45, 7);
        stockList.addStock(temp);

        temp = new StockItem("door", 72.95,4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.50,36);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.99,35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.40,80);
        stockList.addStock(temp);

        temp = new StockItem("Cake", 8.76,40);
        stockList.addStock(temp);

        System.out.println(stockList);

        for(String s: stockList.items().keySet()) {
            System.out.println(s);
        }

        Basket timsBasket = new Basket("Tim");
        sellItem(timsBasket, "car", 1);
        System.out.println(timsBasket);

        sellItem(timsBasket, "car", 1);
        System.out.println(timsBasket);


        if(sellItem(timsBasket, "car", 1) !=  1) {
            System.out.println("There are no more cars in stock");
        }

        sellItem(timsBasket, "spanner", 5);
//        System.out.println(timsBasket);

        sellItem(timsBasket, "juice", 4);
        sellItem(timsBasket, "cup", 12);
        sellItem(timsBasket, "bread", 1);
//        System.out.println(timsBasket);

//        System.out.println(stockList);
//        temp = new StockItem("pen", 1.12);
//        stockList.items().put(temp.getName(), temp);


        //Challenge part start from here (part4)
        Basket basket = new Basket("customer");
        sellItem(basket,"cup", 100);
        sellItem(basket, "juice", 5);
        removeItem(basket, "cup", 1);

        System.out.println(basket);
        removeItem(timsBasket, "car", 1);
        removeItem(timsBasket, "cup", 9);
        removeItem(timsBasket, "car", 1);
        System.out.println("cars removed " + removeItem(timsBasket, "car", 1)); //should not remove any
        System.out.println(timsBasket);

        removeItem(timsBasket, "bread", 1);
        removeItem(timsBasket, "cup", 3);
        removeItem(timsBasket, "juice", 4);
        removeItem(timsBasket, "cup", 3);

        System.out.println(timsBasket); //made sure that all items removed from timsBasket

        System.out.println("\nDisplay stock list before and after checkout");
        System.out.println(basket);
        System.out.println(stockList);
        checkout(basket);
        System.out.println(basket); //should be empty
        System.out.println(stockList); //see changes in stock
        checkout(timsBasket); //already should be empty
        System.out.println(timsBasket);


        stockList.items().get("car").adjustStock(2000);
        stockList.get("car").adjustStock(-1000);
        System.out.println(stockList);

//        for(Map.Entry<String, Double> price: stockList.PriceList().entrySet()) {
//            System.out.println(price.getKey() + " costs " + price.getValue());
//        }

//        stockList.get("car").setPrice(1000);
//        System.out.println(stockList.PriceList().get("car"));
    }

    public static int sellItem(Basket basket, String item, int quantity) {
        //retrieve the item from stock list
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if(stockList.reserveStock(item, quantity) != 0) {
            return basket.addToBasket(stockItem,quantity);
        }
        return 0;
    }

    public static int removeItem(Basket basket, String item, int quantity) {
        //retrieve the item from stock list
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if(basket.removeFromBasket(stockItem, quantity) == quantity) {
            return stockList.unreserveStock(item,quantity);
        }
        return 0;
    }

    public static void checkout(Basket basket) {
        for(Map.Entry<StockItem, Integer> item: basket.Items().entrySet()) {
            stockList.sellStock(item.getKey().getName(), item.getValue());
        }
        basket.clearBasket();
    }
}