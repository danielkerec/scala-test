package controllers;

import models.Book;
import play.data.Form;
import play.data.FormFactory;
import play.i18n.MessagesApi;
import play.mvc.Controller;
import play.mvc.Result;
import scala.Int;

import java.util.Set;
import views.html.Books.*;

import javax.inject.Inject;

public class BooksController extends Controller {

    @Inject
    FormFactory formFactory;

    //for all books
    public Result index(){
        Set<Book> books = Book.allBooks();

        return ok(index.render(books));
    }

    //to create book
    public Result create(){
        Form<Book> bookForm = formFactory.form(Book.class);


        return ok(create.render(bookForm));
    }

    //SAVE BOOK

    public Result save(){
        return null;
    }

    //edit book

    public Result edit(Integer id){
        return null;
    }

    public Result update(){
        return null;
    }

    public Result destroy(Integer id){
        return null;
    }

    //for book details

    public Result show(Integer id){
        return null;
    }
}
