package by.epam.mypackage.command.impl;


import by.epam.mypackage.bean.Request;
import by.epam.mypackage.bean.Response;
import by.epam.mypackage.command.Command;
import by.epam.mypackage.command.CommandException;
import by.epam.mypackage.service.ServiceException;
import by.epam.mypackage.service.ServiceFactory;
import by.epam.mypackage.view.NoteBookConsoleView;

public class GetNoteBookCommand implements Command {
    @Override
    public Response execute(Request request) throws CommandException {
        Response response = new Response();
        try {
            NoteBookConsoleView.print(ServiceFactory.getInstance().getNoteBookService().getNoteBook());
        }catch (ServiceException e){
            throw new CommandException("ServiceException",e);
        }
        response.setMessage("NoteBook is shown on console");
        return response;
    }
}
