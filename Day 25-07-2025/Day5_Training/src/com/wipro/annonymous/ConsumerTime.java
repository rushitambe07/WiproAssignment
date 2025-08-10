package com.wipro.annonymous;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.function.Consumer;

public class ConsumerTime {
	public static void main(String[] args) {
		
		Consumer<String> printLondonTime = zone -> {
            ZonedDateTime time = ZonedDateTime.now(ZoneId.of(zone));
            System.out.println("Current time in " + zone + time);
        };

        printLondonTime.accept("Asia/Kolkata");
	}

}
