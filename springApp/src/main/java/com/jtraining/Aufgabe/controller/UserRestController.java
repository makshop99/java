package com.jtraining.Aufgabe.controller;

import com.jtraining.Aufgabe.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Random;

@RestController
public class UserRestController
{
    java.util.HashMap lUsers = new HashMap();

    public UserRestController()
    {
        lUsers.put(1, new User("Smith", "Carl"));
        lUsers.put(2, new User("Jones", "Betty"));
        lUsers.put(3, new User("Malone", "Tom"));
        lUsers.put(4, new User("McDaniels", "Sahra"));
        lUsers.put(5, new User("Efferson", "Pete"));
    }

    // GET /users -> Liefert alle User zurück
    @GetMapping("/user/list")
    public HashMap getAll()
    {
        return lUsers;
    }

    // GET /user/{id} -> Liefert einen User mit der entsprechenden id zurück, ansonsten einen 404er Fehler
    @GetMapping("/user/search")
    public User searchUser(@RequestParam Integer userid)
    {
        User oUser = (User) lUsers.get(userid);

        if (oUser == null) return new User("user not found", "");
        return oUser;
    }

    // POST /user?firstName={firstName}&lastName={lastName} -> Legt einen neuen User an. Generiere als Id eine Zufallszahl.
    // Der Wertebereich sollte groß genug sein, um eine Kollision zu vermeiden.
    @PostMapping("/user/create")
    public HashMap createUser(@RequestParam String firstName, @RequestParam String lastName)
    {
        Integer lNewKey = 1;
        while (lUsers.containsKey(lNewKey)) lNewKey = new Random().nextInt(1000000);
        lUsers.put(lNewKey, new User(firstName, lastName));
        return lUsers;
    }

    // PUT /user/{id}/{lastname} -> Ändert den Nachnamen des Users mit der entsprechenden Id.
    // Ansonsten soll ein 400er Fehler zurückkommen.
    @PutMapping("/user/changename")
    public User changeName(@RequestParam Integer id, @RequestParam String lastName)
    {
        if (!lUsers.containsKey(id)) return (new User("user not found", ""));

        User oUser = (User) lUsers.get(id);
        oUser.setLastName(lastName);
        lUsers.put(id, oUser);
        return oUser;
    }

    // DELETE /user/{id} -> Löscht den entsprechenden User aus der Liste
    @DeleteMapping("/user/delete")
    public String deleteUser(@RequestParam Integer id)
    {
        if (!lUsers.containsKey(id)) return "User with ID " + id.toString() + " not found";

        String sReturn = "User " + id.toString() + " - (";
        User oUser = (User) lUsers.get(id);
        sReturn += oUser.toString() + ") deleted!";
        lUsers.remove(id);
        return sReturn;
    }

}
