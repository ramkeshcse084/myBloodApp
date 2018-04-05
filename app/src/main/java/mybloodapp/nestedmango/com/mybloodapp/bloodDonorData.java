package mybloodapp.nestedmango.com.mybloodapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class bloodDonorData extends AppCompatActivity {
EditText edtDonorName,edtDonorMobileNum,edtDonorDob,edtDonorTimes;
Spinner bloodGroup,Gender;


    private DatabaseReference mDatabase;
Button btnSave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood_donor_data);
        edtDonorDob=(EditText) findViewById(R.id.editTextDob);
        edtDonorMobileNum=(EditText)findViewById(R.id.editTextMobileNum);
        edtDonorName=(EditText)findViewById(R.id.editTextBloodDonorName);
        edtDonorTimes=(EditText)findViewById(R.id.editTextDonortimes);
        bloodGroup=(Spinner)findViewById(R.id.spinnerBloodGrp);
        Gender=(Spinner)findViewById(R.id.spinnerGender);
        btnSave=(Button)findViewById(R.id.buttonSaveData);
        mDatabase = FirebaseDatabase.getInstance().getReference("path"); //Dont pass any path if you want root of t
    }
}
