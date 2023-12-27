package org.example.leastcostrouting.model;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Network {
    @CsvBindByName(column = "Source Network Element")
    private String sourceNetworkElement;

    @CsvBindByName(column = "Link")
    private String link;

    @CsvBindByName(column = "Destination Network Element")
    private String destinationNetworkElement;
}
