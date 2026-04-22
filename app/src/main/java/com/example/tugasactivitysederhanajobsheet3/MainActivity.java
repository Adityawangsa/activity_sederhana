package com.example.tugasactivitysederhanajobsheet3;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText inputNim;
    private EditText inputNama;
    private EditText inputKelas;
    private EditText inputIpk;
    private Button button;
    private TextView outputNim;
    private TextView outputNama;
    private TextView outputKelas;
    private TextView outputIpk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        inputNim = findViewById(R.id.nimInput);
        inputNama = findViewById(R.id.namaInput);
        inputKelas = findViewById(R.id.kelasInput);
        inputIpk = findViewById(R.id.ipkInput);

        button = findViewById(R.id.button);

        outputNim = findViewById(R.id.nimView);
        outputNama = findViewById(R.id.namaView);
        outputKelas = findViewById(R.id.kelasView);
        outputIpk = findViewById(R.id.ipkView);

        // Menambahkan listener
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleSubmit();
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    // Fungsi untuk menangani pemindahan teks dari input ke output
    private void handleSubmit() {
        // Mengambil data dari EditText
        String nim = inputNim.getText().toString();
        String nama = inputNama.getText().toString();
        String kelas = inputKelas.getText().toString();
        String ipk = inputIpk.getText().toString();

        // Menampilkan data ke TextView
        outputNim.setText("NIM: " + nim);
        outputNama.setText("Nama: " + nama);
        outputKelas.setText("Kelas: " + kelas);
        outputIpk.setText("IPK: " + ipk);
    }
}