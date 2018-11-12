package com.cas.app;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
        System.out.println( "Hello World!" );
        Cluster cluster = Cluster.builder().addContactPoints("192.168.31.255").build();
        Session session = cluster.newSession();
        ResultSet result = session.execute("select time,logitude,latitude from vehicle_tracker.location");
        for (Row row : result) {
			System.out.println(row.getDate("time")+"\t"+row.getDouble("longitude")+"\t"+row.getDouble("latitude"));
		}
    }
}
