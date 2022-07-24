package io.github.shiveshnavin.firestorejdbcjpademo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SampleRepo extends JpaRepository<Product,String > {

    List<Product> findBypIDAndAmount(String name, int userSeq);

}