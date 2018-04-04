package ua.tef.model;


import ua.tef.exception.NicknameAlreadyExistsException;
import ua.tef.model.entity.Consumer;
import ua.tef.view.View;

public class Model {
    private Consumer consumer;
    private Notepad notepad = Notepad.user1;
    public void processNewConsumer(Consumer consumer) throws NicknameAlreadyExistsException {
        if(notepad.isNicknameSet(consumer.getNickname())){
            throw new NicknameAlreadyExistsException(View.NICKNAME_ALREADY_EXISTS_CAPTION,consumer);
        }
        consumer.toString();
    }
    public boolean isNickNameAvailable(String nickname){
        if (notepad.isNicknameSet(nickname)){
            return false;
        }else {
            return true;
        }
    }
    public Consumer getConsumer() {
        return consumer;
    }

    public void setConsumer(Consumer consumer) {
        this.consumer = consumer;
    }
}
