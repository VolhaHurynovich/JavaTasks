package by.epam.mypackage.command.impl;


import by.epam.mypackage.bean.Note;
import by.epam.mypackage.bean.Request;
import by.epam.mypackage.bean.Response;
import by.epam.mypackage.command.Command;
import by.epam.mypackage.command.CommandException;
import by.epam.mypackage.service.ServiceException;
import by.epam.mypackage.service.ServiceFactory;
import by.epam.mypackage.view.NoteBookConsoleView;

import java.util.List;

public class SearchByTextCommand implements Command {
    @Override
    public Response execute(Request request) throws CommandException {
        Response response = new Response();
        try{
        List<Note> listNote = ServiceFactory.getInstance().getNoteBookService().searchByText(request.getParameter1());
        if (listNote.size() > 0) {
            NoteBookConsoleView.print(listNote);
            response.setMessage("Note found");
            return response;
        }else{
            response.setMessage("Note did not find");
            return response;
        }
        }catch (ServiceException e){
            throw new CommandException("ServiceException",e);
        }
    }
}