package com.sirius.vpn.common.javashell;

public interface LocalCommandExecutor {
    ExecuteResult executeCommand(String command, long timeout);
}