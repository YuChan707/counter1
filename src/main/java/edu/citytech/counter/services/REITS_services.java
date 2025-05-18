package edu.citytech.counter.services;

import java.util.ArrayList;
import jakarta.inject.Singleton;
import java.util.List;
import static com.mongodb.client.model.Projections.include;
import static com.mongodb.client.model.Sorts.descending;

import org.bson.conversions.Bson;
import org.bson.Document;

import edu.citytech.counter.dto.REITS;
import edu.citytech.counter.utility.DB_Utility;
@Singleton
public class REITS_services {

    final static String databaseName = "stocks";
    final static String collection = "reits";
    final Bson projection = include("rank", "symbol", "marketCapInBillions");
    Bson find = new Document();
    Bson sort = descending("symbol");

    public List<REITS> findAll() {
        List<REITS> list = new ArrayList<>();
        DB_Utility.query(REITS.class, list::add, databaseName, collection, projection, find, sort);
        return list;
    }
    

}
