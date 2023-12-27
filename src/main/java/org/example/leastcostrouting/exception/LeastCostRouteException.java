package org.example.leastcostrouting.exception;

public class LeastCostRouteException extends Exception{

    public static final String PERSON_NAME_NOT_VALID = "INVALID PERSON NAME";
    public static final String FILE_READ_ERROR = "ERROR WHILE READING CSV FILE";

    public LeastCostRouteException (String message){
        super(message);
    }

    public LeastCostRouteException(String message, Throwable cause) {
        super(message, cause);
    }
}
