package io.github.pucted.fastcommand;

import java.util.List;

public interface FastCommandSender {

    void sendMessage(String message);
    boolean hasPermission(String permission);
    List<String> getPermissions();
    String getName();

}
