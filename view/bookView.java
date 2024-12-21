package view;

import java.sql.ResultSet;
import java.sql.SQLException;

import Controller.bookController;
import model.book;


public class bookView {
    public static void main(String[] args) {
  
      // addStudent();
      // deletestudent();
      getAllStudent();
    }
    static void addStudent(){
        int price = 1500;
        String Category = "English";

        String Publisher = "Oneway";

        String StoreName = "KWAY";
         int TotalPage = 150;
         book newbook = new book(price, Category, Publisher, StoreName, TotalPage);
         bookController sc = new bookController();
         int result = sc.insertbook(newbook);
         if(result > 0){
            System.out.println("Student add successfully");
        }
        else{
            System.out.println("Failed to add Student");
        }
    }
    static void deletebook(){
        bookController controller = new bookController();
        int result = controller.deletebookByStoreName("Kway");
    }

    
}
