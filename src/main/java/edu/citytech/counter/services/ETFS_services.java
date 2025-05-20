package edu.citytech.counter.services;

import java.util.ArrayList;
import jakarta.inject.Singleton;
import java.util.List;
import static com.mongodb.client.model.Projections.include;
import static com.mongodb.client.model.Sorts.descending;

import org.bson.conversions.Bson;
import org.bson.Document;

import edu.citytech.counter.dto.ETFS;
import edu.citytech.counter.utility.DB_Utility;

@Singleton
public class ETFS_services {
    final static String databaseName = "stocks";
    final static String collection = "ETFs";
    final Bson projection = include("rank", "symbol", "fundName", "price", "quantRating", "aumInBillion", "frequency", "yieldFwd", "payOutDate", "gpaETFDividends", "expenseRatio");
    Bson find = new Document();
    Bson sort = descending("symbol");

    public List<ETFS> findAll() {
        List<ETFS> list = new ArrayList<>();
        DB_Utility.query(ETFS.class, list::add, databaseName, collection, projection, find, sort);
        return list;
    }
    
    public List<ETFS> findOne(String symbol) {
        List<ETFS> list = new ArrayList<>();
        final Bson find = new Document("symbol", symbol);
        DB_Utility.query(ETFS.class, list::add, databaseName, collection, projection, find, sort);
        return list;
    }
}
