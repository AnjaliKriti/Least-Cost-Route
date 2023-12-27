package org.example.leastcostrouting.enums;

public enum ExchangeMapping {

    EX12("Exchange1", "Exchange2", "EX12"),
    EX13("Exchange1", "Exchange3", "EX13"),
    EX14("Exchange1", "Exchange4", "EX14"),
    EX21("Exchange2", "Exchange1", "EX21"),
    EX23("Exchange2", "Exchange3", "EX23"),
    EX24("Exchange2", "Exchange4", "EX24"),
    EX31("Exchange3", "Exchange1", "EX31"),
    EX32("Exchange3", "Exchange2", "EX32"),
    EX34("Exchange3", "Exchange4", "EX34"),
    EX41("Exchange4", "Exchange1", "EX41"),
    EX42("Exchange4", "Exchange2", "EX42"),
    EX43("Exchange4", "Exchange3", "EX43");

    private final String source;
    private final String destination;
    private final String exchange;

    ExchangeMapping(String source, String destination, String exchange) {
        this.source = source;
        this.destination = destination;
        this.exchange = exchange;
    }

    public static String getExchange(String source, String destination) {
        for (ExchangeMapping mapping : values()) {
            if (mapping.source.equals(source) && mapping.destination.equals(destination)) {
                return mapping.exchange;
            }
        }
        return "EX";
    }
}