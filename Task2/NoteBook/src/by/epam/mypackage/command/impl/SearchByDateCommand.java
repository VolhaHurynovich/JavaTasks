package by.epam.mypackage.command.impl;


import MyException.CommandException;
import by.epam.mypackage.bean.Note;
import by.epam.mypackage.bean.Request;
import by.epam.mypackage.bean.Response;
import by.epam.mypackage.command.Command;
import by.epam.mypackage.service.ServiceFactory;
import by.epam.mypackage.view.NoteBookConsoleView;



import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class SearchByDateCommand implements Command {
    @Override
    public Response execute(Request request) throws CommandException {
        Response response = new Response();
        List<Note> listNote;
        try {
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            listNote = ServiceFactory.getInstance().getNoteBookService().searchByDate(format.parse(request.getParameter1()));
        } catch (ParseException e) {
            throw new CommandException("Date is wrong",e);
        }
        if (listNote.size() > 0) {
            NoteBookConsoleView.print(listNote);
            response.setMessage("Note found");
            return response;
        }else{
            response.setMessage("Note did not find");
            return response;
        }
    }
}