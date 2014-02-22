package models.Attributes;

import javax.xml.bind.ValidationException;

public class Age {
    private int age;

    public Age(int age) throws ValidationException {
        this.age = valid(age);
    }

    private int valid(int age) throws ValidationException {
        if(age > 0){
            return age;
        }
        else {
            throw new ValidationException("Invalid Age");
        }
    }
}
