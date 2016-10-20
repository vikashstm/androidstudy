package study.myapp.android;

import android.app.Application;
import android.os.SystemClock;

import java.util.concurrent.TimeUnit;

/**
 * Created by vikash on 10/21/2016.
 */

public class MyAppApplication extends Application {

        @Override
        public void onCreate() {
            super.onCreate();
            // Don't do this! This is just so cold launches take some time
            SystemClock.sleep(TimeUnit.SECONDS.toMillis(3));
        }
}
