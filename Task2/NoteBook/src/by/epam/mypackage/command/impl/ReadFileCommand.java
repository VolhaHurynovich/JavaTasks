package by.epam.mypackage.command.impl;


import by.epam.mypackage.command.CommandException;
import by.epam.mypackage.service.ServiceException;
import by.epam.mypackage.bean.Request;
import by.epam.mypackage.bean.Response;
import by.epam.mypackage.command.Command;
import by.epam.mypackage.service.ServiceFactory;


public class ReadFileCommand implements Command {

    @Override
    public Response execute(Request request) throws CommandException {
        Response response = new Response();
        try {
            ServiceFactory.getInstance().getNoteBookService().readFile(request.getParameter1());
            response.setMessage("File was read");
            return response;
        } catch (ServiceException e) {
            throw new CommandException("File was not read",e);
        }

    }
}