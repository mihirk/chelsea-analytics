package models;

import models.Attributes.Name;

public class SKU implements Get<SKU> {
    private int id;
    private Name name;

    public int identifier() {
        return id;
    }
}
