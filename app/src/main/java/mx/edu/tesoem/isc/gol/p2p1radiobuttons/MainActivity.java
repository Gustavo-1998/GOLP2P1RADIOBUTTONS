package mx.edu.tesoem.isc.gol.p2p1radiobuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    RadioButton visc, vitics, vambiental, vgastro;
    CheckBox vcasa, vescuela, vtrabajo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        visc = (RadioButton) findViewById(R.id.rbisc);
        vitics = (RadioButton) findViewById(R.id.rbtics);
        vambiental = (RadioButton) findViewById(R.id.rbambiental);
        vgastro = (RadioButton) findViewById(R.id.rbgastro);
        vcasa = (CheckBox) findViewById(R.id.chcasa);
        vescuela = (CheckBox) findViewById(R.id.chescuela);
        vtrabajo = (CheckBox) findViewById(R.id.chtrabajo);

    }

    public void seleccion(View view){
        if (visc.isChecked()) Toast.makeText(this, "INGENIERIA EN SISTEMAS COMPUTACIONALES", Toast.LENGTH_LONG).show();
        if (vitics.isChecked()) Toast.makeText(this, "INGENIERIA EN TECNOLOGIAS DE LA INFORMACION Y LA COMUNICACION", Toast.LENGTH_LONG).show();
        if (vambiental.isChecked()) Toast.makeText(this, "INGENIERIA AMBIENTAL", Toast.LENGTH_LONG).show();
        if (vgastro.isChecked()) Toast.makeText(this, "LIC EN GASTRONOMIA", Toast.LENGTH_LONG).show();
        if (vcasa.isChecked()) Toast.makeText(this, "SELECCIONAS CASA", Toast.LENGTH_LONG).show();
        if (vescuela.isChecked()) Toast.makeText(this, "SELECCIONAS ESCUELA", Toast.LENGTH_LONG).show();
        if (vtrabajo.isChecked()) Toast.makeText(this, "SELECCIONAS TRABAJO", Toast.LENGTH_LONG).show();
    }


}



