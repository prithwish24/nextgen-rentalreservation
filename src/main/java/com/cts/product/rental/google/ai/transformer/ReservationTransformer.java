package com.cts.product.rental.google.ai.transformer;

import com.cts.product.rental.bo.Reservation;
import com.cts.product.rental.google.ai.bo.AIOutputContext;
import com.cts.product.rental.google.ai.bo.Fulfillment;
import com.cts.product.rental.util.Transformer;

@Transformer
public class ReservationTransformer {

	public Fulfillment transform(Reservation reservation) {
		Fulfillment fulfillment = new Fulfillment();
		fulfillment.setSpeech("Your Booking is Confirmed and the confirmation number is #" + reservation.getId());
		fulfillment.setDisplayText("Reservation #" + reservation.getId());
		
		AIOutputContext aiOutputContext = new AIOutputContext();
		aiOutputContext.setName("CarBooking");
		fulfillment.setContextOut(aiOutputContext);
		return fulfillment;
	}
	
}
