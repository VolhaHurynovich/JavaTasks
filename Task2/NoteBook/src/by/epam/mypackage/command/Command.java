package by.epam.mypackage.command;

import by.epam.mypackage.bean.Request;
import by.epam.mypackage.bean.Response;
import by.epam.mypackage.service.ServiceException;

public interface Command {
    Response execute(Request request) throws CommandException;
}
