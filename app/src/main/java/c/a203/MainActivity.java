package c.a203;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ContactOperations.Insert2Contacts(getApplicationContext(),
                "Unknown Number 1", "05321000000");
        if (ContactOperations.isTheNumberExistsinContacts(
                getApplicationContext(), "05321000000")) {
            Log.i(ContactOperations.TAG, "Exists");
        } else {
            Log.i(ContactOperations.TAG, "Not Exists");
        }
        ContactOperations.deleteContact(getApplicationContext(), "05321000000");
        if (ContactOperations.isTheNumberExistsinContacts(
                getApplicationContext(), "05321000000")) {
            Log.i(ContactOperations.TAG, "Exists");
        } else {
            Log.i(ContactOperations.TAG, "Not Exists");
        }
        setContentView(R.layout.activity_main);
    }

}
