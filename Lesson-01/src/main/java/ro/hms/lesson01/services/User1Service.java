package ro.hms.lesson01.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class User1Service {

    @Autowired
    Users1 users1;

    public Users1 getServiceUser1(){
        users1.getTotalUsers();
        return users1;
    }
}
