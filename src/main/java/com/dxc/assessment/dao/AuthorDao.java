package com.dxc.assessment.dao;

import java.util.List;
import com.dxc.assessment.modal.Author;

public interface AuthorDao {

    class author {

        private static final String INSERT_ONE_AUTHOR;
    
        private static final String SELECT_ALL_AUTHOR;
    
        private static final String USER_NAME;
        private static final String PASSWORD;
        private static final String URL;
    
        static {
            INSERT_ONE_AUTHOR = "INSERT INTO authors (title, author, isbn) VALUES (?, ?, ?)";
            SELECT_ALL_AUTHOR = "SELECT * FROM author";
    
            USER_NAME = "root";
            PASSWORD = "password";
    
            // URL = "jdbc:mysql://server-name or server-ip-address:port/database-name";
            URL = "jdbc:mysql://localhost:3306/dxc";
        }
    }

    Author create(Author author);

    Author findById(Long id);

    List<Author> findByfirst_name(String first_name);

    List<Author> findBylast_name(String last_name);
 
    List<Author> findByGenre(String genre);

    List<Author> findByEmail(String email);

    List<Author> findAll();


    
}
