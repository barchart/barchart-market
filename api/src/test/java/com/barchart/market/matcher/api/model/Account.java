package com.barchart.market.matcher.api.model;

import com.barchart.feed.api.util.Identifiable;
import com.barchart.feed.api.util.Identifier;

public interface Account extends Message, Identifiable {
	
	String name();
	
	FCM fcm();
	
	@Override
	Identifier id();
	
	@Override
	boolean isNull();

}
