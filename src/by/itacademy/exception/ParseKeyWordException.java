package by.itacademy.exception;

import java.sql.SQLException;

public class ParseKeyWordException extends SQLException{
    public ParseKeyWordException(String message) {
        super(message);
    }
}
