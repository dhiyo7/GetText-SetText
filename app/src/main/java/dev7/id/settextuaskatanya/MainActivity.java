package dev7.id.settextuaskatanya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNama, etAlamat, etNoHp, etPengalaman;
    TextView setNama, setAlamat, setNoHP, setPengalaman, setJurusan, setSyarat;
    Button btnDaftar;
    Spinner spinner;
    String [] jurusan  = {"Teknologi Industri", "Teknologi Pertanian", "Teknologi Kesehatan"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Edit Text*/
        etNama = findViewById(R.id.etNama);
        etAlamat = findViewById(R.id.etAlamat);
        etNoHp = findViewById(R.id.etNoHp);
        etPengalaman = findViewById(R.id.etPengalaman);

        /* Text View */
        setNama =  findViewById(R.id.setNama);
        setAlamat = findViewById(R.id.setAlamat);
        setNoHP = findViewById(R.id.setNoHp);
        setPengalaman = findViewById(R.id.setPengalaman);
        setJurusan = findViewById(R.id.setJurusan);
        setSyarat = findViewById(R.id.setSyarat);

        /* Spinner */
        spinner =  findViewById(R.id.spnJurusan);

        /* Button */
        btnDaftar = findViewById(R.id.btnDaftar);
        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (spinner.getSelectedItem().toString().equals(jurusan[0])){
                    industri();
                }else if (spinner.getSelectedItem().toString().equals(jurusan[1])){
                    pertanian();
                }else if(spinner.getSelectedItem().toString().equals(jurusan[2]));{
                    kesehatan();
                }
            }
        });

        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, R.layout.support_simple_spinner_dropdown_item, jurusan);
        spinner.setAdapter(adapter);
    }

    private void kesehatan() {
        String nama = etNama.getText().toString();
        String alamat = etAlamat.getText().toString();
        String nohp = etNoHp.getText().toString();
        String pengalaman = etPengalaman.getText().toString();
        String jurusan = spinner.getSelectedItem().toString();

        setNama.setText(nama);
        setAlamat.setText(alamat);
        setNoHP.setText(nohp);
        setPengalaman.setText(pengalaman);
        setJurusan.setText(jurusan);
        setSyarat.setText("IPK : 3,2, Berat : 52kg, Fisik : Cukup");
    }

    private void pertanian() {

        String nama = etNama.getText().toString();
        String alamat = etAlamat.getText().toString();
        String nohp = etNoHp.getText().toString();
        String pengalaman = etPengalaman.getText().toString();
        String jurusan = spinner.getSelectedItem().toString();

        setNama.setText(nama);
        setAlamat.setText(alamat);
        setNoHP.setText(nohp);
        setPengalaman.setText(pengalaman);
        setJurusan.setText(jurusan);
        setSyarat.setText("IPK : 3.0, Berat : 45kg, Fisik : Standar");
    }

    private void industri() {

        String nama = etNama.getText().toString();
        String alamat = etAlamat.getText().toString();
        String nohp = etNoHp.getText().toString();
        String pengalaman = etPengalaman.getText().toString();
        String jurusan = spinner.getSelectedItem().toString();

        setNama.setText(nama);
        setAlamat.setText(alamat);
        setNoHP.setText(nohp);
        setPengalaman.setText(pengalaman);
        setJurusan.setText(jurusan);
        setSyarat.setText("IPK : 3.7, Berat : 50kg, Fisik : Tinggi");
    }
}
