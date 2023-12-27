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
public class Route {
    @CsvBindByName(column = "Exchange")
    private String exchange;

    @CsvBindByName(column = "Path")
    private String path;
}
