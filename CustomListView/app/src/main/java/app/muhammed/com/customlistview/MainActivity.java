package app.muhammed.com.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView mContactListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initUI();
    }

    private void initUI() {
        mContactListView = (ListView) findViewById(R.id.contact_list_view);
        ContactAdapter adapter = new ContactAdapter(this,getContacts());
        mContactListView.setAdapter(adapter);
    }





    public ArrayList<ContactModel> getContacts(){
        ArrayList<ContactModel> contactModels = new ArrayList<>();
        ContactModel contactOne = new ContactModel();

        contactOne.setName("Muhammed");
        contactOne.setEmail("muhammed@gamil.com");
        contactOne.setPhone("8086461927");
        contactOne.setAddress("Ernakulam");

        contactModels.add(contactOne);



        ContactModel contactTwo = new ContactModel();

        contactTwo.setName("Abi");
        contactTwo.setEmail("muhammed@gamil.com");
        contactTwo.setPhone("8086461927");
        contactTwo.setAddress("Ernakulam");



        contactModels.add(contactTwo);




        ContactModel contactThree = new ContactModel();

        contactThree.setName("Nishad");
        contactThree.setEmail("muhammed@gamil.com");
        contactThree.setPhone("8086461927");
        contactThree.setAddress("Ernakulam");


        contactModels.add(contactThree);






        return contactModels;
    }
}
