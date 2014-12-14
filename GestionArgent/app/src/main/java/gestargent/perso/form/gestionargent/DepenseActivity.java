package gestargent.perso.form.gestionargent;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.widget.AdapterView.OnItemClickListener;


public class DepenseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depense);

        final ArrayList depenseDetails = getListData();
        final ListView listDepense = (ListView) findViewById(R.id.depenses);
        listDepense.setAdapter(new DepenseAdapter(this, depenseDetails));
        listDepense.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = listDepense.getItemAtPosition(position);
                DepenseItem newsData = (DepenseItem) o;
                Toast.makeText(DepenseActivity.this, "Selected :" + " " + newsData, Toast.LENGTH_LONG).show();
            }

        });
    }

    private ArrayList getListData() {
        ArrayList results = new ArrayList();
        DepenseItem depense = new DepenseItem();
        depense.setCategorie("Karaté");
        depense.setPrix("100");
        depense.setDate("14/12/2014");
        results.add(depense);

        depense = new DepenseItem();
        depense.setCategorie("Karaté");
        depense.setPrix("100");
        depense.setDate("14/13/2014");
        results.add(depense);

        depense = new DepenseItem();
        depense.setCategorie("Karaté");
        depense.setPrix("100");
        depense.setDate("14/12/2014");
        results.add(depense);

        depense = new DepenseItem();
        depense.setCategorie("Karaté");
        depense.setPrix("100");
        depense.setDate("14/12/2014");
        results.add(depense);

        depense = new DepenseItem();
        depense.setCategorie("Karaté");
        depense.setPrix("100");
        depense.setDate("14/12/2014");
        results.add(depense);

        depense = new DepenseItem();
        depense.setCategorie("Karaté");
        depense.setPrix("100");
        depense.setDate("14/12/2014");
        results.add(depense);

        return results;
    }
}
