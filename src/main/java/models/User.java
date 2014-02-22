package models;

import models.Attributes.Age;
import models.Attributes.Country;
import models.Attributes.Gender;
import models.Attributes.Name;

public class User implements Get<User> {

    private int id;
    private Name name;
    private Country country;
    private Age age;
    private Gender gender;

    @Override
    public int identifier() {
        return this.id;
    }
}
