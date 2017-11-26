package model;

public enum Type {

    USER("user"), BOT("agent");

    Type(String type) {
        this.type = type;
    }

    String type;

    public String getType() {
        return this.type;
    }
}
