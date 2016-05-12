package parser.stax;

public enum MenuTagName {
   ALL_LIBRARIES ,LIBRARY, LIBRARY_NAME, BOOK, GENRE, TITLE, AUTHOR, FIRST_NAME, LAST_NAME, COUNT_PAGE, YEAR_CREATE, COUNTRY;

   public static MenuTagName getElementTagName(String element){
      switch (element){
         case "All-Libraries":
            return ALL_LIBRARIES;
         case "Library":
            return LIBRARY;
         case "Library-Name":
            return LIBRARY_NAME;
         case "Book":
            return BOOK;
         case "Genre":
            return GENRE;
         case "Title":
            return TITLE;
         case "Author":
            return AUTHOR;
         case "First-Name":
            return FIRST_NAME;
         case "Last-Name":
            return LAST_NAME;
         case "Count-Page":
            return COUNT_PAGE;
         case "Year-Create":
            return YEAR_CREATE;
         case "Country":
            return COUNTRY;
         default:
            throw new EnumConstantNotPresentException(MenuTagName.class,element);
      }
   }

}
