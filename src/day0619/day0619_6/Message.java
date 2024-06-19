package day0619.day0619_6;

import java.util.Objects;

public class Message {
    private String command;
    private String to;

    public Message(String command, String to) {
        this.command = command;
        this.to = to;
    }

    public String getCommand() {
        return command;
    }

    public String getTo() {
        return to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Message message)) return false;
        return Objects.equals(command, message.command) && Objects.equals(to, message.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(command, to);
    }
}
