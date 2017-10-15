package ru.intodayer.bank;


public class NotEnoughMoneyException extends RuntimeException {
    public static <T extends Number> String getMessage(T moneyAmount, T requestedMoney) {
        return String.format(
                "Bank has: %s money, but requested: %s", moneyAmount, requestedMoney
        );
    }

    public NotEnoughMoneyException(String message) {
        super(message);
    }
}
