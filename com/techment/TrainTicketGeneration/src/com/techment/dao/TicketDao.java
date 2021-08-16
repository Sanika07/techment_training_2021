package com.techment.dao;

import java.time.LocalDate;
import java.util.Map;

import com.techment.model.Passenger;
import com.techment.model.Train;

public interface TicketDao {
	
	Train findTrain(int tno);
	Map<Passenger, Double> addPassenger(Train train);
	double calcPassengerFare(Map<Passenger, Double> map);
	String generatePNR(Train train,LocalDate ld);
	void generateTicket(Train train,String Pnr,String date,Map<Passenger, Double> hashMap,Double TotalFare);
	
	public static final String  DRIVER_NAME="com.mysql.cj.jdbc.Driver";
	public static final String URL="jdbc:mysql://localhost:3306/techment?autoReconnect=true&useSSL=false";
	public static final String USERNAME="root";
	public static final String PASSWORD="mysql123";
}
