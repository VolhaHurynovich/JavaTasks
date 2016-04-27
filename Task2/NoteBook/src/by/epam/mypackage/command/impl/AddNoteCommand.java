package by.epam.mypackage.command.impl;

import by.epam.mypackage.bean.Request;
import by.epam.mypackage.bean.Response;
import by.epam.mypackage.command.Command;
import by.epam.mypackage.service.NoteBookService;
import by.epam.mypackage.service.ServiceFactory;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AddNoteCommand implements Command {

    @Override
    public Response execute(Request request) {
        Response response = new Response();

        if (request.getCommandName() == null) {
            response.setErrorMessage("No command");
            return response;
        }

        Date date = new Date();
        if (request.getDate() != null) {
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            try {
                date = format.parse(request.getDate());
            } catch (ParseException e) {
                response.setErrorMessage("Date is wrong");
            }
        }

        NoteBookService service = ServiceFactory.getInstance().getNoteBookService();
        service.addNote(request.getParameter(), date);
        response.setMessage("Note added");
        return response;
    }
}
