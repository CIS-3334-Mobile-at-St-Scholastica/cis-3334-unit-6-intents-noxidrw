package css.cis3334.intentsperformances;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.GregorianCalendar;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button btn1Web,btn2Web,btn3Web, but1Calendar,but2Calendar, but3Calendar, btn1Map, btn2Map, btn3Map;
    TextView textViewStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewStatus = (TextView) findViewById(R.id.textViewStatus);
        setupButtonClickEvents();
        setupButtonClickEvents2();
        setupButtonClickEvents3();



    }


    private void setupButtonClickEvents() {
        /**
         *   Set up button click event listener for the web info button for the first performance
         */
        btn1Web = (Button) findViewById(R.id.button1WebInfo);
        btn1Web.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                textViewStatus.setText("Code should display website for performance 1");
                Uri webpage = Uri.parse("http://www.css.edu/about/spotlight-arts-and-lectures.html");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                // Check for app to view webpages
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(webIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                if (activities.size() > 0){     // found at least 1 app to view
                    startActivity(webIntent);   // starts the web app
                }

            }
        });

        /**
         *   Set up button click event listener for the celendar button for the first performance
         *       Use the calendar intent to set an event reminder on the calendar
         */
        but1Calendar = (Button) findViewById(R.id.button1Calendar);
        but1Calendar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                textViewStatus.setText("Code should set a calendar event for performance 1");
                Intent calIntent = new Intent(Intent.ACTION_INSERT);
                calIntent.setType("vnd.android.cursor.item/event");
                calIntent.putExtra(CalendarContract.Events.TITLE, "SAL Colloquium 'The Robot Next Door'");
                calIntent.putExtra(CalendarContract.Events.EVENT_LOCATION, "Tower Hall 4119");
                GregorianCalendar begDate = new GregorianCalendar(2017, 2, 24, 15, 40);
                GregorianCalendar endDate = new GregorianCalendar(2017, 2, 24, 16, 40);
                calIntent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                        begDate.getTimeInMillis());
                calIntent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                        endDate.getTimeInMillis());
                // check for calendar app
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(calIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                if (activities.size() > 0){     // found at least 1 app to add calendar item
                    startActivity(calIntent);   // starts the calendar app
                }


            }
        });

        /**
         *   Set up button click event listener for the web info button for the first performance
         */
        btn1Map = (Button) findViewById(R.id.button1map);
        btn1Map.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                textViewStatus.setText("Code should display map for performance 1");
                // Map point based on address
                Uri location = Uri.parse("geo:0,0?q=1200 Kenwood Ave, Duluth, MN");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
                // check for calendar app
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(mapIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                if (activities.size() > 0){     // found at least 1 app to view map item
                    startActivity(mapIntent);   // starts the map app
                }
            }
        });


    }

    private void setupButtonClickEvents2() {
        /**
         *   Set up button click event listener for the web info button for the first performance
         */
        btn2Web = (Button) findViewById(R.id.button1WebInfo2);
        btn2Web.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                textViewStatus.setText("Code should display website for performance 1");
                Uri webpage = Uri.parse("http://www.css.edu/about/spotlight-arts-and-lectures/calendar.html?trumbaEmbed=eventid%3d140595644%26view%3devent%26-childview%3d");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                // Check for app to view webpages
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(webIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                if (activities.size() > 0){     // found at least 1 app to view
                    startActivity(webIntent);   // starts the web app
                }

            }
        });

        /**
         *   Set up button click event listener for the celendar button for the first performance
         *       Use the calendar intent to set an event reminder on the calendar
         */
        but2Calendar = (Button) findViewById(R.id.button1Calendar2);
        but2Calendar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                textViewStatus.setText("Code should set a calendar event for performance 1");
                Intent calIntent = new Intent(Intent.ACTION_INSERT);
                calIntent.setType("vnd.android.cursor.item/event");
                calIntent.putExtra(CalendarContract.Events.TITLE, "Zenith City Sings");
                calIntent.putExtra(CalendarContract.Events.EVENT_LOCATION, "Mitchell Auditorium");
                GregorianCalendar begDate = new GregorianCalendar(2020, 3, 24, 19, 00);
                GregorianCalendar endDate = new GregorianCalendar(2020, 3, 24, 21, 00);
                calIntent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                        begDate.getTimeInMillis());
                calIntent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                        endDate.getTimeInMillis());
                // check for calendar app
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(calIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                if (activities.size() > 0){     // found at least 1 app to add calendar item
                    startActivity(calIntent);   // starts the calendar app
                }


            }
        });

        /**
         *   Set up button click event listener for the web info button for the first performance
         */
        btn2Map = (Button) findViewById(R.id.button1map2);
        btn2Map.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                textViewStatus.setText("Code should display map for performance 1");
                // Map point based on address
                Uri location = Uri.parse("geo:0,0?q=1200 Kenwood Ave, Duluth, MN");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
                // check for calendar app
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(mapIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                if (activities.size() > 0){     // found at least 1 app to view map item
                    startActivity(mapIntent);   // starts the map app
                }
            }
        });


    }

    private void setupButtonClickEvents3() {
        /**
         *   Set up button click event listener for the web info button for the first performance
         */
        btn3Web = (Button) findViewById(R.id.button1WebInfo3);
        btn3Web.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                textViewStatus.setText("Code should display website for performance 1");
                Uri webpage = Uri.parse("http://www.css.edu/about/spotlight-arts-and-lectures/calendar.html?trumbaEmbed=eventid%3d141260135%26view%3devent%26-childview%3d");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                // Check for app to view webpages
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(webIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                if (activities.size() > 0){     // found at least 1 app to view
                    startActivity(webIntent);   // starts the web app
                }

            }
        });

        /**
         *   Set up button click event listener for the celendar button for the first performance
         *       Use the calendar intent to set an event reminder on the calendar
         */
        but3Calendar = (Button) findViewById(R.id.button1Calendar3);
        but3Calendar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                textViewStatus.setText("Code should set a calendar event for performance 1");
                Intent calIntent = new Intent(Intent.ACTION_INSERT);
                calIntent.setType("vnd.android.cursor.item/event");
                calIntent.putExtra(CalendarContract.Events.TITLE, "Bring the Sing");
                calIntent.putExtra(CalendarContract.Events.EVENT_LOCATION, "Mitchell Auditorium");
                GregorianCalendar begDate = new GregorianCalendar(2020, 3, 28, 10, 00);
                GregorianCalendar endDate = new GregorianCalendar(2020, 3, 28, 13, 00);
                calIntent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                        begDate.getTimeInMillis());
                calIntent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                        endDate.getTimeInMillis());
                // check for calendar app
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(calIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                if (activities.size() > 0){     // found at least 1 app to add calendar item
                    startActivity(calIntent);   // starts the calendar app
                }


            }
        });

        /**
         *   Set up button click event listener for the web info button for the first performance
         */
        btn3Map = (Button) findViewById(R.id.button1map3);
        btn3Map.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                textViewStatus.setText("Code should display map for performance 1");
                // Map point based on address
                Uri location = Uri.parse("geo:0,0?q=1200 Kenwood Ave, Duluth, MN");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
                // check for calendar app
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(mapIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                if (activities.size() > 0){     // found at least 1 app to view map item
                    startActivity(mapIntent);   // starts the map app
                }
            }
        });


    }


}
