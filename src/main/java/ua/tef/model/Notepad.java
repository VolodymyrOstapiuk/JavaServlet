package ua.tef.model;

public enum  Notepad {
    user1("user");
    private final String nickname;
    Notepad(String nickname){
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public boolean isNicknameSet(String nickname){
        for(Notepad data: Notepad.values()){
            if (data.getNickname().equals(nickname)){
                return true;
            }
        }
        return false;
    }
}
