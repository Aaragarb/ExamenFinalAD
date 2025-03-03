package org.example.examenfinalad;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "items")
@Data
public class Item {

    @Id
    private String _id;

    private String title;
    private int price;
    private String category;
    private String description;
    private int rate;
    private int count;
    private String image;

}
