package com.abrechnung.db;

import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SweetsDBAutomaticDelete {
	private SweetsDB db = SweetsDB.singleObject();

	public void runNewThread() {

		// Next run at midnight (UTC) - Replace with local time zone, if needed
		final ZonedDateTime now = ZonedDateTime.now(ZoneId.of("Europe/Vienna"));
		ZonedDateTime nextRun = now.withHour(0).withMinute(0).withSecond(0);

		// If midnight is in the past, add one day
		if (now.compareTo(nextRun) > 0) {
			nextRun = nextRun.plusDays(1);
		}

		// Get duration between now and midnight
		final Duration initialDelay = Duration.between(now, nextRun);

		// Schedule a task to run at midnight and then every day
		final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
		
		scheduler.scheduleAtFixedRate(() -> db.clearSweetsDB(),
				initialDelay.toMillis(),
				Duration.ofDays(1).toMillis(),
				TimeUnit.MILLISECONDS);
	}
	
}
