package com.juliano.main;


import com.juliano.dao.SerieDao;
import com.juliano.principal.Principal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Etapa2Application implements CommandLineRunner {

    @Autowired
    private SerieDao repositorio;
    public static void main(String[] args) {
        SpringApplication.run(Etapa2Application.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        Principal principal = new Principal(repositorio);
        principal.exibeMenu();
    }

}