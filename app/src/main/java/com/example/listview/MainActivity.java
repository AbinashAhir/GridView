package com.example.listview;

import android.os.Bundle;

import android.widget.GridView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    GridView coursesGV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coursesGV = findViewById(R.id.idGVCourses);

        ArrayList<Gallary> courseModelArrayList = new ArrayList<Gallary>();
        courseModelArrayList.add(new Gallary("Abhay", R.drawable.abhaya));
        courseModelArrayList.add(new Gallary("Abhijit", R.drawable.abhijit));
        courseModelArrayList.add(new Gallary("Abhishek", R.drawable.abhishek));
        courseModelArrayList.add(new Gallary("Abinash", R.drawable.abinash1));
        courseModelArrayList.add(new Gallary("Aditya", R.drawable.aditya));
        courseModelArrayList.add(new Gallary("Ajay", R.drawable.ajay));
        courseModelArrayList.add(new Gallary("Anima", R.drawable.anima));
        courseModelArrayList.add(new Gallary("Ashutosh", R.drawable.ashutosh));
        courseModelArrayList.add(new Gallary("Atish", R.drawable.atish));
        courseModelArrayList.add(new Gallary("Bhabani", R.drawable.bhabani));
        courseModelArrayList.add(new Gallary("Bhagya", R.drawable.bhagya));
        courseModelArrayList.add(new Gallary("Binod", R.drawable.binod));
        courseModelArrayList.add(new Gallary("Biswajit P.", R.drawable.biswajit));
        courseModelArrayList.add(new Gallary("Biswajit S.", R.drawable.biswajit_sahoo));
        courseModelArrayList.add(new Gallary("Biswaranjan", R.drawable.biswaranjan));
        courseModelArrayList.add(new Gallary("Charanpreet S.", R.drawable.charan1));
        courseModelArrayList.add(new Gallary("Dibya", R.drawable.dibya));
        courseModelArrayList.add(new Gallary("Dipti P.", R.drawable.dipti_p));
        courseModelArrayList.add(new Gallary("Dipti S.", R.drawable.dipti_s));
        courseModelArrayList.add(new Gallary("Jyoti T.", R.drawable.jyoti_t));
        courseModelArrayList.add(new Gallary("Jyoti P.", R.drawable.jyoti_p));
        courseModelArrayList.add(new Gallary("Jyoti R.", R.drawable.jyoti_r));
        courseModelArrayList.add(new Gallary("Krishnasis", R.drawable.krishna));
        courseModelArrayList.add(new Gallary("Linkan", R.drawable.linkan));
        courseModelArrayList.add(new Gallary("Lipsa B.", R.drawable.lipsa_b));
        courseModelArrayList.add(new Gallary("Lipsa S.", R.drawable.lipsa_s));
        courseModelArrayList.add(new Gallary("Manoranjan", R.drawable.manoranjan));
        courseModelArrayList.add(new Gallary("Mrityunjay", R.drawable.mrityunjay));
        courseModelArrayList.add(new Gallary("Mukti", R.drawable.mukti));
        courseModelArrayList.add(new Gallary("Palli", R.drawable.palli));
        courseModelArrayList.add(new Gallary("Pooja", R.drawable.pooja));
        courseModelArrayList.add(new Gallary("Prajwal", R.drawable.prajwal));
        courseModelArrayList.add(new Gallary("Pramoda", R.drawable.pramoda));
        courseModelArrayList.add(new Gallary("Pritismita", R.drawable.pritismita));
        courseModelArrayList.add(new Gallary("Priyabrata", R.drawable.priyabrata));
        courseModelArrayList.add(new Gallary("Pruthvi", R.drawable.prithvi));
        courseModelArrayList.add(new Gallary("Rabinarayan", R.drawable.rabi));
        courseModelArrayList.add(new Gallary("Ragini", R.drawable.ragini));
        courseModelArrayList.add(new Gallary("Rajesh", R.drawable.rajesh));
        courseModelArrayList.add(new Gallary("Rama", R.drawable.rama));
        courseModelArrayList.add(new Gallary("Rati", R.drawable.rati));
        courseModelArrayList.add(new Gallary("Rupen", R.drawable.rupen));
        courseModelArrayList.add(new Gallary("Rutu", R.drawable.rutu));
        courseModelArrayList.add(new Gallary("Sanjeeb", R.drawable.sanjeeb));
        courseModelArrayList.add(new Gallary("Satyam", R.drawable.satyam));
        courseModelArrayList.add(new Gallary("Satyaswaroop", R.drawable.satyaswaroop));
        courseModelArrayList.add(new Gallary("Shailendu", R.drawable.shailendu));
        courseModelArrayList.add(new Gallary("Shasanka", R.drawable.shasanka));
        courseModelArrayList.add(new Gallary("Smidha", R.drawable.smidha));
        courseModelArrayList.add(new Gallary("Snigdha", R.drawable.snigdha));
        courseModelArrayList.add(new Gallary("Soumya", R.drawable.soumya));
        courseModelArrayList.add(new Gallary("Subham", R.drawable.subham));
        courseModelArrayList.add(new Gallary("Subhasis", R.drawable.subhasis));
        courseModelArrayList.add(new Gallary("Sunil", R.drawable.sunil));
        courseModelArrayList.add(new Gallary("Ranjita", R.drawable.ranjita));
        courseModelArrayList.add(new Gallary("Swayamprabha", R.drawable.swayam));
        courseModelArrayList.add(new Gallary("Yoshobanta", R.drawable.yosh));


        GallaryAdapter adapter = new GallaryAdapter(this, courseModelArrayList);
        coursesGV.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}