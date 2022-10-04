package com.cats.cats;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatRoutes {

  @GetMapping("/cats")
  public ArrayList<Cat> getAllCats() {
    return Cat.cats;
  }

  @GetMapping("/cats/{id}")
  public Cat getSingleCat(@PathVariable Integer id) {
    Cat match = null;

    for (Cat cat : Cat.cats) {
      if (cat.id == id) {
        match = cat;
      }
    }

    if (match == null)
      throw new Error("Cat nout found.");

    return match;
  }

  @PostMapping("/cats")
  public Cat createCat(@RequestBody Cat cat) {
    return cat;
  }

  @DeleteMapping("/cats/{id}")
  public void deleteCat(@PathVariable Integer id) {
    Cat.cats.removeIf(cat -> cat.id == id);
  }

  // @PatchMapping("/cats/{id}")
  // public Cat updateCat(@PathVariable Integer id, @RequestBody Cat catData) {
  // // find the cat we want to update
  // // update the cat using the details from *catData*
  // // cat.name = catData.name
  // // return the updated cat
  // }

}

// app.get("/x", (req, res) => {
// res.send("X")
// })

// const cats = [{}];
// app.get("/cats", (req, res) => {
// res.send(cats)
// })
