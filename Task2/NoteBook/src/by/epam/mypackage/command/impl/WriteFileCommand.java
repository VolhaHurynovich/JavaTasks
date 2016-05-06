package by.epam.mypackage.command.impl;


import by.epam.mypackage.command.CommandException;
import by.epam.mypackage.service.ServiceException;
import by.epam.mypackage.bean.Request;
import by.epam.mypackage.bean.Response;
import by.epam.mypackage.command.Command;
import by.epam.mypackage.service.ServiceFactory;


public class WriteFileCommand implements Command {

    @Override
    public Response execute(Request request) throws CommandException {
        Response response = new Response();
        try {
            ServiceFactory.getInstance().getNoteBookService().writeFile(request.getParameter1());
            response.setMessage("File was written");
            return response;
        } catch (ServiceException e) {
            throw new CommandException("File was not found",e);
        }
    }
}