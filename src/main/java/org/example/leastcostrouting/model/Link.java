package org.example.leastcostrouting.model;

import com.opencsv.bean.CsvBindByName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Link {
    @CsvBindByName(column = "Name")
    private String name;
    @CsvBindByName(column = "Price (in pence)")
    private Long price;
}
