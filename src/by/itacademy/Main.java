package by.itacademy;

import by.itacademy.exception.ConnectedException;
import by.itacademy.exception.LastIntegerElementException;
import by.itacademy.exception.ParseKeyWordException;

import java.io.IOException;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        try {
            new RandomException((int) (Math.random() * 3));
        } catch (LastIntegerElementException e) {
            System.out.println("LastIntegerElementException");
            e.printStackTrace();
        } catch (SQLException | IOException e) {
            System.out.println("ParseKeyWordException");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("ConnectedException");
            new ConnectedException(e);
            e.printStackTrace();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        } finally {
            System.out.println("Finally always run");
        }
    }
}

class RandomException {
    public static final int INTEGER = 2147483647;
    public static final String WORD = "table";

    RandomException(int i) throws Throwable {
        System.out.println(i);
        switch (i) {
            case 0: {
                if (INTEGER == 2147483647) {
                    throw new LastIntegerElementException("LastIntegerElementException");
                }
            }
            case 1: {
                if (WORD.equals("create") || WORD.equals("table") || WORD.equals("join")) {
                    throw new ParseKeyWordException("ParseKeyWordException");
                }
            }
            case 2: {
                throw new Exception("Exception");
            }
        }
    }
}


