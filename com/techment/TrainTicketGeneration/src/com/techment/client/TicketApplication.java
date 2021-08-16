package com.techment.client;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;

import com.techment.model.Passenger;
import com.techment.model.Ticket;
import com.techment.model.Train;

public class TicketApplication {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ticket ticket = new Ticket();
		System.out.println("Please Enter the Train Number : ");
		int no = sc.nextInt();
	
		Train train =ticket.findTrain(no); 
		if(train==null)
			System.out.println("No Train With This Train Number ");
		else
		{
		System.out.println("Enter the Travel Date ");
		System.out.println("Enter The year of journey : ");
		int year = sc.nextInt();
		System.out.println("Enter The Month of Journey : ");
		int month = sc.nextInt();
		if(month>12)
			System.out.println("Please Enter Proper Month");
		else
		{
			System.out.println("Enter The Date of Journey : ");
			int day = sc.nextInt();
			if(day>31)
				System.out.println("Please Enter Proper date");
			else {
				LocalDate ld = LocalDate.of(year, month, day);				
				if(ld.isBefore(LocalDate.now()))
				{
					System.out.println("Please Enter the Valid Date");
				}
				else
					{
					
					System.out.println("Date Parameter Succeded.");				
					Map<Passenger, Double> hashMap = new TreeMap<Passenger, Double>();
					hashMap = ticket.addPassenger(train);
					System.out.println();
					Double TotalFare = ticket.calcPassengerFare(hashMap);					
					String PNR = ticket.generatePNR(train, ld);
					System.out.println();
					System.out.println();
					System.out.println("=====================Ticket Format in Text File============================================");
					System.out.println("PNR  : " +PNR);
					System.out.println("Train No  : " +train.getTrainNo());
					System.out.println("Train Name  : " +train.getTrainName());
					System.out.println("Source  : " +train.getSource());
					System.out.println("To  : " +train.getDestination());
					String Id = ld.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
					System.out.println("Travel Date  : " +Id);
					System.out.println();
					System.out.println();
					System.out.println("Passengers : ");
		
					for(Entry<Passenger, Double> entry : hashMap.entrySet())
					{
						System.out.println(entry);
					}
					System.out.println();
					System.out.println("Total Price : " + TotalFare );
					ticket.generateTicket(train, PNR, Id, hashMap, TotalFare);
					sc.close();
				
					
					}
			}
			
		}
		
	}

}}