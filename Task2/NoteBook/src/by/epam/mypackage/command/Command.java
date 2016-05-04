package by.epam.mypackage.command;

import MyException.CommandException;
import by.epam.mypackage.bean.Request;
import by.epam.mypackage.bean.Response;

public interface Command {
    Response execute(Request request) throws CommandException;
}
