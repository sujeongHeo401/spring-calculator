public class DollarCalculator implements ICalculator{

    private int price = 1;

    private MarketApi marketApi;

    public DollarCalculator(MarketApi marketApi){
        this.marketApi = marketApi;
    }

    public void init(){
        this.price = marketApi.connect();
    }



//    public void init(){
//        //naver
//        //kakao
//        this.price = connect();
//    }
//
//    public int connect(){
//        //naver
//        //kakao
//        return 1100;
//    }
    @Override
    public int sum(int x, int y) {
        x *= price;
        y *= price;
        return x + y;
    }

    @Override
    public int minus(int x, int y) {
        x *= price;
        y *= price;
        return x - y;
    }
}
