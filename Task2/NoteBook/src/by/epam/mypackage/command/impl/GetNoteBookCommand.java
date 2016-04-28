package by.epam.mypackage.command.impl;


import by.epam.mypackage.bean.Request;
import by.epam.mypackage.bean.Response;
import by.epam.mypackage.command.Command;
import by.epam.mypackage.service.ServiceFactory;
import by.epam.mypackage.view.NoteBookConsoleView;

public class GetNoteBookCommand implements Command {
    @Override
    public Response execute(Request request) {
        Response response = new Response();
        NoteBookConsoleView.print(ServiceFactory.getInstance().getNoteBookService().getNoteBook());
        response.setMessage("NoteBook is shown on console");
        return response;
    }
}
