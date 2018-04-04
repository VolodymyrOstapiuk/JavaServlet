package ua.tef.exception;

import ua.tef.model.entity.Consumer;

public class NicknameAlreadyExistsException extends Exception
{
    private Consumer consumer;

    public NicknameAlreadyExistsException(String message, Consumer consumer) {
        super(message);
        this.consumer = consumer;
    }

    public Consumer getConsumer() {
        return consumer;
    }
}
