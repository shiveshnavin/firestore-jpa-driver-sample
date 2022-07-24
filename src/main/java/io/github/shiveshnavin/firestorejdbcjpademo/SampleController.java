package io.github.shiveshnavin.firestorejdbcjpademo;


import io.github.shiveshnavin.firestore.jdbc.FirestoreJDBCConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class SampleController {

    @Autowired
    SampleRepo repo;

    @GetMapping("/all")
    public List<Product> home(){

        List<Product> all = repo.findAll();
        return all;
    }

    @GetMapping("/create")
    public Product newProd(){
        Product p = new Product();
        p.amount = 1000;
        p.status = "deleted";
        p.pID = "t_"+System.currentTimeMillis();
        p.timeStamp = System.currentTimeMillis();

        repo.saveAndFlush(p);
        return p;
    }

    @GetMapping("/delete/:id")
    public String delProd(@PathParam("id") String id){

        repo.deleteById(id);
        return "Deleted";
    }

    @GetMapping("/view/:id")
    public Product getProd(@PathParam("id") String id){

        return repo.findById(id).get();
    }

}