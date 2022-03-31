public class Main {
    public static void main(String arg[]){
        System.out.println("hello JUnit");

        MarketApi marketApi = new MarketApi();
        DollarCalculator dollarCalculator = new DollarCalculator(marketApi);
        dollarCalculator.init();

        Calculator calculator = new Calculator(new KrwCalculator());

        System.out.println(calculator.sum(10, 10));

    }
}
