package Lesson24;

public enum StsteEnum {
    BAK("USD"),
    RUSSIAN_RUBLE("RUB"),
    EVRO ("EUR"),
    GRIVNA("GRI") ;

    String currency;

    StsteEnum (String currency){
        this.currency = currency;
    }
    public String value (){
        return this.currency;
    }
}
