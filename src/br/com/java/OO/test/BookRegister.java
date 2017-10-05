package br.com.java.OO.test;

import br.com.java.OO.business.ShoppingCart;
import br.com.java.OO.entity.Ebook;
import br.com.java.OO.entity.PhysicalBook;
import br.com.java.OO.livraria.Author;

/**
 * Created by Francislin Dos Reis on 30/08/17.
 */
public class BookRegister {
    public static void main(String[] args) {

        Author author = new Author();
        author.setName("Rodrigo Turini");
        author.setEmail("rodrigo.turini@caelum.com.br");
        author.setCpf("123.456.789.10");

        Author author1 = new Author();
        author1.setName("Frans kings");
        author1.setEmail("franskings.souza@teste.com");
        author1.setCpf("402.080.538-59");

        Ebook eBook01 = new Ebook(author);
        eBook01.setName("Programing logic");
        eBook01.setDescription("Create your first programs");
        eBook01.setValue(59.90);
        eBook01.applyDiscountFromBook(0.1);
        eBook01.setIsbn("978-85-66250-22-0");
        eBook01.ShowDetails();

        Ebook eBook02 = new Ebook(author1);
        eBook02.setName("Programing logic");
        eBook02.setDescription("Create your fist programs in Java");
        eBook02.setValue(59.90);
        eBook02.applyDiscountFromBook(0.1);
        eBook02.setIsbn("978-85-66250-22-0");
        eBook02.ShowDetails();

        PhysicalBook physicalBook = new PhysicalBook();
        physicalBook.setName("Programing logic");
        physicalBook.setDescription("Create your programs");
        physicalBook.setValue(59.90);
        physicalBook.applyDiscountFromBook(0.1);
        physicalBook.setIsbn("978-85-66250-22-0");
        physicalBook.ShowDetails();

        ShoppingCart cart = new ShoppingCart();
        cart.add(eBook01);
        cart.add(eBook02);
        cart.add(physicalBook);
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Total R$: " + cart.getTotal());
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
