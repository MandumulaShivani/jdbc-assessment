package com.dxc.assessment;

import com.dxc.assessment.dao.AuthorDao;
import com.dxc.assessment.dao.AuthorDaoImpl;
import com.dxc.assessment.modal.Author;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        
        Author author = new Author(101, "David", "paul", "fantasy", "david123gamil.com");

        AuthorDao authorDao = new AuthorDaoImpl();
        System.out.println(author);
    }

    
}
