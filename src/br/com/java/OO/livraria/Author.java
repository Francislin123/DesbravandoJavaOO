package br.com.java.OO.livraria;

/**
 * Created by Francislin Dos Reis on 30/08/17.
 */
public class Author {
    private String name;
    private String email;
    private String cpf;

    public void ShowDetailsAuthor() {
        String message = "Showing Details Author";
        System.out.println(message);
        System.out.println("Name: " + name);
        System.out.println("E-mail: " + email);
        System.out.println("CPF: " + cpf);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Author)) return false;
        Author author = (Author) obj;
        return this.name.equals(author.name);
    }
}
