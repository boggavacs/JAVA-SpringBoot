package ro.hms.lesson01.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Component;

@Component
public class Users1 {

    public ArrayList<User1> getTotalUsers(){
        ArrayList<User1> totalUsers = new ArrayList<>();
        totalUsers.add(new User1("some name", "some Id"));
         totalUsers.add(new User1("some name", "some Id"));
        return totalUsers;
    }

}
